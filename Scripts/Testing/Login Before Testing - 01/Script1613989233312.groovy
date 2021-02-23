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

WebUI.click(findTestObject('Object Repository/test/Page_Bluuu -/a_'))

WebUI.click(findTestObject('Object Repository/test/Page_Bluuu/svg__vc-svg-icon'))

WebUI.click(findTestObject('Object Repository/test/Page_Bluuu/span_7'))

WebUI.click(findTestObject('Object Repository/test/Page_Bluuu/div__arrow-down'))

WebUI.click(findTestObject('Object Repository/test/Page_Bluuu/li_0630'))

WebUI.setText(findTestObject('Object Repository/test/Page_Bluuu/input____BVID__185'), 'paragon')

WebUI.click(findTestObject('Object Repository/test/Page_Bluuu/div_Paragon Cineplex'))

WebUI.click(findTestObject('Object Repository/test/Page_Bluuu/div__arrow-down_1'))

WebUI.click(findTestObject('Object Repository/test/Page_Bluuu/li_ 3'))

WebUI.click(findTestObject('Object Repository/test/Page_Bluuu/div__arrow-down_1_2'))

WebUI.click(findTestObject('Object Repository/test/Page_Bluuu/li_'))

WebUI.click(findTestObject('Object Repository/test/Page_Bluuu/span_'))

WebUI.click(findTestObject('Object Repository/test/Page_Bluuu/div__arrow-down_1_2_3'))

WebUI.click(findTestObject('Object Repository/test/Page_Bluuu/li_4'))

WebUI.click(findTestObject('Object Repository/test/Page_Bluuu/button_'))

WebUI.click(findTestObject('Object Repository/test/Page_Bluuu/button__1'))

WebUI.click(findTestObject('Object Repository/test/Page_Bluuu/button_ Facebook'))

WebUI.switchToWindowTitle('Facebook')

WebUI.setText(findTestObject('Object Repository/test/Page_Facebook/input__email'), 'qmkecjunto_1612852822@tfbnw.net')

WebUI.setEncryptedText(findTestObject('Object Repository/test/Page_Facebook/input__pass'), 'gOP7IdE590r7JITAEPMRJQ==')

WebUI.click(findTestObject('Object Repository/test/Page_Facebook/label__loginbutton'))

WebUI.click(findTestObject('Object Repository/test/Page_Bluuu/button__1'))

WebUI.waitForElementClickable(findTestObject('test/Page_/a_'), 60)

'ไปหน้า promptpay หลังจากการ login'
WebUI.switchToWindowTitle('')

'กด promptpay'
WebUI.click(findTestObject('Object Repository/test/Page_/a_'))

WebUI.setText(findTestObject('Object Repository/test/Page_/input__ctl00mainTxtPromptPayName'), 'etstet')

'ต่อจากกด promptpay'
WebUI.click(findTestObject('Object Repository/test/Page_/input__ctl00mainBtnPromptPaySubmit'))

WebUI.waitForElementClickable(findTestObject('Object Repository/test/Page_Bluuu/button__1_2'), 360)

WebUI.click(findTestObject('Object Repository/test/Page_Bluuu/button__1_2'))

