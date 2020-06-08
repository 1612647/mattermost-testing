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

List<TestObject> status = [findTestObject('Page_Switch Online Status/span_Away'), findTestObject(
        'Object Repository/Page_Town Square - aa Mattermost/span_Do Not Disturb'), findTestObject('Page_Switch Online Status/span_Offline')
    , findTestObject('Page_Switch Online Status/span_Online')]

WebUI.callTestCase(findTestCase('Data Driven Test Cases/User Login'), [('unameOrEmail') : 'user-1', ('password') : 'SampleUs@r-1'], 
    FailureHandling.STOP_ON_FAILURE)

for (int i = 0; i < 4; i++) {
    WebUI.click(findTestObject('Page_Switch Online Status/img__Avatar Avatar-lg'))

    WebUI.click(status[i])

	WebUI.verifyElementNotPresent(findTestObject('Page_Switch Online Status/ul_OnlineAwayDo Not DisturbDisables desktop_fd3496'), 
    0)

    Thread.sleep(1000)
}

WebUI.closeBrowser()

