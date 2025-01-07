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

WebUI.click(findTestObject('Object Repository/Page_TataPabrik/DaftarBarang/span_Bahan Baku'))

WebUI.click(findTestObject('Object Repository/Page_TataPabrik/DaftarBarang/span_Jenis Bahan Baku'))

WebUI.setText(findTestObject('Object Repository/Page_TataPabrik/DaftarBarang/input_Nama Barang_itemName'), nama)

WebUI.setText(findTestObject('Object Repository/Page_TataPabrik/DaftarBarang/input_Kode Barang_itemCode'), kodebarang)

WebUI.setText(findTestObject('Object Repository/Page_TataPabrik/DaftarBarang/input_Satuan_uom'), '')

WebUI.click(findTestObject('Object Repository/Page_TataPabrik/DaftarBarang/input_Satuan_uom'))

WebUI.click(findTestObject('Object Repository/Page_TataPabrik/DaftarBarang/span_Karung - 1 kg'))

WebUI.setText(findTestObject('Object Repository/Page_TataPabrik/input_Netto_netto'), '1')

WebUI.setText(findTestObject('Object Repository/Page_TataPabrik/DaftarBarang/input_Satuan Berat_nettoUnit'), satuanterkecil)

WebUI.setText(findTestObject('Object Repository/Page_TataPabrik/DaftarBarang/input_Rp_price'), hargabeli)

WebUI.click(findTestObject('Object Repository/Page_TataPabrik/DaftarBarang/span_Simpan'))

WebUI.click(findTestObject('Page_TataPabrik/DaftarBarang/span_Bahan Baku'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_TataPabrik/DaftarBarang/select_Sesuai Nama Barang DESCSesuai Nama B_a94553'), 
    'Sesuai Barang Terbaru', true)

WebUI.verifyElementText(findTestObject('Page_TataPabrik/DaftarBarang/td_Auto baku 1'), nama)

WebUI.verifyElementText(findTestObject('Page_TataPabrik/DaftarBarang/td'), kodebarang)

WebUI.verifyElementText(findTestObject('Page_TataPabrik/DaftarBarang/td_kg'), satuanterkecil)

WebUI.closeBrowser()

