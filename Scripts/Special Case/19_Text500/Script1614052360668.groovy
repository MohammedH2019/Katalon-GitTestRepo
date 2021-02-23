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

WebUI.click(findTestObject('Object Repository/P_USE/19/Page_Bluuu -/a_'))

WebUI.setText(findTestObject('Object Repository/P_USE/19/Page_Bluuu/textarea____BVID__200'), 'assadasdasdasdqkdq[wkdlsdaldladlklkqkpaskdpqk[dkaksd[aksdlasd[k[dasldaksdpqkd[qkw[pkksadklskdpakdpaskdassadasdasdasdqkdq[wkdlsdaldladlklkqkpaskdpqk[dkaksd[aksdlasd[k[dasldaksdpqkd[qkw[pkksadklskdpakdpaskdassadasdasdasdqkdq[wkdlsdaldladlklkqkpaskdpqk[dkaksd[aksdlasd[k[dasldaksdpqkd[qkw[pkksadklskdpakdpaskdassadasdasdasdqkdq[wkdlsdaldladlklkqkpaskdpqk[dkaksd[aksdlasd[k[dasldaksdpqkd[qkw[pkksadklskdpakdpaskdassadasdasdasdqkdq[wkdlsdaldladlklkqkpaskdpqk[dkaksd[aksdlasd[k[dasldaksdpqkd[qkw[pkksadklsassadasdasdasdqkdq[wkdlsdaldladlklkqkpaskdpqk[dkaksd[aksdlasd[k[dasldaksdpqkd[qkw[pkksadklskdpakdpaskd')

text500 = WebUI.getText(findTestObject('Object Repository/P_USE/19/Page_Bluuu/p_ 500'))

if (text500 == 'คุณสามารถกรอกข้อมูลเพิ่มเติมได้ทั้งหมด 500 ตัวอักษร') {
	WebUI.closeBrowser()
} else {
	System.out.println('INCORRECT')

	KeywordUtil.markFailed('')
}