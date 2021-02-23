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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://uat.bluuu.co/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('P_USE/20/Page_Bluuu -/a_'))

WebUI.click(findTestObject('Used/zElement-Bluuu/svg_NextMonth'))

WebUI.click(findTestObject('P_USE/20/Page_Bluuu/span_31'))

WebUI.click(findTestObject('P_USE/20/Page_Bluuu/div__arrow-down'))

WebUI.click(findTestObject('P_USE/20/Page_Bluuu/li_0600'))

WebUI.setText(findTestObject('P_USE/20/Page_Bluuu/input____BVID__185'), 'to')

WebUI.delay(2)

WebUI.click(findTestObject('P_USE/20/Page_Bluuu/div_Town in Town Village'))

WebUI.click(findTestObject('P_USE/20/Page_Bluuu/div__arrow-down_1'))

WebUI.click(findTestObject('P_USE/20/Page_Bluuu/li_ 1'))

WebUI.click(findTestObject('P_USE/20/Page_Bluuu/div__arrow-down_1_2'))

WebUI.click(findTestObject('P_USE/20/Page_Bluuu/li_2'))

WebUI.click(findTestObject('P_USE/20/Page_Bluuu/div__arrow-down_1_2_3'))

WebUI.click(findTestObject('P_USE/20/Page_Bluuu/li_'))

WebUI.click(findTestObject('P_USE/20/Page_Bluuu/label_'))

WebUI.click(findTestObject('P_USE/20/Page_Bluuu/label__1'))

WebUI.setText(findTestObject('P_USE/20/Page_Bluuu/textarea____BVID__200'), 'ok kub ok')

WebUI.click(findTestObject('P_USE/20/Page_Bluuu/span_'))

WebUI.verifyElementClickable(findTestObject('P_USE/20/Page_Bluuu/button_'))

WebUI.back()

WebUI.click(findTestObject('P_USE/20/Page_Bluuu -/a_'))

if (WebUI.verifyElementNotClickable(findTestObject('P_USE/20/Page_Bluuu/button_'))) {
    WebUI.closeBrowser()
} else {
    KeywordUtil.markFailed('')
}

