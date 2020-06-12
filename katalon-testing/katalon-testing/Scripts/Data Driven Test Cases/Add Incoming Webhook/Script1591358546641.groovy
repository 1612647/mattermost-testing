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

WebUI.scrollToElement(findTestObject('Page_AddIncomingWebhook/button_user-1_style--none sidebar-header-dr_eabf2e'), 0)

WebUI.click(findTestObject('Page_AddIncomingWebhook/button_user-1_style--none sidebar-header-dr_eabf2e'))

WebUI.scrollToElement(findTestObject('Page_AddIncomingWebhook/span_Integrations'), 0)

WebUI.click(findTestObject('Page_AddIncomingWebhook/span_Integrations'))

WebUI.scrollToElement(findTestObject('Page_AddIncomingWebhook/a_Incoming WebhooksIncoming webhooks allow _f6560d'), 0)

WebUI.click(findTestObject('Page_AddIncomingWebhook/a_Incoming WebhooksIncoming webhooks allow _f6560d'))

WebUI.scrollToElement(findTestObject('Page_AddIncomingWebhook/button_Add Incoming Webhook'), 0)

WebUI.click(findTestObject('Page_AddIncomingWebhook/button_Add Incoming Webhook'))

WebUI.setText(findTestObject('Page_AddIncomingWebhook/input_Title_displayName'), title)

WebUI.setText(findTestObject('Page_AddIncomingWebhook/input_Description_description'), description)

WebUI.selectOptionByIndex(findTestObject('Page_AddIncomingWebhook/select_--- Select a channel ---Off-TopicPub_c22433'), 
    1, FailureHandling.STOP_ON_FAILURE)

if (isLock == 'true') {
    WebUI.scrollToElement(findTestObject('Page_AddIncomingWebhook/input_Lock to this channel_channelLocked'), 0)

    WebUI.click(findTestObject('Page_AddIncomingWebhook/input_Lock to this channel_channelLocked'))
}

WebUI.scrollToElement(findTestObject('Page_AddIncomingWebhook/span_Save'), 0)

WebUI.click(findTestObject('Page_AddIncomingWebhook/span_Save'))

WebUI.verifyElementNotPresent(findTestObject('Page_AddIncomingWebhook/label_A valid channel is required'), 1)

WebUI.scrollToElement(findTestObject('Page_AddIncomingWebhook/span_Done'), 0)

WebUI.click(findTestObject('Page_AddIncomingWebhook/span_Done'))

WebUI.closeBrowser()

