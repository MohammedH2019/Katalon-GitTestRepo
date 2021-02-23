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

WebUI.click(findTestObject('Object Repository/P_USE/30/Page_Bluuu -/a_'))

WebUI.click(findTestObject('Object Repository/P_USE/30/Page_Bluuu/svg__vc-svg-icon'))

WebUI.click(findTestObject('Object Repository/P_USE/30/Page_Bluuu/svg__vc-svg-icon'))

WebUI.click(findTestObject('Object Repository/P_USE/30/Page_Bluuu/svg__vc-svg-icon'))

WebUI.click(findTestObject('Object Repository/P_USE/30/Page_Bluuu/svg__vc-svg-icon'))

WebUI.click(findTestObject('Object Repository/P_USE/30/Page_Bluuu/svg__vc-svg-icon'))

WebUI.click(findTestObject('Object Repository/P_USE/30/Page_Bluuu/svg__vc-svg-icon'))

WebUI.click(findTestObject('Object Repository/P_USE/30/Page_Bluuu/svg__vc-svg-icon'))

WebUI.click(findTestObject('Object Repository/P_USE/30/Page_Bluuu/svg__vc-svg-icon'))

WebUI.click(findTestObject('Object Repository/P_USE/30/Page_Bluuu/svg__vc-svg-icon'))

WebUI.click(findTestObject('Object Repository/P_USE/30/Page_Bluuu/svg__vc-svg-icon'))

WebUI.click(findTestObject('Object Repository/P_USE/30/Page_Bluuu/svg__vc-svg-icon'))

WebUI.click(findTestObject('Object Repository/P_USE/30/Page_Bluuu/span_1'))

WebUI.click(findTestObject('Object Repository/P_USE/30/Page_Bluuu/div__arrow-down'))

WebUI.click(findTestObject('Object Repository/P_USE/30/Page_Bluuu/li_0600'))

WebUI.setText(findTestObject('Object Repository/P_USE/30/Page_Bluuu/input____BVID__185'), 'to')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/P_USE/30/Page_Bluuu/div_Town in Town Village'))

WebUI.click(findTestObject('Object Repository/P_USE/30/Page_Bluuu/div__arrow-down_1'))

WebUI.click(findTestObject('Object Repository/P_USE/30/Page_Bluuu/li_ 1'))

WebUI.click(findTestObject('Object Repository/P_USE/30/Page_Bluuu/div__arrow-down_1_2'))

WebUI.click(findTestObject('Object Repository/P_USE/30/Page_Bluuu/li_2'))

WebUI.click(findTestObject('Object Repository/P_USE/30/Page_Bluuu/div__arrow-down_1_2_3'))

WebUI.click(findTestObject('Object Repository/P_USE/30/Page_Bluuu/li_'))

WebUI.click(findTestObject('Object Repository/P_USE/30/Page_Bluuu/span_'))

WebUI.click(findTestObject('Object Repository/P_USE/30/Page_Bluuu/button_'))

text = WebUI.getText(findTestObject('Object Repository/P_USE/30/Page_Bluuu/p_  ()'))

if (text == 'จำนวนแม่บ้านที่ให้บริการในช่วงเวลาที่คุณเลือกมีจำกัด แต่เราจะพยายามอย่างเต็มที่เพื่อหาแม่บ้านที่ดีสำหรับคุณ! (ข้อความนี้เป็นเพียงการแจ้งสถานะเพื่อทราบเท่านั้น)') {
    System.out.println('CORRECT')

    WebUI.click(findTestObject('Object Repository/P_USE/30/Page_Bluuu/button__1'))

    WebUI.closeBrowser()
} else {
    KeywordUtil.markFailed('')
}

