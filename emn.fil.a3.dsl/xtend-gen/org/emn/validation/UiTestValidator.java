/**
 * generated by Xtext 2.10.0
 */
package org.emn.validation;

import java.util.ArrayList;
import java.util.HashMap;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.validation.Check;
import org.emn.uiTest.Command;
import org.emn.uiTest.Fill;
import org.emn.uiTest.Function;
import org.emn.uiTest.FunctionCall;
import org.emn.uiTest.Parameter;
import org.emn.uiTest.Select;
import org.emn.uiTest.Store;
import org.emn.uiTest.UiTest;
import org.emn.uiTest.UiTestPackage;
import org.emn.uiTest.VariableDefinition;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class UiTestValidator extends AbstractUiTestValidator {
	HashMap<String, Integer> functionParams;
	@Check
	public void checkFunctions(UiTest uitest){
		functionParams = new HashMap<String, Integer>();
		ArrayList<String> innerCommandVariables;
		for(Function function: uitest.getFunctions()) {
			innerCommandVariables = new ArrayList<String>();
			for(VariableDefinition param: function.getParameters()) {
				innerCommandVariables.add(param.getName());
			}
			String functionName = function.getName().getName();
			System.out.println("Checking "+functionName+"...");
			// save number of parameters of function
			functionParams.put(functionName, function.getParameters().size());
			for (Command command: function.getStatements()) {
				System.out.println(command.getClass());
				if (command instanceof Store) {
					Store myStore = (Store) command;
					String storeVar = myStore.getKey().getName();
					this.checkStoreVarIsUnique(innerCommandVariables, myStore, storeVar);
					innerCommandVariables.add(storeVar);
				}  else if(command instanceof FunctionCall) {
					FunctionCall myFunctionCall = (FunctionCall) command;
					this.checkFunctionCallParametersNumber(myFunctionCall);
					for(Parameter param:myFunctionCall.getParameters()) {
						System.out.println("Available variables : "+innerCommandVariables.toArray().toString());
						String paramName = param.getVariable() != null ? param.getVariable().getName() : param.getString();
						this.checkFunctionCallParamVarIsDefined(param, innerCommandVariables, paramName, myFunctionCall);
					}
				} else if (command instanceof Fill) {
					System.out.println("Available variables2 : "+innerCommandVariables.toArray().toString());
					Fill myFill = (Fill) command;
					VariableDefinition var = myFill.getKeyValue();
					if(var != null) {
						this.checkVarIsDefined(var, innerCommandVariables, myFill, null);
					}
				} else if (command instanceof Select) {
					Select mySelect = (Select) command;
					VariableDefinition var = mySelect.getKeyValue();
					if(var != null) {
						this.checkVarIsDefined(var, innerCommandVariables, null, mySelect);
					}
				}
			}
		}
	}
	
	@Check
	public void checkCommands(UiTest uitest) {
		ArrayList<String> commandVariables = new ArrayList<String>();
		for(Command command : uitest.getCommands()) {
			if(command instanceof Store) { // check store variable is unique
				Store myStore = (Store) command;
				String storeVar = myStore.getKey().getName();
				this.checkStoreVarIsUnique(commandVariables, myStore, storeVar);
				commandVariables.add(storeVar);
			} else if(command instanceof FunctionCall) {
				FunctionCall myFunctionCall = (FunctionCall) command;
				this.checkFunctionCallParametersNumber(myFunctionCall);
				for(Parameter param:myFunctionCall.getParameters()) {
					String paramName = param.getVariable() != null ? param.getVariable().getName() : param.getString();
					this.checkFunctionCallParamVarIsDefined(param, commandVariables, paramName, myFunctionCall);
				}
			}  else if (command instanceof Fill) {
				Fill myFill = (Fill) command;
				VariableDefinition var = myFill.getKeyValue();
				if(var != null) {
					this.checkVarIsDefined(var, commandVariables, myFill, null);
				}
			} else if (command instanceof Select) {
				Select mySelect = (Select) command;
				VariableDefinition var = mySelect.getKeyValue();
				if(var != null) {
					this.checkVarIsDefined(var, commandVariables, null, mySelect);
				}
			}
		}
	}
	
	private void checkFunctionCallParametersNumber(FunctionCall myFunctionCall) {
		String functionName = myFunctionCall.getName().getName();
		int currentParamNumber = myFunctionCall.getParameters().size();
		int expectedParamNumber = functionParams.get(functionName);
		if(expectedParamNumber != currentParamNumber){
			error("Function "+functionName+" expected "+expectedParamNumber+" parameter(s), found "+currentParamNumber, myFunctionCall, UiTestPackage.Literals.FUNCTION_CALL__PARAMETERS);
		}
	}
	private void checkStoreVarIsUnique(ArrayList<String> commandVariables, Store myStore, String storeVar){
		if(commandVariables.contains(storeVar)) {
			error("The variable "+storeVar+" is already used, please name it differently", myStore, UiTestPackage.Literals.STORE__KEY);
		}
	}
	
	private void checkFunctionCallParamVarIsDefined(Parameter param, ArrayList<String> commandVariables, String paramName, FunctionCall myFunctionCall) {
		if(param.getVariable() != null && !commandVariables.contains(paramName)) {
			error("Parameter "+paramName+" can't be used here, it was not declared before", myFunctionCall, UiTestPackage.Literals.FUNCTION_CALL__PARAMETERS);
		}
	}
	
	private void checkVarIsDefined(VariableDefinition var, ArrayList<String> innerCommandVariables, Fill fill, Select select) {
		String varName = var.getName();
		if(!innerCommandVariables.contains(varName)) {
			Command command;
			EReference literal;
			if(fill != null) {
				command = fill;
				literal = UiTestPackage.Literals.FILL__KEY_VALUE;
			} else {
				command = select;
				literal = UiTestPackage.Literals.SELECT__KEY_VALUE;
			}
			error("Variable "+varName+" can't be used here, it was not declared before", command, literal);
		}
	}
}
