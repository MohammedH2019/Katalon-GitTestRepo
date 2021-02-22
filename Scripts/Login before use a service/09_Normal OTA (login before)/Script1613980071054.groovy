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

WebUI.click(findTestObject('Object Repository/NO/Page_Bluuu -/img_TH_avatar_Not-Login'))

WebUI.click(findTestObject('Object Repository/NO/Page_Bluuu -/button_ Facebook_Login'))

WebUI.switchToWindowTitle('Facebook')

WebUI.setText(findTestObject('NO/Page_Facebook/input__email'), 'qmkecjunto_1612852822@tfbnw.net')

WebUI.setEncryptedText(findTestObject('NO/Page_Facebook/input__pass'), 'gOP7IdE590r7JITAEPMRJQ==')

WebUI.click(findTestObject('NO/Page_Facebook/label__loginbutton'))

'รอให้หน้าเพจโหลดก่อน'
WebUI.delay(7)

WebUI.switchToWindowTitle('Bluuu - จ้างแม่บ้าน ผู้เชี่ยวชาญเรื่องบ้านที่คุณไว้วางใจได้มากที่สุด')

'จอง one time'
WebUI.click(findTestObject('NO/Page_Bluuu -/a_OneTimeService'))

'เลื่อนเดือน'
WebUI.click(findTestObject('NO/Page_Bluuu -/svg_NextMonth'))

'วันที่ 22 เดือน 3'
WebUI.click(findTestObject('NO/Page_Bluuu -/span_M3D22'))

'เวลาเริ่มงาน'
WebUI.click(findTestObject('NO/Page_Bluuu -/div_StartTime'))

WebUI.click(findTestObject('NO/Page_Bluuu -/li_0630'))

'place'
WebUI.click(findTestObject('NO/Page_Bluuu -/div_RoomType'))

'condo 2 bedroom'
WebUI.click(findTestObject('NO/Page_Bluuu -/li_Condo2Bedroom'))

WebUI.setText(findTestObject('NO/Page_Bluuu -/input_Location'), 'paragon')

WebUI.click(findTestObject('NO/Page_Bluuu -/div_Paragon Cineplex'))

'กำหนด duration'
WebUI.click(findTestObject('NO/Page_Bluuu -/div_Duration'))

WebUI.delay(1)

WebUI.click(findTestObject('NO/Page_Bluuu/li_3 hours'))

WebUI.click(findTestObject('NO/Page_Bluuu -/div_arrow-down_CleanType'))

'cleaning and laundry'
WebUI.click(findTestObject('NO/Page_Bluuu -/li_Clean-and-Laundry'))

'I got cat'
WebUI.click(findTestObject('NO/Page_Bluuu -/label_IgotCat'))

'I got dog'
WebUI.click(findTestObject('NO/Page_Bluuu -/label_IgotDog'))

'ฉันยอมรับ'
WebUI.click(findTestObject('NO/Page_Bluuu -/span_I Accept'))

WebUI.click(findTestObject('NO/Page_Bluuu -/button_BookNow'))

WebUI.click(findTestObject('NO/Page_Bluuu -/button_ConfirmBookNow'))

'Promptpay click'
WebUI.click(findTestObject('NO/Page_/a_ClckPromptPay'))

'ใส่ชื่อนามสกุล'
WebUI.setText(findTestObject('NO/Page_/input_TxtPromptPayName'), 'test')

WebUI.click(findTestObject('NO/Page_/input_BtnPromptPaySubmit'))

WebUI.waitForElementClickable(findTestObject('NO/Page_Bluuu -/button_MyPayment'), 3)

'button click หลังจากนี้คงรอแหละ'
WebUI.click(findTestObject('NO/Page_Bluuu -/button_MyPayment'))

