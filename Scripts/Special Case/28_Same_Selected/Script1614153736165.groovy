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

WebUI.click(findTestObject('Object Repository/P_USE/25/Page_Bluuu -/a_'))

WebUI.click(findTestObject('Object Repository/P_USE/25/Page_Bluuu/svg__vc-svg-icon'))

WebUI.click(findTestObject('Object Repository/P_USE/25/Page_Bluuu/svg__vc-svg-icon'))

'Friday 30/04/2021'
WebUI.click(findTestObject('Object Repository/P_USE/25/Page_Bluuu/span_30'))

WebUI.click(findTestObject('Object Repository/P_USE/25/Page_Bluuu/div__arrow-down'))

'07.00'
WebUI.click(findTestObject('Object Repository/P_USE/25/Page_Bluuu/li_0700'))

WebUI.setText(findTestObject('Object Repository/P_USE/25/Page_Bluuu/input____BVID__186'), 'to')

WebUI.delay(2.5)

'Town in Town Village'
WebUI.click(findTestObject('Object Repository/P_USE/25/Page_Bluuu/div_Town in Town Village'))

WebUI.click(findTestObject('Object Repository/P_USE/25/Page_Bluuu/div__arrow-down_1'))

'Condo 1 room'
WebUI.click(findTestObject('Object Repository/P_USE/25/Page_Bluuu/li_ 1'))

WebUI.click(findTestObject('Object Repository/P_USE/25/Page_Bluuu/div__arrow-down_1_2'))

'2 hrs'
WebUI.click(findTestObject('Object Repository/P_USE/25/Page_Bluuu/li_2'))

WebUI.click(findTestObject('Object Repository/P_USE/25/Page_Bluuu/div__arrow-down_1_2_3'))

'Clean'
WebUI.click(findTestObject('Object Repository/P_USE/25/Page_Bluuu/li_'))

'cat'
WebUI.click(findTestObject('Object Repository/P_USE/25/Page_Bluuu/label_'))

'dog'
WebUI.click(findTestObject('Object Repository/P_USE/25/Page_Bluuu/label__1'))

WebUI.setText(findTestObject('Object Repository/P_USE/25/Page_Bluuu/textarea____BVID__201'), 'hello')

WebUI.click(findTestObject('Object Repository/P_USE/25/Page_Bluuu/span_'))

WebUI.click(findTestObject('Object Repository/P_USE/25/Page_Bluuu/button_'))

'ศุกร์ 30 เม.ย. 2021'
date1 = WebUI.getText(findTestObject('Object Repository/P_USE/25/Page_Bluuu/p_ 30 .. 2021'))

'ทำความสะอาด 07:00 - 09:00'
doing1 = WebUI.getText(findTestObject('Object Repository/P_USE/25/Page_Bluuu/p_  0700 - 0900'))

'Town in Town Village'
loca1 = WebUI.getText(findTestObject('Object Repository/P_USE/25/Page_Bluuu/span_Town in Town Village'))

'2 ชั่วโมง'
dura1 = WebUI.getText(findTestObject('Object Repository/P_USE/25/Page_Bluuu/p_2'))

'จองครั้งเดียว'
ota1 = WebUI.getText(findTestObject('Object Repository/P_USE/25/Page_Bluuu/p_'))

'hello'
text1 = WebUI.getText(findTestObject('Object Repository/P_USE/25/Page_Bluuu/p_hello'))

'cat'
cat1 = WebUI.getText(findTestObject('P_USE/25/Page_Bluuu/cat'))

'dog'
dog1 = WebUI.getText(findTestObject('P_USE/25/Page_Bluuu/dog'))



'Back'
WebUI.click(findTestObject('Object Repository/P_USE/28/Page_Bluuu/button__1'))

WebUI.click(findTestObject('Object Repository/P_USE/28/Page_Bluuu/span_'))

WebUI.click(findTestObject('Object Repository/P_USE/28/Page_Bluuu/button_'))

'ศุกร์ 30 เม.ย. 2021'
date2 = WebUI.getText(findTestObject('Object Repository/P_USE/25/Page_Bluuu/p_ 30 .. 2021'))

'ทำความสะอาด 07:00 - 09:00'
doing2 = WebUI.getText(findTestObject('Object Repository/P_USE/25/Page_Bluuu/p_  0700 - 0900'))

'Town in Town Village'
loca2 = WebUI.getText(findTestObject('Object Repository/P_USE/25/Page_Bluuu/span_Town in Town Village'))

'2 ชั่วโมง'
dura2 = WebUI.getText(findTestObject('Object Repository/P_USE/25/Page_Bluuu/p_2'))

'จองครั้งเดียว'
ota2 = WebUI.getText(findTestObject('Object Repository/P_USE/25/Page_Bluuu/p_'))

'hello'
text2 = WebUI.getText(findTestObject('Object Repository/P_USE/25/Page_Bluuu/p_hello'))

'cat'
cat2 = WebUI.getText(findTestObject('P_USE/25/Page_Bluuu/cat'))

'dog'
dog2 = WebUI.getText(findTestObject('P_USE/25/Page_Bluuu/dog'))


	if (date1 == date2) {
		v1=1}
	if (doing1 == doing2) {
		v2=1}
	if (loca1 == loca2) {
		v3=1}
	if (dura1 == dura2) {
		v4=1}
	if (ota1 == ota2) {
		v5=1}
	if (text1 == text2) {
		v6=1}
	if (cat1 == cat2) {
		v7=1}
	if (dog1 == dog2) {
		v8=1}
	
	if ((v1+v2+v3+v4+v5+v6+v7+v8) == 8) {
		WebUI.closeBrowser()
	} else {
		KeywordUtil.markFailed('')
	}