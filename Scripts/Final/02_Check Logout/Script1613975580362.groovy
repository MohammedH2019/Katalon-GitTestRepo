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

WebUI.switchToWindowTitle('Bluuu - จ้างแม่บ้าน ผู้เชี่ยวชาญเรื่องบ้านที่คุณไว้วางใจได้มากที่สุด')

WebUI.click(findTestObject('NO/Page_Bluuu -/img_TH_avatar_Login'))

WebUI.click(findTestObject('NO/Page_Bluuu -/a_logout'))

WebUI.click(findTestObject('NO/Page_Bluuu -/img_TH_avatar_Not-Login'))

WebUI.click(findTestObject('NO/Page_Bluuu -/button_ Facebook_Login'), FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

