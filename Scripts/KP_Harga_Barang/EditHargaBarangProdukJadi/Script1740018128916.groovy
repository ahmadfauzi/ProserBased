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

WebUI.click(findTestObject('HargaBarang/Page_TataPabrik/div_Konfigurasi Pabrik'))

WebUI.click(findTestObject('HargaBarang/Page_TataPabrik/div_Harga Barang'))

WebUI.click(findTestObject('Supplier/Page_TataPabrik/span_Filter Pencarian_icon'))

WebUI.setText(findTestObject('Salesman/Page_TataPabrik/input_Cari_input'), namabarang)

WebUI.delay(2)

WebUI.click(findTestObject('HargaBarang/Page_TataPabrik/span_icon_edit'))

WebUI.sendKeys(findTestObject('HargaBarang/Page_TataPabrik/input_harga'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('HargaBarang/Page_TataPabrik/input_harga'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('HargaBarang/Page_TataPabrik/input_harga'), harga_edit)

WebUI.click(findTestObject('HargaBarang/Page_TataPabrik/button_Selanjutnya'))

WebUI.click(findTestObject('HargaBarang/Page_TataPabrik/button_Simpan'))

WebUI.click(findTestObject('DaftarBarang/Page_TataPabrik/span_Filter Pencarian_icon'))

WebUI.setText(findTestObject('DaftarBarang/Page_TataPabrik/input_Cari_input'), namabarang)

WebUI.delay(2)

String namaBarangEditText = WebUI.getText(findTestObject('HargaBarang/Page_TataPabrik/td_tabel_nama barang'))

WebUI.verifyMatch(namaBarangEditText, namabarang, false)

String hargaEditText = WebUI.getText(findTestObject('HargaBarang/Page_TataPabrik/td_tabel_harga barang'))

String partsEdit2 = hargaEditText.split(',00')[0]

String hargaEditText2 = partsEdit2.replaceAll('[^0-9]', '')

WebUI.verifyMatch(hargaEditText2, harga_edit, false)

//Edit untuk mengembalikan data ke awal semula

WebUI.click(findTestObject('HargaBarang/Page_TataPabrik/span_icon_edit'))

WebUI.sendKeys(findTestObject('HargaBarang/Page_TataPabrik/input_harga'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('HargaBarang/Page_TataPabrik/input_harga'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('HargaBarang/Page_TataPabrik/input_harga'), harga)

WebUI.click(findTestObject('HargaBarang/Page_TataPabrik/button_Selanjutnya'))

WebUI.click(findTestObject('HargaBarang/Page_TataPabrik/button_Simpan'))

WebUI.click(findTestObject('DaftarBarang/Page_TataPabrik/span_Filter Pencarian_icon'))

WebUI.setText(findTestObject('DaftarBarang/Page_TataPabrik/input_Cari_input'), namabarang)

WebUI.delay(2)

String namaBarangText = WebUI.getText(findTestObject('HargaBarang/Page_TataPabrik/td_tabel_nama barang'))

WebUI.verifyMatch(namaBarangText, namabarang, false)

String hargaText = WebUI.getText(findTestObject('HargaBarang/Page_TataPabrik/td_tabel_harga barang'))

String parts2 = hargaText.split(',00')[0]

String hargaText2 = parts2.replaceAll('[^0-9]', '')

WebUI.verifyMatch(hargaText2, harga, false)

