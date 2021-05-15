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

WebUI.callTestCase(findTestCase('User Login'), [('unameOrEmail') : 'user-1', ('password') : 'SampleUs@r-1'], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Page_ RenameChanel/span_123'), 0)

WebUI.click(findTestObject('Page_ RenameChanel/span_123'))

WebUI.click(findTestObject('Page_ RenameChanel/span_Rename Channel'))

WebUI.setText(findTestObject('Page_ RenameChanel/input_Display Name_display_name'), name)

WebUI.click(findTestObject('Page_ RenameChanel/span_Save'))

WebUI.verifyElementNotPresent(findTestObject('Page_ RenameChanel/label_This field is required'), 0)

WebUI.closeBrowser()

