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

WebUI.click(findTestObject('Object Repository/Temp/Page_Bluuu -/img_TH_avatar order-3 order-xl-4 ml-4 mt-1'))

WebUI.click(findTestObject('Object Repository/Temp/Page_Bluuu -/button_ Facebook'))

WebUI.switchToWindowTitle('Facebook')

WebUI.setText(findTestObject('Object Repository/Temp/Page_Facebook/input__email'), 'qmkecjunto_1612852822@tfbnw.net')

WebUI.setEncryptedText(findTestObject('Object Repository/Temp/Page_Facebook/input__pass'), 'gOP7IdE590r7JITAEPMRJQ==')

WebUI.click(findTestObject('Object Repository/Temp/Page_Facebook/label__loginbutton'))

WebUI.delay(5)

WebUI.switchToWindowTitle('Bluuu - จ้างแม่บ้าน ผู้เชี่ยวชาญเรื่องบ้านที่คุณไว้วางใจได้มากที่สุด')

WebUI.click(findTestObject('Object Repository/Temp/Page_Bluuu -/img_TH_avatar'))

WebUI.click(findTestObject('Object Repository/Temp/Page_Bluuu -/a_'))

td_getdura = WebUI.getText(findTestObject('Object Repository/Temp/Page_Bluuu/td_getdura'))

getmaid = WebUI.getText(findTestObject('Object Repository/Temp/Page_Bluuu/span_getmaid'))

//get_dura = WebUI.getText(findTestObject('Object Repository/Used/zElement-Bluuu/Page_Bluuu/dura'))
//
//get_start = WebUI.getText(findTestObject('Object Repository/Used/zElement-Bluuu/Page_Bluuu/start'))

if (td_getdura == 'แพ็กเกจ: 2 ชม. x 4 ครั้ง') {
	a = 1
}

if (getmaid == 'Mark 〽️ Phoom') {
	b = 1
}

if ((a + b) == 2) {
	WebUI.closeBrowser()
} else {
	KeywordUtil.markFailed('')
}


