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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://uat.bluuu.co/')

WebUI.click(findTestObject('Object Repository/By Case/17/Page_Bluuu -/img_TH_avatar order-3 order-xl-4 ml-4 mt-1'))

WebUI.click(findTestObject('Object Repository/By Case/17/Page_Bluuu -/button_ Facebook'))

WebUI.switchToWindowTitle('Facebook')

WebUI.setText(findTestObject('Object Repository/By Case/17/Page_Facebook/input__email'), 'qmkecjunto_1612852822@tfbnw.net')

WebUI.setEncryptedText(findTestObject('Object Repository/By Case/17/Page_Facebook/input__pass'), 'gOP7IdE590r7JITAEPMRJQ==')

WebUI.click(findTestObject('Object Repository/By Case/17/Page_Facebook/label__loginbutton'))

WebUI.delay(7)

WebUI.switchToWindowTitle('Bluuu - จ้างแม่บ้าน ผู้เชี่ยวชาญเรื่องบ้านที่คุณไว้วางใจได้มากที่สุด')

WebUI.click(findTestObject('Object Repository/By Case/17/Page_Bluuu -/a_'))

WebUI.click(findTestObject('Object Repository/By Case/17/Page_  Bluuu -/a_'))

WebUI.click(findTestObject('Object Repository/By Case/17/Page_Bluuu/div__arrow-down'))

WebUI.click(findTestObject('Object Repository/By Case/17/Page_Bluuu/li_ 2'))

WebUI.click(findTestObject('Object Repository/By Case/17/Page_Bluuu/div__arrow-down_1'))

WebUI.click(findTestObject('Object Repository/By Case/17/Page_Bluuu/li_'))

WebUI.click(findTestObject('Object Repository/By Case/17/Page_Bluuu/div__arrow-down_1_2'))

WebUI.click(findTestObject('Object Repository/By Case/17/Page_Bluuu/li_2'))

WebUI.click(findTestObject('Object Repository/By Case/17/Page_Bluuu/a_'))

WebUI.click(findTestObject('Object Repository/By Case/17/Page_Bluuu/button_'))

WebUI.click(findTestObject('Object Repository/By Case/17/Page_Bluuu/img__avatar md'))

WebUI.waitForElementClickable(findTestObject('Temp/Page_Bluuu/button_maid'), 10)

WebUI.click(findTestObject('Temp/Page_Bluuu/button_maid'))

WebUI.click(findTestObject('Object Repository/By Case/17/Page_Bluuu/svg__vc-svg-icon'))

WebUI.click(findTestObject('Object Repository/By Case/17/Page_Bluuu/svg__vc-svg-icon'))

WebUI.click(findTestObject('Object Repository/By Case/17/Page_Bluuu/span_26'))

WebUI.click(findTestObject('Object Repository/By Case/17/Page_Bluuu/div__arrow-down_1_2_3'))

WebUI.click(findTestObject('Object Repository/By Case/17/Page_Bluuu/li_0700'))

WebUI.click(findTestObject('Object Repository/By Case/17/Page_Bluuu/span_'))

WebUI.setText(findTestObject('Object Repository/By Case/17/Page_Bluuu/input____BVID__561'), 'paragon')

WebUI.click(findTestObject('Object Repository/By Case/17/Page_Bluuu/div_Paragon Cineplex'))

WebUI.click(findTestObject('Object Repository/By Case/17/Page_Bluuu/button__1_2'))

WebUI.setText(findTestObject('Object Repository/By Case/17/Page_Bluuu/input____BVID__919'), 'WELCOME30')

WebUI.click(findTestObject('Object Repository/By Case/17/Page_Bluuu/button__1_2_3'))

WebUI.click(findTestObject('Object Repository/By Case/17/Page_Bluuu/button__1_2_3_4'))

WebUI.click(findTestObject('Object Repository/By Case/15/Page_/a_'))

WebUI.setText(findTestObject('Object Repository/By Case/15/Page_/input__ctl00mainTxtPromptPayName'), 'sad')

WebUI.click(findTestObject('Object Repository/By Case/15/Page_/input__ctl00mainBtnPromptPaySubmit'))

WebUI.waitForElementClickable(findTestObject('Used/zElement-Bluuu/button_MyPayment'), 360)

WebUI.click(findTestObject('Used/zElement-Bluuu/button_MyPayment'))

get_dura = WebUI.getText(findTestObject('Object Repository/By Case/15/Page_Bluuu/td_ 2'))

get_start = WebUI.getText(findTestObject('Object Repository/By Case/15/Page_Bluuu/td_25 .. 2021, 0700'))

if (get_dura == 'ครั้งเดียว: 2 ชม.') {
    a = 1
}

if (get_start == '26 เม.ย. 2021, 07:00') {
    b = 1
}

if ((a + b) == 2) {
    WebUI.closeBrowser()
} else {
    KeywordUtil.markFailed('')
}

