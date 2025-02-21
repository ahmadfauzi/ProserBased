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

//Edit diskon dari data Tambah Diskon

WebUI.callTestCase(findTestCase('Auth/LoginSuccess'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PengaturanDiskon/Page_TataPabrik/div_Konfigurasi Pabrik'))

WebUI.click(findTestObject('PengaturanDiskon/Page_TataPabrik/div_Pengaturan Diskon'))

WebUI.click(findTestObject('Supplier/Page_TataPabrik/span_Filter Pencarian_icon'))

WebUI.setText(findTestObject('Salesman/Page_TataPabrik/input_Cari_input'), namadiskon)

WebUI.delay(2)

WebUI.click(findTestObject('PengaturanDiskon/Page_TataPabrik/span_icon_edit'))

WebUI.sendKeys(findTestObject('PengaturanDiskon/Page_TataPabrik/input_Jenis Diskon_name'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('PengaturanDiskon/Page_TataPabrik/input_Jenis Diskon_name'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('PengaturanDiskon/Page_TataPabrik/input_Jenis Diskon_name'), namadiskon_edit)

WebUI.click(findTestObject('PengaturanDiskon/Page_TataPabrik/div_tanggal berakhir'))

WebUI.scrollToElement(findTestObject('PengaturanDiskon/Page_TataPabrik/td_pilih tanggal'), 2)

WebUI.click(findTestObject('PengaturanDiskon/Page_TataPabrik/td_pilih tanggal'))

WebUI.selectOptionByValue(findTestObject('PengaturanDiskon/Page_TataPabrik/select_Customer Invoice'), 'Invoice', false)

WebUI.setText(findTestObject('PengaturanDiskon/Page_TataPabrik/input_Nominal'), nominal_edit)

WebUI.click(findTestObject('PengaturanDiskon/Page_TataPabrik/button_Simpan'))

WebUI.setText(findTestObject('Object Repository/Supplier/Page_TataPabrik/input_Cari_input'), namadiskon_edit)

WebUI.delay(2)

String namaDiskonEditText = WebUI.getText(findTestObject('PengaturanDiskon/Page_TataPabrik/div_list_nama diskon'))

WebUI.verifyMatch(namaDiskonEditText, namadiskon_edit, false)

String tipeDiskonText = WebUI.getText(findTestObject('PengaturanDiskon/Page_TataPabrik/td_list_tipe diskon'))

WebUI.verifyMatch(tipeDiskonText, 'Invoice', false)

//Edit untuk mengembalikan data ke awal semula

WebUI.click(findTestObject('PengaturanDiskon/Page_TataPabrik/span_icon_edit'))

WebUI.sendKeys(findTestObject('PengaturanDiskon/Page_TataPabrik/input_Jenis Diskon_name'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('PengaturanDiskon/Page_TataPabrik/input_Jenis Diskon_name'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('PengaturanDiskon/Page_TataPabrik/input_Jenis Diskon_name'), namadiskon)

WebUI.click(findTestObject('PengaturanDiskon/Page_TataPabrik/div_tanggal berakhir'))

WebUI.scrollToElement(findTestObject('PengaturanDiskon/Page_TataPabrik/td_pilih tanggal'), 2)

WebUI.click(findTestObject('PengaturanDiskon/Page_TataPabrik/td_pilih tanggal'))

WebUI.selectOptionByValue(findTestObject('PengaturanDiskon/Page_TataPabrik/select_Customer Invoice'), 'Invoice', false)

WebUI.setText(findTestObject('PengaturanDiskon/Page_TataPabrik/input_Nominal'), nominal)

WebUI.click(findTestObject('PengaturanDiskon/Page_TataPabrik/button_Simpan'))

WebUI.sendKeys(findTestObject('Object Repository/Supplier/Page_TataPabrik/input_Cari_input'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/Supplier/Page_TataPabrik/input_Cari_input'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Supplier/Page_TataPabrik/input_Cari_input'), namadiskon)

WebUI.delay(2)

String namaDiskonText = WebUI.getText(findTestObject('PengaturanDiskon/Page_TataPabrik/div_list_nama diskon'))

WebUI.verifyMatch(namaDiskonText, namadiskon, false)