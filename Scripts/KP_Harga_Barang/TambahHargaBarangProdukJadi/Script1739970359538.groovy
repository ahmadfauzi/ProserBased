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
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement

WebUI.callTestCase(findTestCase('Auth/LoginSuccess'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('HargaBarang/Page_TataPabrik/div_Konfigurasi Pabrik'))

WebUI.click(findTestObject('HargaBarang/Page_TataPabrik/div_Harga Barang'))

WebUI.click(findTestObject('HargaBarang/Page_TataPabrik/button_tambah_Harga Barang'))

// Load Excel files
def dataDiskon = TestDataFactory.findTestData('Data Files/PengaturanDiskon/DiskonCustomerData')

String namaDiskon = dataDiskon.getValue('namadiskon', 1)

WebUI.setText(findTestObject('HargaBarang/Page_TataPabrik/input_Jenis Diskon_selectedDiscountType'), namaDiskon)

WebUI.sendKeys(findTestObject('HargaBarang/Page_TataPabrik/input_Jenis Diskon_selectedDiscountType'), Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(findTestObject('HargaBarang/Page_TataPabrik/input_Jenis Diskon_selectedDiscountType'), Keys.chord(Keys.ENTER))

WebUI.waitForElementPresent(findTestObject('HargaBarang/Page_TataPabrik/input_harga'), 5)

WebUI.click(findTestObject('HargaBarang/Page_TataPabrik/div_input barang'))

WebUI.delay(1)

WebUI.setText(findTestObject('HargaBarang/Page_TataPabrik/div_input barang'), namabarang)

WebUI.sendKeys(findTestObject('HargaBarang/Page_TataPabrik/div_input barang'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('HargaBarang/Page_TataPabrik/input_harga'), harga)

WebUI.click(findTestObject('HargaBarang/Page_TataPabrik/button_tambah Barang'))

WebUI.click(findTestObject('HargaBarang/Page_TataPabrik/button_hapus_barang'))

WebUI.click(findTestObject('HargaBarang/Page_TataPabrik/button_Selanjutnya'))

WebUI.click(findTestObject('HargaBarang/Page_TataPabrik/button_Simpan'))

WebUI.click(findTestObject('DaftarBarang/Page_TataPabrik/span_Filter Pencarian_icon'))

WebUI.setText(findTestObject('DaftarBarang/Page_TataPabrik/input_Cari_input'), namabarang)

WebUI.delay(2)

String namaBarangText = WebUI.getText(findTestObject('HargaBarang/Page_TataPabrik/td_tabel_nama barang'))

WebUI.verifyMatch(namaBarangText, namabarang, false)

String diskonText = WebUI.getText(findTestObject('HargaBarang/Page_TataPabrik/td_tabel_nama diskon'))

WebUI.verifyMatch(diskonText, namaDiskon, false)

String hargaText = WebUI.getText(findTestObject('HargaBarang/Page_TataPabrik/td_tabel_harga barang'))

String parts2 = hargaText.split(',00')[0]

String hargaText2 = parts2.replaceAll('[^0-9]', '')

WebUI.verifyMatch(hargaText2, harga, false)

