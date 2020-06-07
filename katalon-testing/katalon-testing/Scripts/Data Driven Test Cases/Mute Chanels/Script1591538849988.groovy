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

WebUI.scrollToElement(findTestObject('Page_ RenameChanel/span_123'), 0)

WebUI.click(findTestObject('Page_ Edit Chanels/span_Town Square_channelHeaderDropdownIcon'))

WebUI.click(findTestObject('Page_ Edit Chanels/span_Mute Channel'))

switch(
	WebUI.verifyElementPresent(findTestObject('Page_ Edit Chanels/i_Town Square_icon fa fa-bell-slash-o'), 
	    1)
)	{
	case false: return false;
	default: break;
}

WebUI.click(findTestObject('Page_ Edit Chanels/span_Town Square_channelHeaderDropdownIcon'))

WebUI.click(findTestObject('Page_ Edit Chanels/span_Unmute Channel'))

WebUI.verifyElementNotPresent(findTestObject('Page_ Edit Chanels/i_Town Square_icon fa fa-bell-slash-o'), 
    1)

WebUI.closeBrowser()

