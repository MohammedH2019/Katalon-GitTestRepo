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

WebUI.switchToWindowTitle('Bluuu - จ้างแม่บ้าน ผู้เชี่ยวชาญเรื่องบ้านที่คุณไว้วางใจได้มากที่สุด')

'เข้าไปจองแบบ package'
WebUI.click(findTestObject('Object Repository/Temp/Page_Bluuu -/a_'))

'รูปแบบของสถานที่ทำงาน'
WebUI.click(findTestObject('Object Repository/Temp/Page_Bluuu/div__arrow-down'))

'คอนโด 4 ห้องนอนขึ้นไป'
WebUI.click(findTestObject('Object Repository/Temp/Page_Bluuu/li_ 4'))

WebUI.setText(findTestObject('Object Repository/Temp/Page_Bluuu/input____BVID__234'), 'house of ')

WebUI.click(findTestObject('Object Repository/Temp/Page_Bluuu/div_House of RAMS  53'))

'บริการที่ต้องการ'
WebUI.click(findTestObject('Object Repository/Temp/Page_Bluuu/div__arrow-down_1'))

'ทำความสะอาด'
WebUI.click(findTestObject('Object Repository/Temp/Page_Bluuu/li_'))

'มีหมานะฮะ'
WebUI.click(findTestObject('Object Repository/Temp/Page_Bluuu/label_'))

'เลือกแม่บ้าน'
WebUI.click(findTestObject('Object Repository/Temp/Page_Bluuu/button__1'))

'p\'Mark avatar'
WebUI.click(findTestObject('Object Repository/Temp/Page_Bluuu/img__avatar md'))

'จองแบบ package'
WebUI.click(findTestObject('Object Repository/Temp/Page_Bluuu/button__1_2'))

'จำนวนชั่วโมง'
WebUI.click(findTestObject('Object Repository/Temp/Page_Bluuu/div__arrow-down_1_2'))

'2 hrs'
WebUI.click(findTestObject('Object Repository/Temp/Page_Bluuu/li_2'))

'จำนวนครั้ง'
WebUI.click(findTestObject('Object Repository/Temp/Page_Bluuu/div__arrow-down_1_2_3'))

'4 times'
WebUI.click(findTestObject('Object Repository/Temp/Page_Bluuu/li_4'))

'วันที่ต้องการจ้างซ้ำ'
WebUI.click(findTestObject('Object Repository/Temp/Page_Bluuu/div__arrow-down_1_2_3_4'))

'วันอังคาร'
WebUI.click(findTestObject('Object Repository/Temp/Page_Bluuu/li__1_2'))

'เวลาในแต่ละครั้ง'
WebUI.click(findTestObject('Object Repository/Temp/Page_Bluuu/div__arrow-down_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/Temp/Page_Bluuu/li_1900 - 2100'))

'ยอมรับเงื่อนไข'
WebUI.click(findTestObject('Object Repository/Temp/Page_Bluuu/span_'))

'ยืนยันข้อมูลการจอง-1'
WebUI.click(findTestObject('Object Repository/Temp/Page_Bluuu/button__1_2_3'))

'ยืนยันการจองเพื่อไปหน้า payment'
WebUI.click(findTestObject('Object Repository/Temp/Page_Bluuu/button__1_2_3_4'))

'promptpay'
WebUI.click(findTestObject('Object Repository/Temp/Page_/a_'))

