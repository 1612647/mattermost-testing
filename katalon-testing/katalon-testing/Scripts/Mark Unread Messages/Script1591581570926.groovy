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

WebUI.click(findTestObject('Page_Town Square - aa Mattermost/span_rebeccaruiz'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_rebeccaruiz - aa Mattermost/p_consequatur aperiam magni dicta hic saepe_95a2e1'), 
    0)

WebUI.mouseOver(findTestObject('Page_rebeccaruiz - aa Mattermost/p_quo repellendus aut explicabo reiciendis _aafcad'))

WebUI.click(findTestObject('Page_rebeccaruiz - aa Mattermost/button__CENTER_button_cp876yttnigi9xgkr7qwjnszsa'))

WebUI.click(findTestObject('Page_rebeccaruiz - aa Mattermost/span_Mark as Unread'))

WebUI.verifyElementPresent(findTestObject('Page_(3)  rebeccaruiz - aa Mattermost/div_11 new messages since Thu Jun 04 at 2232'), 
    0)

WebUI.closeBrowser()

