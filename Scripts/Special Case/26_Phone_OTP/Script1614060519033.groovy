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
import com.kms.katalon.core.testdata.InternalData as InternalData

InternalData data = findTestData('id_fb')

for (def index : (0..data.getRowNumbers() - 1)) {
    WebUI.openBrowser('')

    WebUI.navigateToUrl('https://uat.bluuu.co/')

    WebUI.maximizeWindow()

    WebUI.click(findTestObject('Object Repository/P_USE/26/Page_Bluuu -/img_TH_avatar order-3 order-xl-4 ml-4 mt-1'))

    WebUI.click(findTestObject('Object Repository/P_USE/26/Page_Bluuu -/button_ Facebook'))

    WebUI.switchToWindowTitle('Facebook')

    WebUI.setText(findTestObject('Used/Page-Facebook/input__email'), data.internallyGetValue('id', index))

    WebUI.setText(findTestObject('Object Repository/P_USE/26/Page_Facebook/input__pass'), data.internallyGetValue('pass', 
            index))

    WebUI.click(findTestObject('Object Repository/P_USE/26/Page_Facebook/label__loginbutton'))

    WebUI.delay(3)
        
    WebUI.click(findTestObject('Object Repository/P_USE/26/Page_ Facebook/button_ Linda'))
	
    WebUI.delay(4)

    WebUI.switchToWindowTitle('Bluuu - จ้างแม่บ้าน ผู้เชี่ยวชาญเรื่องบ้านที่คุณไว้วางใจได้มากที่สุด')

    WebUI.click(findTestObject('Object Repository/P_USE/26/Page_Bluuu -/img_TH_avatar'))

    WebUI.click(findTestObject('Object Repository/P_USE/26/Page_Bluuu -/a_'))

    WebUI.click(findTestObject('Object Repository/P_USE/26/Page_Bluuu/i__far fa-edit'))

    WebUI.setText(findTestObject('Object Repository/P_USE/26/Page_Bluuu/input____BVID__230'), '0999999999')

    WebUI.click(findTestObject('P_USE/26/Page_Bluuu/button_'))

    WebUI.delay(60)

    WebUI.setText(findTestObject('Object Repository/P_USE/26/Page_Bluuu/input_ 6 ___BVID__233'), '999999')

    WebUI.click(findTestObject('P_USE/26/Page_Bluuu/button_'))

    //	phone = WebUI.getAttribute(findTestObject('Object Repository/P_USE/26/Page_Bluuu/input____BVID__170'), 'Value')
    //
    //    System.out.println(phone)
    WebUI.delay(20)
}

