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
import com.kms.katalon.core.util.KeywordUtil

WebUI.callTestCase(findTestCase('Auth/LoginSuccess'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/div_Daftar Kontak'))

WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/div_Pelanggan'))

WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/span_Filter Pencarian_icon'))

WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_Cari_input'), namapelanggan)

WebUI.delay(2)

if(namapelanggan == '') {
	KeywordUtil.logInfo('Nama Pelanggan is empty')
} else if (WebUI.waitForElementPresent(findTestObject('Object Repository/DaftarBarang/Page_TataPabrik/p_Tidak ditemukan'), 2, FailureHandling.OPTIONAL)){
	KeywordUtil.logInfo('Nama Pelanggan is NOT found');
} else {
	WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/span_icon_rincian'))
	
	String namaPelangganText = WebUI.getAttribute(findTestObject('Pelanggan/Page_TataPabrik/disabled_Nama Pelanggan_name'),
		'value')
	
	WebUI.verifyMatch(namaPelangganText, namapelanggan, false)
	
	String teleponText = WebUI.getAttribute(findTestObject('Pelanggan/Page_TataPabrik/disabled_(Tidak wajib diisi)_phoneNumber'),
		'value')
	
	WebUI.verifyMatch(teleponText, telepon, false)
	
	String mobilePhoneText = WebUI.getAttribute(findTestObject('Pelanggan/Page_TataPabrik/disabled_(Tidak wajib diisi)_mobilePhone'),
		'value')
	
	WebUI.verifyMatch(mobilePhoneText, nomorponsel, false)
	
	String emailText = WebUI.getAttribute(findTestObject('Pelanggan/Page_TataPabrik/disabled_(Tidak wajib diisi)_email'), 'value')
	
	WebUI.verifyMatch(emailText, email, false)
	
	String kodePelangganText = WebUI.getAttribute(findTestObject('Pelanggan/Page_TataPabrik/disabled_Kode Pelanggan_code'),
		'value')
	
	WebUI.verifyMatch(kodePelangganText, kodepelanggan, false)
	
	String nikText = WebUI.getAttribute(findTestObject('Pelanggan/Page_TataPabrik/disabled_(Tidak wajib diisi)_nik'), 'value')
	
	WebUI.verifyMatch(nikText, nik, false)
	
	String npwpText = WebUI.getAttribute(findTestObject('Pelanggan/Page_TataPabrik/disabled_(Tidak wajib diisi)_npwp'), 'value')
	
	WebUI.verifyMatch(npwpText, npwp, false)
	
	String tenggatText = WebUI.getAttribute(findTestObject('Pelanggan/Page_TataPabrik/disabled_Tenggat Pembayaran'), 'value')
	
	WebUI.verifyMatch(tenggatText, tenggat, false)
	
	String limitPiutangText = WebUI.getAttribute(findTestObject('Pelanggan/Page_TataPabrik/disabled_Rp_creditLimit'), 'value')
	
	String actualLimitText = limitPiutangText.replace('.', '').trim()
	
	WebUI.verifyMatch(actualLimitText, limitpiutang, false)
	
	String infoPerusahaanText = WebUI.getAttribute(findTestObject('Pelanggan/Page_TataPabrik/disabled_(Tidak wajib diisi)_companyDetail'),
		'value')
	
	WebUI.verifyMatch(infoPerusahaanText, infoperusahaan, false)
}


