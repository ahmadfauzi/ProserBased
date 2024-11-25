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

WebUI.navigateToUrl('http://172.30.100.100:8059/login')

WebUI.setText(findTestObject('Object Repository/Page_TataPabrik/input_User name_username'), 'proser2023Pro')

WebUI.setEncryptedText(findTestObject('Page_TataPabrik/input_Password_password'), 'vRRrCeg9Qho=')

WebUI.click(findTestObject('Page_TataPabrik/span_Login'))

WebUI.click(findTestObject('Object Repository/Page_TataPabrik/div_Pengaturan Umum'))

WebUI.click(findTestObject('Object Repository/Page_TataPabrik/div_Users'))

WebUI.click(findTestObject('Object Repository/Page_TataPabrik/button_User'))

WebUI.setText(findTestObject('Object Repository/Page_TataPabrik/input_Users_Username'), 'autouser3')

WebUI.setEncryptedText(findTestObject('Page_TataPabrik/input_Users_Password'), 'RAQbu0m/KDnt+GJtNEcqXw==')

WebUI.setText(findTestObject('Object Repository/Page_TataPabrik/input_Name_Name'), 'User Tiga Auto')

WebUI.setText(findTestObject('Object Repository/Page_TataPabrik/input_Email_Email'), 'userauto@gmail.com')

WebUI.selectOptionByLabel(findTestObject('Object Repository/Page_TataPabrik/select_Roles'), 'Admin Pro', false)

WebUI.click(findTestObject('Object Repository/Page_TataPabrik/span_Simpan'))

