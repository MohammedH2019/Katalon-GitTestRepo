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

WebUI.click(findTestObject('Object Repository/By Case/18_2/Page_Bluuu -/img_TH_avatar order-3 order-xl-4 ml-4 mt-1'))

WebUI.click(findTestObject('Object Repository/By Case/18_2/Page_Bluuu -/button_ Facebook'))

WebUI.switchToWindowTitle('Facebook')

WebUI.setText(findTestObject('Object Repository/By Case/18_2/Page_Facebook/input__email'), 'qmkecjunto_1612852822@tfbnw.net')

WebUI.setEncryptedText(findTestObject('Object Repository/By Case/18_2/Page_Facebook/input__pass'), 'gOP7IdE590r7JITAEPMRJQ==')

WebUI.click(findTestObject('Object Repository/By Case/18_2/Page_Facebook/label__loginbutton'))

WebUI.delay(7)

WebUI.switchToWindowTitle('Bluuu - จ้างแม่บ้าน ผู้เชี่ยวชาญเรื่องบ้านที่คุณไว้วางใจได้มากที่สุด')

'service'
WebUI.click(findTestObject('Object Repository/By Case/18_2/Page_Bluuu -/a_'))

WebUI.click(findTestObject('Object Repository/By Case/18_2/Page_  Bluuu -/img__mr-2'))

'OTM'
WebUI.click(findTestObject('Object Repository/By Case/18_2/Page_Bluuu/a_'))

'condo'
WebUI.click(findTestObject('Object Repository/By Case/18_2/Page_Bluuu/div__arrow-down'))

'3 bedroom'
WebUI.click(findTestObject('Object Repository/By Case/18_2/Page_Bluuu/li_ 3'))

WebUI.click(findTestObject('Object Repository/By Case/18_2/Page_Bluuu/div__arrow-down_1'))

'clean & laundry'
WebUI.click(findTestObject('Object Repository/By Case/18_2/Page_Bluuu/li_'))

WebUI.click(findTestObject('Object Repository/By Case/18_2/Page_Bluuu/div__arrow-down_1_2'))

'3 hours'
WebUI.click(findTestObject('Object Repository/By Case/18_2/Page_Bluuu/li_3'))

'ไปหน้าเลือกแม่บ้าน'
WebUI.click(findTestObject('Object Repository/By Case/18_2/Page_Bluuu/button_'))

'รูปพี่มาร์ค'
WebUI.click(findTestObject('Object Repository/By Case/18_2/Page_Bluuu/img__avatar md'))

WebUI.waitForElementClickable(findTestObject('Used/zElement-Bluuu/Page_Bluuu/img_PMark-OneTime'), 30)

'ปฎิธินจองครั้งเดียว'
WebUI.click(findTestObject('Used/zElement-Bluuu/Page_Bluuu/img_PMark-OneTime'))

WebUI.setText(findTestObject('Object Repository/By Case/18_2/Page_Bluuu/input____BVID__564'), 'to')

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/By Case/18_2/Page_Bluuu/div_Town in Town Village'))

WebUI.click(findTestObject('Object Repository/By Case/18_2/Page_Bluuu/svg__vc-svg-icon'))

WebUI.click(findTestObject('Object Repository/By Case/18_2/Page_Bluuu/svg__vc-svg-icon'))

WebUI.click(findTestObject('Object Repository/By Case/18_2/Page_Bluuu/span_22'))

WebUI.click(findTestObject('Object Repository/By Case/18_2/Page_Bluuu/div__arrow-down_1_2_3'))

WebUI.click(findTestObject('Object Repository/By Case/18_2/Page_Bluuu/li_0700'))

'ฉันยอมรับ'
WebUI.click(findTestObject('Object Repository/By Case/18_2/Page_Bluuu/span_'))

WebUI.click(findTestObject('Object Repository/By Case/18_2/Page_Bluuu/button__1'))

'ยืนยันการจอง'
WebUI.click(findTestObject('Object Repository/By Case/18_2/Page_Bluuu/button__1_2'))

'promptpay'
WebUI.click(findTestObject('Object Repository/By Case/18_2/Page_/a_'))

WebUI.setText(findTestObject('Object Repository/By Case/18_2/Page_/input__ctl00mainTxtPromptPayName'), 'sad')

WebUI.click(findTestObject('Object Repository/By Case/18_2/Page_/input__ctl00mainBtnPromptPaySubmit'))

WebUI.waitForElementClickable(findTestObject('Object Repository/By Case/18_2/Page_Bluuu/button__1_2_3'), 60)

WebUI.click(findTestObject('Object Repository/By Case/18_2/Page_Bluuu/button__1_2_3'))

