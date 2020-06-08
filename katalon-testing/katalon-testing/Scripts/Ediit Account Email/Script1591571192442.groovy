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

WebUI.scrollToElement(findTestObject('Page_Account Settings/span_Edit'), 0)

WebUI.click(findTestObject('Page_Account Settings/span_Edit'))

WebUI.scrollToElement(findTestObject('Page_Account Settings/input_New Email_primaryEmail'), 0)

WebUI.setText(findTestObject('Page_Account Settings/input_New Email_primaryEmail'), newEmail)

WebUI.scrollToElement(findTestObject('Page_Account Settings/input_Confirm Email_confirmEmail'), 0)

WebUI.setText(findTestObject('Page_Account Settings/input_Confirm Email_confirmEmail'), confirmEmail)

WebUI.scrollToElement(findTestObject('Page_Account Settings/input_Current Password_currentPassword'), 0)

WebUI.setText(findTestObject('Page_Account Settings/input_Current Password_currentPassword'), password)

WebUI.scrollToElement(findTestObject('Page_Account Settings/button_Save'), 0)

WebUI.click(findTestObject('Page_Account Settings/button_Save'))

WebUI.verifyElementNotPresent(findTestObject('Page_Account Settings/label_Client error'), 1)

WebUI.verifyElementNotPresent(findTestObject('Page_Account Settings/label_Server error'), 1)

WebUI.closeBrowser()

