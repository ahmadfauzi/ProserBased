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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Auth/LoginSuccess'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_TataPabrik/DaftarBarang/div_Inventaris'))

WebUI.click(findTestObject('Object Repository/Page_TataPabrik/DaftarBarang/div_Daftar Barang'))

WebUI.click(findTestObject('Object Repository/DaftarBarang/Page_TataPabrik/span_tab_Bahan Kemas'))

WebUI.click(findTestObject('DaftarBarang/Page_TataPabrik/span_Filter Pencarian_icon'))

WebUI.setText(findTestObject('DaftarBarang/Page_TataPabrik/input_Cari_input'), namabarang)

WebUI.delay(2)

if(namabarang == '') {
	KeywordUtil.logInfo('Nama Barang is empty')
} else if (WebUI.waitForElementPresent(findTestObject('Object Repository/DaftarBarang/Page_TataPabrik/p_Tidak ditemukan'), 2)){
	KeywordUtil.logInfo('Nama Barang is NOT found');
} else {
	WebUI.click(findTestObject('DaftarBarang/Page_TataPabrik/span_icon_rincian'))
	
	//** Verify data accuracy **
	
	String namaBarangText = WebUI.getAttribute(findTestObject('Object Repository/Page_TataPabrik/DaftarBarang/input_Nama Barang_itemName'),
		'value')
	
	WebUI.verifyMatch(namaBarangText, namabarang, false)
	
	String kodeBarangText = WebUI.getAttribute(findTestObject('Object Repository/Page_TataPabrik/DaftarBarang/input_Kode Barang_itemCode'),
		'value')
	
	WebUI.verifyMatch(kodeBarangText, kodebarang, false)
	
	String nettoText = WebUI.getAttribute(findTestObject('DaftarBarang/Page_TataPabrik/input_Netto_netto'),
		'value')
	
	String nettoDataText = netto
	
	String numericNettoText = nettoDataText.replaceAll('[^0-9]', '')
	
	WebUI.verifyMatch(nettoText, numericNettoText, false)
	
	String satuanBeratText = WebUI.getAttribute(findTestObject('DaftarBarang/Page_TataPabrik/input_Satuan Berat'),
		'value')
	
	WebUI.verifyMatch(satuanBeratText, satuanberat, false)
	
	//** Golongan test case **
	
	WebUI.verifyElementNotVisible(findTestObject('Object Repository/DaftarBarang/Page_TataPabrik/select_Golongan_NEW'), FailureHandling.STOP_ON_FAILURE)
	
	WebUI.click(findTestObject('Object Repository/DaftarBarang/Page_TataPabrik/span_Golongan_icon'))
	
	WebUI.verifyElementVisible(findTestObject('Object Repository/DaftarBarang/Page_TataPabrik/select_Golongan_NEW'), FailureHandling.STOP_ON_FAILURE)
	
	WebUI.click(findTestObject('Object Repository/DaftarBarang/Page_TataPabrik/span_Golongan_icon'))
	
	WebUI.verifyElementNotVisible(findTestObject('Object Repository/DaftarBarang/Page_TataPabrik/select_Golongan_NEW'), FailureHandling.STOP_ON_FAILURE)
}