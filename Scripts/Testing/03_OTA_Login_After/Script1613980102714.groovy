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

'จอง1ครั้ง'
WebUI.click(findTestObject('NO/Page_Bluuu -/a_OneTimeService'))

'28 กพ'
WebUI.click(findTestObject('NO/Page_Bluuu -/span_28'))

'เวลาเริ่มงาน'
WebUI.click(findTestObject('Object Repository/Page_Bluuu/div__arrow-down (1)'))

WebUI.click(findTestObject('Object Repository/Page_Bluuu/li_0700 (1)'))

'ระบุสถานที่'
WebUI.setText(findTestObject('Object Repository/Page_Bluuu/input____BVID__185 (1)'), 'to')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Bluuu/div_Town in Town Village (1)'))

'รูปเเบบสถานที่'
WebUI.click(findTestObject('Object Repository/Page_Bluuu/div__arrow-down_1 (1)'))

WebUI.click(findTestObject('Object Repository/Page_Bluuu/li_ 1 (1)'))

'ระยะเวลาทำงาน'
WebUI.click(findTestObject('Object Repository/Page_Bluuu/div__arrow-down_1_2 (1)'))

WebUI.click(findTestObject('Object Repository/Page_Bluuu/li_2 (1)'))

'บริการ'
WebUI.click(findTestObject('Object Repository/Page_Bluuu/div__arrow-down_1_2_3 (1)'))

WebUI.click(findTestObject('Object Repository/Page_Bluuu/li_ (1)'))

'ฉันยอมรับ'
WebUI.click(findTestObject('Object Repository/Page_Bluuu/span_ (1)'))

'จอง'
WebUI.click(findTestObject('Object Repository/Page_Bluuu/button_ (1)'))

'ยืนยันการจอง'
WebUI.click(findTestObject('Object Repository/Page_Bluuu/button__1 (1)'))

WebUI.click(findTestObject('Object Repository/Page_Bluuu/button_ Facebook (1)'))

WebUI.switchToWindowTitle('Facebook')

WebUI.setText(findTestObject('Object Repository/Page_Facebook/input__email'), 'qmkecjunto_1612852822@tfbnw.net')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Facebook/input__pass'), 'gOP7IdE590r7JITAEPMRJQ==')

WebUI.click(findTestObject('Object Repository/Page_Facebook/label__loginbutton'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_/div_'))

WebUI.setText(findTestObject('Object Repository/Page_/input__ctl00mainTxtPromptPayName'), 'test')

WebUI.click(findTestObject('Object Repository/Page_/input__ctl00mainBtnPromptPaySubmit'))

WebUI.click(findTestObject('Object Repository/Page_Bluuu/button__1_2 (1)'))

'ระยะเวลา'
WebUI.click(findTestObject('Object Repository/Page_Bluuu/td_ 2 (1)'))

'วันเริ่มงาน'
WebUI.click(findTestObject('Object Repository/Page_Bluuu/td_28 .. 2021, 0700 (1)'))

WebUI.click(findTestObject('Object Repository/Page_Bluuu/button__1 (1)'))

