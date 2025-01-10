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

WebUI.callTestCase(findTestCase('Auth/LoginSuccess'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Salesman/Page_TataPabrik/div_Daftar Kontak'))

WebUI.click(findTestObject('Object Repository/Salesman/Page_TataPabrik/div_Salesman'))

WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/span_Filter Pencarian_icon'))

WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_Cari_input'), namasalesman)

WebUI.delay(2)

WebUI.click(findTestObject('Salesman/Page_TataPabrik/span_icon_rincian'))

String namaText = WebUI.getAttribute(findTestObject('Salesman/Page_TataPabrik/input_Nama Salesman_name'), 'value')

WebUI.verifyMatch(namaText, namasalesman, false)

String teleponText = WebUI.getAttribute(findTestObject('Salesman/Page_TataPabrik/input_Telepon_name'), 'value')

WebUI.verifyMatch(teleponText, telepon, false)

String noKaryawanText = WebUI.getAttribute(findTestObject('Salesman/Page_TataPabrik/input_Nomor Karyawan_name'), 'value')

WebUI.verifyMatch(noKaryawanText, nokaryawan, false)

