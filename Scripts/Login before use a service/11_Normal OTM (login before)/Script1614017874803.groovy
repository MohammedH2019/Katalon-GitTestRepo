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

WebUI.click(findTestObject('Used/zElement-Bluuu/img_TH_avatar_Not-Login'))

WebUI.click(findTestObject('Used/zElement-Bluuu/button_ Facebook_Login'))

WebUI.switchToWindowTitle('Facebook')

WebUI.setText(findTestObject('Used/Page-Facebook/input__email'), 'qmkecjunto_1612852822@tfbnw.net')

WebUI.setEncryptedText(findTestObject('Used/Page-Facebook/input__pass'), 'gOP7IdE590r7JITAEPMRJQ==')

WebUI.click(findTestObject('Used/Page-Facebook/label__loginbutton'))

'รอให้หน้าเพจโหลดก่อน'
WebUI.delay(7)

WebUI.switchToWindowTitle('Bluuu - จ้างแม่บ้าน ผู้เชี่ยวชาญเรื่องบ้านที่คุณไว้วางใจได้มากที่สุด')

'จอง one time'
WebUI.click(findTestObject('Used/zElement-Bluuu/a_OneTimeService'))

'place'
WebUI.click(findTestObject('Used/zElement-Bluuu/div_RoomType'))

'condo 2 bedroom'
WebUI.click(findTestObject('Used/zElement-Bluuu/li_Condo2Bedroom'))

WebUI.setText(findTestObject('Used/zElement-Bluuu/input_Location'), 'paragon')

WebUI.click(findTestObject('Used/zElement-Bluuu/div_Paragon Cineplex'))

WebUI.click(findTestObject('Used/zElement-Bluuu/div_arrow-down_CleanType'))

'cleaning and laundry'
WebUI.click(findTestObject('Used/zElement-Bluuu/li_Clean-and-Laundry'))

'I got cat'
WebUI.click(findTestObject('Used/zElement-Bluuu/label_IgotCat'))

'I got dog'
WebUI.click(findTestObject('Used/zElement-Bluuu/label_IgotDog'))

//เลือกแม่บ้านWebUI.click(findTestObject('Used/Picking-Maid/a_Pick-OneTimeManual'))
'Click เลือกแม่บ้านด้วยตนเอง'
WebUI.click(findTestObject('Used/Picking-Maid/a_Pick-OneTimeManual'))

'ปุ่มเลือกแม่บ้าน'
WebUI.click(findTestObject('Used/Picking-Maid/button_Picking-maid'))

'รูป avatar P\'Mark'
WebUI.click(findTestObject('Used/Picking-Maid/img_PMark-Avatar'))

WebUI.waitForElementClickable(findTestObject('Used/Picking-Maid/button_OneTime-PMark'), 60)

'กดจองครั้งเดียว'
WebUI.click(findTestObject('Used/Picking-Maid/button_OneTime-PMark'))

'เลื่อนเดือน'
WebUI.click(findTestObject('Used/zElement-Bluuu/svg_NextMonth'))

'วันที่ 22 เดือน 3'
WebUI.click(findTestObject('Used/zElement-Bluuu/span_M3D22'))

'เวลาเริ่มงาน'
WebUI.click(findTestObject('Used/zElement-Bluuu/div_StartTime'))

WebUI.delay(3)

'เลือก 7 โมงเช้า'
WebUI.click(findTestObject('Used/Page_Bluuu/li_0700'))

'กำหนด duration'
WebUI.click(findTestObject('Used/zElement-Bluuu/div_Duration'))

WebUI.delay(3)

'ระยะเวลา 2 ชั่วโมง'
WebUI.click(findTestObject('Used/Page_Bluuu/li_2 hours'))

'ฉันยอมรับ'
WebUI.click(findTestObject('Used/zElement-Bluuu/span_I Accept'))

'ไปหน้า Booking Summary'
WebUI.click(findTestObject('Used/zElement-Bluuu/button_BookNow'))

WebUI.click(findTestObject('Used/zElement-Bluuu/button_ConfirmBookNow'))

'Promptpay click'
WebUI.click(findTestObject('Used/Page-Payment/a_ClckPromptPay'))

'ใส่ชื่อนามสกุล'
WebUI.setText(findTestObject('Used/Page-Payment/input_TxtPromptPayName'), 'test')

WebUI.click(findTestObject('Used/Page-Payment/input_BtnPromptPaySubmit'))

WebUI.waitForElementClickable(findTestObject('Used/zElement-Bluuu/button_MyPayment'), 360)

'button click หลังจากนี้คงรอแหละ'
WebUI.click(findTestObject('Used/zElement-Bluuu/button_MyPayment'))

get_dura = WebUI.getText(findTestObject('Object Repository/Used/zElement-Bluuu/Page_Bluuu/dura'))

get_start = WebUI.getText(findTestObject('Object Repository/Used/zElement-Bluuu/Page_Bluuu/start'))

if (get_dura == 'ครั้งเดียว: 2 ชม.') {
	a = 1
}

if (get_start == '22 มี.ค. 2021, 07:00') {
	b = 1
}

if ((a + b) == 2) {
	WebUI.closeBrowser()
} else {
	KeywordUtil.markFailed('')
}