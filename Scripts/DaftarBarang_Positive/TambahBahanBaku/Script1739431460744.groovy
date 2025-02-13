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

WebUI.click(findTestObject('Object Repository/Page_TataPabrik/DaftarBarang/div_Inventaris'))

WebUI.click(findTestObject('Object Repository/Page_TataPabrik/DaftarBarang/div_Daftar Barang'))

WebUI.click(findTestObject('DaftarBarang/Page_TataPabrik/span_tab_Bahan Baku'))

WebUI.click(findTestObject('DaftarBarang/Page_TataPabrik/button_tambah jenis barang'))

WebUI.waitForElementPresent(findTestObject('DaftarBarang/Page_TataPabrik/input_Nama Barang_itemName'), 5)

WebUI.setText(findTestObject('Object Repository/Page_TataPabrik/DaftarBarang/input_Nama Barang_itemName'), namabarang)

WebUI.setText(findTestObject('Object Repository/Page_TataPabrik/DaftarBarang/input_Kode Barang_itemCode'), kodebarang)

WebUI.click(findTestObject('DaftarBarang/Page_TataPabrik/input_Satuan'))

WebUI.click(findTestObject('DaftarBarang/Page_TataPabrik/span_Satuan_Sack - 1 Kilogram'))

WebUI.setText(findTestObject('DaftarBarang/Page_TataPabrik/input_Netto_netto'), netto)

WebUI.setText(findTestObject('DaftarBarang/Page_TataPabrik/input_Satuan Berat'), satuanberat)

WebUI.setText(findTestObject('Object Repository/Page_TataPabrik/DaftarBarang/input_Rp_price'), harga)

WebUI.click(findTestObject('DaftarBarang/Page_TataPabrik/button_Simpan'))

WebUI.click(findTestObject('DaftarBarang/Page_TataPabrik/span_Filter Pencarian_icon'))

WebUI.setText(findTestObject('DaftarBarang/Page_TataPabrik/input_Cari_input'), namabarang)

WebUI.delay(2)

String namaBarangText = WebUI.getText(findTestObject('DaftarBarang/Page_TataPabrik/div_list_namabarang'))

WebUI.verifyMatch(namaBarangText, namabarang, false)

String kodeBarangText = WebUI.getText(findTestObject('DaftarBarang/Page_TataPabrik/div_list_kodebarang'))

WebUI.verifyMatch(kodeBarangText, kodebarang, false)

String satuanBeratText = WebUI.getText(findTestObject('DaftarBarang/Page_TataPabrik/div_list_satuanberat'))

WebUI.verifyMatch(satuanBeratText, satuanberat, false)