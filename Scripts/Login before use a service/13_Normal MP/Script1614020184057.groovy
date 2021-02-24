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

WebUI.click(findTestObject('Used/zElement-Bluuu/img_TH_avatar_Not-Login'))

WebUI.click(findTestObject('Used/zElement-Bluuu/button_ Facebook_Login'))

WebUI.switchToWindowTitle('Facebook')

WebUI.setText(findTestObject('Used/Page-Facebook/input__email'), 'qmkecjunto_1612852822@tfbnw.net')

WebUI.setEncryptedText(findTestObject('Used/Page-Facebook/input__pass'), 'gOP7IdE590r7JITAEPMRJQ==')

WebUI.click(findTestObject('Used/Page-Facebook/label__loginbutton'))

WebUI.delay(7)

WebUI.switchToWindowTitle('Bluuu - จ้างแม่บ้าน ผู้เชี่ยวชาญเรื่องบ้านที่คุณไว้วางใจได้มากที่สุด')

'เข้าไปจองแบบ package'
WebUI.click(findTestObject('Used/Package-and-Date/a_Package'))

'รูปแบบของสถานที่ทำงาน'
WebUI.click(findTestObject('Used/zElement-Bluuu/div_RoomType'))

'คอนโด 4 ห้องนอนขึ้นไป'
WebUI.click(findTestObject('Used/zElement-Bluuu/li_Condo4Bedroom'))

WebUI.setText(findTestObject('Used/zElement-Bluuu/input_Location'), 'House of ')

WebUI.delay(7)

WebUI.click(findTestObject('Used/Package-and-Date/div_House of RAMS  53'))

'บริการที่ต้องการ'
WebUI.click(findTestObject('Used/Package-and-Date/div_Clean-Type'))

'เลือกทำความสะอาด'
WebUI.click(findTestObject('Used/Package-and-Date/li_Cleaning'))

'ฉันมีหมา'
WebUI.click(findTestObject('Used/Package-and-Date/label_IgotDog'))

'เลือกแม่บ้าน'
WebUI.click(findTestObject('Used/Package-and-Date/button_MP-Go-for-Maid'))

'p\'Mark avatar'
WebUI.click(findTestObject('Used/Package-and-Date/img_MP-PMark-Avatar'))

WebUI.click(findTestObject('Object Repository/By Case/18/Page_Bluuu/img__mr-2'))

'จำนวนชั่วโมง'
WebUI.click(findTestObject('Used/Package-and-Date/div_Duration'))

'2 hrs'
WebUI.click(findTestObject('Used/Package-and-Date/li_2 hours'))

'จำนวนครั้ง'
WebUI.click(findTestObject('Used/Package-and-Date/div_How-many-Time'))

'4 times'
WebUI.click(findTestObject('Used/Package-and-Date/li_4Times'))

'วันที่ต้องการจ้างซ้ำ'
WebUI.click(findTestObject('Used/Package-and-Date/div_Repeated-Day'))

'วันอังคาร'
WebUI.click(findTestObject('Used/Package-and-Date/li_Tuesday'))

'เวลาในแต่ละครั้ง'
WebUI.click(findTestObject('Used/Package-and-Date/div_Each-Time'))

WebUI.click(findTestObject('Used/Package-and-Date/li_1900 - 2100'))

'ฉันยอมรับ'
WebUI.click(findTestObject('Used/zElement-Bluuu/span_I Accept'))

'ไปหน้า Booking Summary'
WebUI.click(findTestObject('Used/Package-and-Date/button_Booknow'))

WebUI.click(findTestObject('Used/zElement-Bluuu/button_ConfirmBookNow'))

'Promptpay click'
WebUI.click(findTestObject('Used/Page-Payment/a_ClckPromptPay'))

'ใส่ชื่อนามสกุล'
WebUI.setText(findTestObject('Used/Page-Payment/input_TxtPromptPayName'), 'test')

WebUI.click(findTestObject('Used/Page-Payment/input_BtnPromptPaySubmit'))

WebUI.waitForElementClickable(findTestObject('Used/zElement-Bluuu/button_MyPayment'), 360)

'button click หลังจากนี้คงรอแหละ'
WebUI.click(findTestObject('Used/zElement-Bluuu/button_MyPayment'))

td_getdura = WebUI.getText(findTestObject('Object Repository/Temp/Page_Bluuu/td_getdura'))

getmaid = WebUI.getText(findTestObject('Object Repository/Temp/Page_Bluuu/span_getmaid'))

if (td_getdura == 'แพ็กเกจ: 2 ชม. x 4 ครั้ง') {
    a = 1
}

if (getmaid == 'Mark 〽️ Phoom') {
    b = 1
}

//print(a+b)
if ((a + b) == 2) {
    WebUI.closeBrowser()
} else {
    KeywordUtil.markFailed('')
}

