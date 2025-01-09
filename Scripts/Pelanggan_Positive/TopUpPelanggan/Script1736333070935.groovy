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

WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/div_Daftar Kontak'))

WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/div_Pelanggan'))

WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/span_Filter Pencarian_icon'))

WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_Cari_input'), namapelanggan)

WebUI.delay(2)

WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/span_icon_rincian'))

WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/span_Top Up'))

WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_Top Up_amount'), topup)

WebUI.selectOptionByLabel(findTestObject('Pelanggan/Page_TataPabrik/select_Pilih Cara Pembayaran'), 'QRIS', false)

WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/span_Cancel'))

String fullText0 = WebUI.getText(findTestObject('Pelanggan/Page_TataPabrik/div_Saldo Piutang Rp'))
String extractedNumber0 = fullText0.split(': Rp ')[1]
WebUI.verifyMatch(extractedNumber0, '0,00', false)

WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/span_Top Up'))

WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_Top Up_amount'), topup)

WebUI.selectOptionByLabel(findTestObject('Pelanggan/Page_TataPabrik/select_Pilih Cara Pembayaran'), 'QRIS', false)

WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/span_Simpan Top Up'))

WebUI.delay(3)

String fullText1 = WebUI.getText(findTestObject('Pelanggan/Page_TataPabrik/div_Saldo Piutang Rp'))
String parts = fullText1.split(",00")[0]
String numericText1 = parts.replaceAll('[^0-9]', '')
WebUI.verifyMatch(numericText1, topup, false)

