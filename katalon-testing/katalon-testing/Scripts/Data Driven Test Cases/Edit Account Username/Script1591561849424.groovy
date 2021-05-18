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

WebUI.callTestCase(findTestCase('Data Driven Test Cases/User Login'), [('unameOrEmail') : 'user-1', ('password') : 'SampleUs@r-1'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Account Settings/button_user-1_style--none sidebar-header-dr_eabf2e'))

WebUI.click(findTestObject('Page_Account Settings/span_Account Settings'))

WebUI.click(findTestObject('Page_Account Settings/div_UsernameEdituser-1'))

WebUI.setText(findTestObject('Page_Account Settings/input_Username_username'), username)

WebUI.click(findTestObject('Page_Account Settings/span_Save'))

WebUI.verifyElementNotPresent(findTestObject('Page_Account Settings/label_Username must begin with a letter and contain between 3 to 22 lowercase characters made up of numbers letters and the symbo'), 
    1, FailureHandling.STOP_ON_FAILURE)

//def text = WebUI.getText(findTestObject('Page_Account Settings/div_user-1'))
//WebUI.verifyMatch(text, username, false, FailureHandling.STOP_ON_FAILURE)
WebUI.closeBrowser()

