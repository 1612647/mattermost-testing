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

WebUI.callTestCase(findTestCase('Data Driven Test Cases/User Login'), [('unameOrEmail') : 'user-1', ('password') : 'SampleUs@r-1'], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Page_Create_Chanel/btn_Add private chanels'), 0)

WebUI.click(findTestObject('Page_Create_Chanel/btn_Add private chanels'))

if (isPublic == 'true') {
    WebUI.click(findTestObject('Page_Create_Chanel/div_Public - Anyone can join this channel'))
} else if (isPublic == 'false') {
    WebUI.click(findTestObject('Page_Create_Chanel/div_Private - Only invited members can join_72d93f'))
}

WebUI.setText(findTestObject('Page_Create_Chanel/input_Name_newChannelName'), name)

WebUI.setText(findTestObject('Page_Create_Chanel/textarea_(optional)_newChannelPurpose'), purpose)

WebUI.setText(findTestObject('Page_Create_Chanel/textarea_(optional)_newChannelHeader'), header)

WebUI.scrollToElement(findTestObject('Page_Create_Chanel/span_Create Channel'), 0)

WebUI.click(findTestObject('Page_Create_Chanel/span_Create Channel'))

WebUI.verifyElementNotPresent(findTestObject('Page_Create_Chanel/p_A channel with that name already exists on the same team'), 
    1)

WebUI.verifyElementNotPresent(findTestObject('Page_Create_Chanel/span_Channel name must be 2 or more characters'), 1)

WebUI.closeBrowser()

