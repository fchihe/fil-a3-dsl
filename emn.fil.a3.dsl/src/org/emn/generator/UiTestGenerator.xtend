/*
 * generated by Xtext 2.10.0
 */
package org.emn.generator

import java.io.File
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.emn.uiTest.Click
import org.emn.uiTest.Command
import org.emn.uiTest.Fill
import org.emn.uiTest.FunctionCall
import org.emn.uiTest.GoOn
import org.emn.uiTest.Open
import org.emn.uiTest.Parameter
import org.emn.uiTest.Select
import org.emn.uiTest.Selector
import org.emn.uiTest.Store
import org.emn.uiTest.UiTest
import org.emn.uiTest.VariableDefinition
import org.emn.uiTest.Verify

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class UiTestGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		fsa.generateFile('browserAutomation'+File.separator+'Main.java', 
			//resource.allContents.toIterable.filter(Calendar).head.generateCalendar
			resource.contents.filter(UiTest).head.generateUiTest
		);
	}
	
	def generateUiTest(UiTest uiTest) '''
		package browserAutomation;
		import java.io.File;
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.firefox.FirefoxDriver;
		import org.openqa.selenium.support.ui.Select;
		class Main {
				public static WebDriver driver;
				public static void main(String[] args) {
					�FOR c : uiTest.commands�
						�c.generateCommand�
					�ENDFOR�
				}
				�FOR f : uiTest.functions�
				public static void �f.name.name�(�FOR param : f.parameters�String �param.name��IF f.parameters.indexOf(param) != f.parameters.length-1�, �ENDIF��ENDFOR�) {
					�FOR c: f.statements�
						�c.generateCommand�
					�ENDFOR�
				}
				�ENDFOR�
			}
	'''
	
	def generateCommand(Command c) '''
		�switch c {
			Click: c.generateClick
			Open: c.generateOpen
			GoOn: c.generateGoOn
			Fill : c.generateFill
			Verify: c.generateVerify
			Store: c.generateStore
			Select: c.generateSelect
			FunctionCall: c.generateFunctionCall
			}�
	'''
	def generateFunctionCall(FunctionCall fc) '''
		�fc.name.name�(�FOR param : fc.parameters��param.generateParam��IF fc.parameters.indexOf(param) != fc.parameters.length-1�, �ENDIF��ENDFOR�);
	'''
	
	def generateParam(Parameter p) '''�IF p.string != null�"�p.string�"�ELSE��p.variable.name��ENDIF�'''
	def generateSelect(Select s) '''
		new Select(driver.findElement(By.xpath("�s.selector.generateSelector�"))).selectByVisibleText(�generateValue(s.stringValue, s.keyValue)�);
	'''
	
	def generateClick(Click c) '''
		driver.findElement(By.xpath("�c.selector.generateSelector�")).click();
	'''
	
	def generateSelector(Selector s) '''�IF s.attributeName.equals("text")�//*[contains(text(), '�s.attributeValue�')]�ELSE�//*[@�s.attributeName�=\"�s.attributeValue�\"]�ENDIF�'''
	
	def generateOpen(Open o) '''
		File file = new File("�o.driverPath�");
		System.setProperty("webdriver.�IF o.program.equals("chrome")�chrome�ELSE�gecko�ENDIF�.driver", file.getAbsolutePath() );
		driver = new �IF o.program.equals("chrome")�Chrome�ELSE�Firefox�ENDIF�Driver();
	'''
	
	def generateGoOn(GoOn g) '''
		driver.get("�g.address�");
	'''
	
	def generateFill(Fill f) '''
		driver.findElement(By.xpath("�f.selector.generateSelector�")).sendKeys(�generateValue(f.stringValue, f.keyValue)�);
	'''
	
	def generateValue(String stringValue, VariableDefinition variableDefinition) '''�IF stringValue != null�"�stringValue�"�ELSE��variableDefinition.name��ENDIF�'''
	def generateVerify(Verify v) '''
		System.out.println(driver.findElement(By.xpath("�v.selector.generateSelector�")).getText().contains("�v.comparison�") ? "�v.selector.attributeValue� contains �v.comparison�" : "�v.selector.attributeValue� does not contain �v.comparison�");
	'''
	
	def generateStore(Store s) '''
		String �s.key.name� = driver.findElement(By.xpath("�s.selector.generateSelector�")).getText();
	'''
}
