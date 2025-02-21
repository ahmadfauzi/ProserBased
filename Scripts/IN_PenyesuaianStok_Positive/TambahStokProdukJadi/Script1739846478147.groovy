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

WebUI.click(findTestObject('PenyesuaianStok/Page_TataPabrik/div_Inventaris'))

WebUI.click(findTestObject('PenyesuaianStok/Page_TataPabrik/div_Penyesuaian Stok'))

WebUI.click(findTestObject('DaftarBarang/Page_TataPabrik/span_tab_Produk Jadi'))

WebUI.click(findTestObject('PenyesuaianStok/Page_TataPabrik/button_tambah_Penyesuaian Stok'))

WebUI.click(findTestObject('PenyesuaianStok/Page_TataPabrik/input_Gudang_warehouseSelector'))

WebUI.click(findTestObject('PenyesuaianStok/Page_TataPabrik/div_select_Gudang Kimia'))

WebUI.click(findTestObject('PenyesuaianStok/Page_TataPabrik/button_add Barang'))

WebUI.setText(findTestObject('PenyesuaianStok/Page_TataPabrik/input_search_barang'), namabarang)

WebUI.click(findTestObject('PenyesuaianStok/Page_TataPabrik/div_pilih barang'))

WebUI.click(findTestObject('PenyesuaianStok/Page_TataPabrik/button_Pilih'))

WebUI.click(findTestObject('PenyesuaianStok/Page_TataPabrik/button_tabel_delete barang'))

WebUI.verifyElementNotPresent(findTestObject('PenyesuaianStok/Page_TataPabrik/th_tabel_Nama'), 2)

WebUI.click(findTestObject('PenyesuaianStok/Page_TataPabrik/button_add Barang'))

WebUI.setText(findTestObject('PenyesuaianStok/Page_TataPabrik/input_search_barang'), namabarang)

WebUI.click(findTestObject('PenyesuaianStok/Page_TataPabrik/div_pilih barang'))

WebUI.click(findTestObject('PenyesuaianStok/Page_TataPabrik/button_Pilih'))

WebUI.sendKeys(findTestObject('PenyesuaianStok/Page_TataPabrik/input_tabel_qty'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('PenyesuaianStok/Page_TataPabrik/input_tabel_qty'), stok)

WebUI.click(findTestObject('PenyesuaianStok/Page_TataPabrik/button_Simpan'))

String namaBarangText = WebUI.getText(findTestObject('PenyesuaianStok/Page_TataPabrik/div_konfirm_namabarang'))

WebUI.verifyMatch(namaBarangText, namabarang, false)

WebUI.click(findTestObject('PenyesuaianStok/Page_TataPabrik/button_konfirm_Simpan'))

WebUI.click(findTestObject('KartuStock/Page_TataPabrik/div_Laporan'))

WebUI.click(findTestObject('KartuStock/Page_TataPabrik/div_Kartu Stock'))

WebUI.click(findTestObject('DaftarBarang/Page_TataPabrik/span_tab_Produk Jadi'))

WebUI.click(findTestObject('DaftarBarang/Page_TataPabrik/span_Filter Pencarian_icon'))

WebUI.setText(findTestObject('DaftarBarang/Page_TataPabrik/input_Cari_input'), namabarang)

WebUI.delay(2)

String qtyMasukText = WebUI.getText(findTestObject('KartuStock/Page_TataPabrik/td_Qty Akhir'))

WebUI.verifyMatch(qtyMasukText, stok, false)

