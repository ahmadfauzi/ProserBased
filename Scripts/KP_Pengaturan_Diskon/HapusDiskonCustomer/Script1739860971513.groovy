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

WebUI.click(findTestObject('PengaturanDiskon/Page_TataPabrik/div_Konfigurasi Pabrik'))

WebUI.click(findTestObject('PengaturanDiskon/Page_TataPabrik/div_Pengaturan Diskon'))

WebUI.click(findTestObject('Supplier/Page_TataPabrik/span_Filter Pencarian_icon'))

WebUI.setText(findTestObject('Salesman/Page_TataPabrik/input_Cari_input'), namadiskon)

WebUI.delay(2)

WebUI.click(findTestObject('PengaturanDiskon/Page_TataPabrik/span_icon_hapus diskon'))

WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/span_Batalkan'))

WebUI.click(findTestObject('PengaturanDiskon/Page_TataPabrik/span_icon_hapus diskon'))

WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/span_Hapus'))

WebUI.verifyElementPresent(findTestObject('PengaturanDiskon/Page_TataPabrik/p_Tidak ditemukan Diskon'), 3)

