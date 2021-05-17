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

WebUI.scrollToElement(findTestObject('Page_AddSlashCommands/button_user-1_style--none sidebar-header-dr_eabf2e'), 0)

WebUI.click(findTestObject('Page_AddSlashCommands/button_user-1_style--none sidebar-header-dr_eabf2e'))

WebUI.scrollToElement(findTestObject('Page_AddSlashCommands/span_Integrations'), 0)

WebUI.click(findTestObject('Page_AddSlashCommands/span_Integrations'))

WebUI.scrollToElement(findTestObject('Page_AddSlashCommands/a_Slash CommandsSlash commands send events _dfa42d'), 0)

WebUI.click(findTestObject('Page_AddSlashCommands/a_Slash CommandsSlash commands send events _dfa42d'))

WebUI.scrollToElement(findTestObject('Page_AddSlashCommands/span_Add Slash Command'), 0)

WebUI.click(findTestObject('Page_AddSlashCommands/span_Add Slash Command'))

WebUI.scrollToElement(findTestObject('Page_AddSlashCommands/input_Title_displayName'), 0)

WebUI.setText(findTestObject('Page_AddSlashCommands/input_Title_displayName'), title)

WebUI.scrollToElement(findTestObject('Page_AddSlashCommands/input_Description_description'), 0)

WebUI.setText(findTestObject('Page_AddSlashCommands/input_Description_description'), description)

WebUI.scrollToElement(findTestObject('Page_AddSlashCommands/input_Command Trigger Word_trigger'), 0)

WebUI.setText(findTestObject('Page_AddSlashCommands/input_Command Trigger Word_trigger'), word)

WebUI.scrollToElement(findTestObject('Page_AddSlashCommands/input_Request URL_url'), 0)

WebUI.setText(findTestObject('Page_AddSlashCommands/input_Request URL_url'), reqUrl)

WebUI.scrollToElement(findTestObject('Page_AddSlashCommands/select_POSTGET'), 0)

switch (postGet) {
    case 'G':
        WebUI.selectOptionByValue(findTestObject('Page_AddSlashCommands/select_POSTGET'), 'G', true)

        break
    case 'P':
        WebUI.selectOptionByValue(findTestObject('Page_AddSlashCommands/select_POSTGET'), 'P', true)

        break
    default:
        WebUI.selectOptionByValue(findTestObject('Page_AddSlashCommands/select_POSTGET'), 'P', true)

        return null
}

WebUI.scrollToElement(findTestObject('Page_AddSlashCommands/input_Response Username_username'), 0)

WebUI.setText(findTestObject('Page_AddSlashCommands/input_Response Username_username'), resUname)

if (autoComp == 'true') {
    WebUI.scrollToElement(findTestObject('Page_AddSlashCommands/input_Autocomplete_autocomplete'), 0)

    WebUI.click(findTestObject('Page_AddSlashCommands/input_Autocomplete_autocomplete'))

    WebUI.scrollToElement(findTestObject('Page_AddSlashCommands/input_Autocomplete Hint_autocompleteHint'), 0)

    WebUI.setText(findTestObject('Page_AddSlashCommands/input_Autocomplete Hint_autocompleteHint'), hint)
}

WebUI.scrollToElement(findTestObject('Page_AddSlashCommands/span_Save'), 0)

WebUI.click(findTestObject('Page_AddSlashCommands/span_Save'))

Thread.sleep(1000)

WebUI.verifyElementNotPresent(findTestObject('Page_AddSlashCommands/label_This trigger word is already in use Please choose another word'), 
    1)

WebUI.verifyElementNotPresent(findTestObject('Page_AddSlashCommands/label_A trigger word is required'), 1)

WebUI.closeBrowser()

