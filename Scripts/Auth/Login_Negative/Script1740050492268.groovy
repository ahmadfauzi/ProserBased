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

WebUI.navigateToUrl(GlobalVariable.URL)


WebUI.setText(findTestObject('Object Repository/Page_TataPabrik/input_User name_username'), username)

WebUI.setEncryptedText(findTestObject('Page_TataPabrik/input_Password_password'), password)

WebUI.click(findTestObject('Page_TataPabrik/DaftarBarang/span_Login'))

if (username == '') {
    WebUI.verifyElementPresent(findTestObject('Page_TataPabrik/Auth/Page_TataPabrik/span_username_wajib diisi'), 1)
} else if (password == '') {
    WebUI.verifyElementPresent(findTestObject('Page_TataPabrik/Auth/Page_TataPabrik/span_password_wajib diisi'), 1)
} else if ((username == 'proser2023') && (password == 'vRRrCeg9Qho=')) {
    WebUI.verifyElementPresent(findTestObject('Page_TataPabrik/Auth/Page_TataPabrik/div_Beranda'), 2)
} else {
	WebUI.verifyElementPresent(findTestObject('Page_TataPabrik/Auth/Page_TataPabrik/div_toast_Login Failed, Username or password is incorrect'),
		1)
}
