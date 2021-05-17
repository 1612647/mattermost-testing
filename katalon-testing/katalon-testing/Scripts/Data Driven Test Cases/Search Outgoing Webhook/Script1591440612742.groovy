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

WebUI.scrollToElement(findTestObject('Page_Search Outgoing Webhook/button_user-1_style--none sidebar-header-dr_eabf2e'), 
    0)

WebUI.click(findTestObject('Page_Search Outgoing Webhook/button_user-1_style--none sidebar-header-dr_eabf2e'))

WebUI.click(findTestObject('Page_Search Outgoing Webhook/span_Integrations'))

WebUI.click(findTestObject('Page_Search Outgoing Webhook/a_Outgoing WebhooksOutgoing webhooks allow _ccf99f'))

WebUI.setText(findTestObject('Page_Search Outgoing Webhook/input_Add Outgoing Webhook_searchInput'), keyword)

WebUI.verifyElementPresent(findTestObject('Page_Search Outgoing Webhook/span_No outgoing webhooks match d'), 0)

WebUI.closeBrowser()

