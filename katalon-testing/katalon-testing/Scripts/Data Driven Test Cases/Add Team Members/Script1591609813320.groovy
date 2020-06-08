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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.callTestCase(findTestCase('Data Driven Test Cases/User Login'), [('unameOrEmail') : 'user-1', ('password') : 'SampleUs@r-1'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Team_1/button_user-1_style--none sidebar-header-dr_eabf2e'))

WebUI.click(findTestObject('Page_Team_1/button_Invite PeopleAdd or invite people to_5d2fc4'))

WebUI.click(findTestObject('Page_Team_1/div_Add members'))

WebUI.scrollToElement(findTestObject('Page_Team_1/input_Add members_react-select-2-input'), 
    0)

WebUI.setText(findTestObject('Page_Team_1/input_Add members_react-select-2-input'), 
    keyword)

//if (WebUI.verifyElementPresent(findTestObject('Page_Team_1/div_'), 5, FailureHandling.STOP_ON_FAILURE) == 
//true) {
WebUI.sendKeys(findTestObject('Page_Team_1/input_Add members_react-select-2-input'), 
    Keys.chord(Keys.ENTER))

if (WebUI.verifyElementNotHasAttribute(findTestObject('Page_Team_1/button_Invite Members'), 
    'disabled', 0, FailureHandling.CONTINUE_ON_FAILURE) == true) {
    WebUI.click(findTestObject('Page_Team_1/button_Invite Members'))

    WebUI.click(findTestObject('Page_Team_1/span_Done'))

    WebUI.verifyElementNotPresent(findTestObject('Page_Team_1/div_Members Invited to Chanel11 person has _780ec7'), 
        0)
}

//} else {
//    WebUI.closeBrowser()
//}
WebUI.closeBrowser()

