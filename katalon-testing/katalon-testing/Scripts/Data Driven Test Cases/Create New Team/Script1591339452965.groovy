import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Data Driven Test Cases/User Login'), [('unameOrEmail') : 'user-1', ('password') : 'SampleUs@r-1'], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Page_Craate_New_Team/div_'), 0)

WebUI.click(findTestObject('Page_Craate_New_Team/div_'))

WebUI.setText(findTestObject('Page_Craate_New_Team/input_Team Name_teamNameInput'), name)

WebUI.click(findTestObject('Page_Craate_New_Team/span_Next'))

WebUI.verifyElementNotPresent(findTestObject('Page_Craate_New_Team/label_This field is required_1'), 1)

WebUI.setText(findTestObject('Page_Craate_New_Team/input_httplocalhost8065_teamURLInput'), url)

WebUI.click(findTestObject('Page_Craate_New_Team/span_Finish'))

WebUI.verifyElementNotPresent(findTestObject('Page_Craate_New_Team/label_This field is required_2'), 1)

