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

WebUI.callTestCase(findTestCase('Add Direct Messages'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Page_Remove Direct Messages/a_3'), 1)

//String removeItemId = WebUI.getAttribute(findTestObject('Page_Remove Direct Messages/a_3'), 'id')

WebUI.mouseOver(findTestObject('Page_Remove Direct Messages/a_3'))

WebUI.click(findTestObject('Page_Remove Direct Messages/btn_close_newItem'))

//String newActiveId = WebUI.getAttribute(findTestObject('Page_Remove Direct Messages/a_3'), 'id')

WebUI.verifyElementNotPresent(findTestObject('Page_Remove Direct Messages/a_3'), 0)

WebUI.closeBrowser()

