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

WebUI.click(findTestObject('Page_ Edit Messanges/span_rebeccaruiz'))

WebUI.mouseOver(findTestObject('Page_ Edit Messanges/div_user-10605a odit suscipit natus repelle_abdd3b'))

WebUI.click(findTestObject('Page_ Edit Messanges/button__CENTER_button_zwpp6nqixid9p83869be5njxey'))

WebUI.click(findTestObject('Page_ Edit Messanges/span_Edit (1)'))

WebUI.setText(findTestObject('Page_ Edit Messanges/textarea_a odit suscipit natus repellendus _7adb88'), 
    'Edit this text')

WebUI.click(findTestObject('Object Repository/Page_ Edit Messanges/span_Save'))

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Page_ Edit Messanges/div_CloseEdit PostHello everyonefgdfgHello _b57256_1'), 
    1)

WebUI.closeBrowser()

