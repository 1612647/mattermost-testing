import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.googlecode.javacv.cpp.swscale as swscale
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

WebUI.scrollToElement(findTestObject('Page_AddOutgoingWebhook/button_user-1_style--none sidebar-header-dr_eabf2e'), 0)

WebUI.click(findTestObject('Page_AddOutgoingWebhook/button_user-1_style--none sidebar-header-dr_eabf2e'))

WebUI.scrollToElement(findTestObject('Page_AddOutgoingWebhook/span_Integrations'), 0)

WebUI.click(findTestObject('Page_AddOutgoingWebhook/span_Integrations'))

WebUI.scrollToElement(findTestObject('Page_AddOutgoingWebhook/a_Outgoing WebhooksOutgoing webhooks allow _ccf99f'), 0)

WebUI.click(findTestObject('Page_AddOutgoingWebhook/a_Outgoing WebhooksOutgoing webhooks allow _ccf99f'))

WebUI.scrollToElement(findTestObject('Page_AddOutgoingWebhook/span_Add Outgoing Webhook'), 0)

WebUI.click(findTestObject('Page_AddOutgoingWebhook/span_Add Outgoing Webhook'))

WebUI.scrollToElement(findTestObject('Page_AddOutgoingWebhook/input_Title_displayName'), 0)

WebUI.setText(findTestObject('Page_AddOutgoingWebhook/input_Title_displayName'), title)

WebUI.scrollToElement(findTestObject('Page_AddOutgoingWebhook/input_Description_description'), 0)

WebUI.setText(findTestObject('Page_AddOutgoingWebhook/input_Description_description'), description)

WebUI.scrollToElement(findTestObject('Page_AddOutgoingWebhook/select_--- Select a channel ---Off-TopicPub_c22433'), 0)

WebUI.selectOptionByIndex(findTestObject('Page_AddOutgoingWebhook/select_--- Select a channel ---Off-TopicPub_c22433'),
	1)


switch (contentType) {
    case 'form':
        WebUI.selectOptionByIndex(findTestObject('Page_AddOutgoingWebhook/select_applicationx-www-form-urlencodedappl_e429fe'), 
            0)
        break
    case 'json':
        WebUI.selectOptionByIndex(findTestObject('Page_AddOutgoingWebhook/select_applicationx-www-form-urlencodedappl_e429fe'), 
            1)

        break
    default:
        WebUI.selectOptionByIndex(findTestObject('Page_AddOutgoingWebhook/select_--- Select a channel ---Off-TopicPub_c22433'), 
            0)
}

WebUI.scrollToElement(findTestObject('Page_AddOutgoingWebhook/textarea_Trigger Words (One Per Line)_triggerWords'), 0)

WebUI.setText(findTestObject('Page_AddOutgoingWebhook/textarea_Trigger Words (One Per Line)_triggerWords'), words)

WebUI.scrollToElement(findTestObject('Page_AddOutgoingWebhook/textarea_Callback URLs (One Per Line)_callbackUrls'), 0)

WebUI.setText(findTestObject('Page_AddOutgoingWebhook/textarea_Callback URLs (One Per Line)_callbackUrls'), callbackUrl)

WebUI.scrollToElement(findTestObject('Page_AddOutgoingWebhook/span_Save'), 0)

WebUI.click(findTestObject('Page_AddOutgoingWebhook/span_Save'))

WebUI.verifyElementNotPresent(findTestObject('Page_AddOutgoingWebhook/label_A valid channel or a list of trigger _c99199'), 
    1)

WebUI.scrollToElement(findTestObject('Page_AddOutgoingWebhook/span_Done'), 0)

WebUI.click(findTestObject('Page_AddOutgoingWebhook/span_Done'))

WebUI.closeBrowser()

