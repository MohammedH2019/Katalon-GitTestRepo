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

WebUI.click(findTestObject('NO/Page_Bluuu -/img_TH_avatar_Not-Login'))

WebUI.click(findTestObject('NO/Page_Bluuu -/button_ Facebook_Login'))

WebUI.switchToWindowTitle('Facebook')

WebUI.setText(findTestObject('NO/Page_Facebook/input__email'), 'qmkecjunto_1612852822@tfbnw.net')

WebUI.setEncryptedText(findTestObject('NO/Page_Facebook/input__pass'), 'gOP7IdE590r7JITAEPMRJQ==')

WebUI.click(findTestObject('NO/Page_Facebook/label__loginbutton'))

'รอให้หน้าเพจโหลดก่อน'
WebUI.delay(3)

WebUI.switchToWindowTitle('Bluuu - จ้างแม่บ้าน ผู้เชี่ยวชาญเรื่องบ้านที่คุณไว้วางใจได้มากที่สุด')

WebUI.openBrowser('')

WebUI.navigateToUrl('https://uat.bluuu.co/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/NO/Page_Bluuu -/img_TH_avatar_Not-Login'))

WebUI.click(findTestObject('Object Repository/NO/Page_Bluuu -/button_ Facebook_Login'))

WebUI.switchToWindowTitle('Facebook')

WebUI.setText(findTestObject('Object Repository/NO/Page_Facebook/input__email'), 'qmkecjunto_1612852822@tfbnw.net')

WebUI.setEncryptedText(findTestObject('Object Repository/NO/Page_Facebook/input__pass'), 'gOP7IdE590r7JITAEPMRJQ==')

WebUI.click(findTestObject('Object Repository/NO/Page_Facebook/label__loginbutton'))

'รอให้หน้าเพจโหลดก่อน'
WebUI.delay(3)

WebUI.switchToWindowTitle('Bluuu - จ้างแม่บ้าน ผู้เชี่ยวชาญเรื่องบ้านที่คุณไว้วางใจได้มากที่สุด')

'จอง one time'
WebUI.click(findTestObject('Object Repository/Page_Bluuu -/a_'))

'เลื่อนเดือน'
WebUI.click(findTestObject('Object Repository/Page_Bluuu/svg__vc-svg-icon'))

'วันที่ 22 เดือน 3'
WebUI.click(findTestObject('Object Repository/Page_Bluuu/span_22'))

'เวลาเริ่มงาน'
WebUI.click(findTestObject('Object Repository/Page_Bluuu/div__arrow-down'))

WebUI.click(findTestObject('Object Repository/Page_Bluuu/li_0630'))

'place'
WebUI.click(findTestObject('Object Repository/Page_Bluuu/div__arrow-down_1'))

'condo 2 bedroom'
WebUI.click(findTestObject('Object Repository/Page_Bluuu/li_ 2'))

WebUI.setText(findTestObject('Object Repository/Page_Bluuu/input____BVID__233'), 'paragon')

WebUI.click(findTestObject('Object Repository/Page_Bluuu/div_Paragon Cineplex'))

'กำหนด duration'
WebUI.click(findTestObject('Object Repository/Page_Bluuu/div__arrow-down_1_2'))

'4 ชม'
WebUI.click(findTestObject('Object Repository/Page_Bluuu/li_4'))

WebUI.click(findTestObject('Object Repository/Page_Bluuu/div__arrow-down_1_2_3'))

'cleaning and laundry'
WebUI.click(findTestObject('Object Repository/Page_Bluuu/li_'))

'I got cat'
WebUI.click(findTestObject('Object Repository/Page_Bluuu/label_'))

'I got dog'
WebUI.click(findTestObject('Object Repository/Page_Bluuu/label__1'))

'ฉันยอมรับ'
WebUI.click(findTestObject('Object Repository/Page_Bluuu/span_'))

WebUI.click(findTestObject('Object Repository/Page_Bluuu/button_'))

WebUI.click(findTestObject('Object Repository/Page_Bluuu/button__1'))

'Promptpay click'
WebUI.click(findTestObject('Object Repository/Page_/a_'))

'ใส่ชื่อนามสกุล'
WebUI.setText(findTestObject('Object Repository/Page_/input__ctl00mainTxtPromptPayName'), 'test')

WebUI.click(findTestObject('Object Repository/Page_/input__ctl00mainBtnPromptPaySubmit'))

WebUI.waitForElementClickable(findTestObject('Page_Bluuu/button__1_2'), 3)

'button click หลังจากนี้คงรอแหละ'
WebUI.click(findTestObject('Object Repository/Page_Bluuu/button__1_2'))

