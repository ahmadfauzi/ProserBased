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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.callTestCase(findTestCase('Auth/LoginSuccess'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/div_Daftar Kontak'))

WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/div_Pelanggan'))

//** Input data **

WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/span_Pelanggan'))

WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_Nama Pelanggan_name'), namapelanggan)

WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_Nomor Telepon'), telepon)

WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_(Tidak wajib diisi)_mobilePhone'), nomorponsel)

WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_(Tidak wajib diisi)_email'), email)

WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_Kode Pelanggan_code'), kodepelanggan)

WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_Kelompok_kelompokId'), kelompok)

if(kelompok != '') {
	WebUI.sendKeys(findTestObject('Pelanggan/Page_TataPabrik/input_Kelompok_kelompokId'), Keys.chord(Keys.ARROW_DOWN))
	
	WebUI.sendKeys(findTestObject('Pelanggan/Page_TataPabrik/input_Kelompok_kelompokId'), Keys.chord(Keys.ENTER))
}

WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_(Tidak wajib diisi)_nik'), nik)

WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_(Tidak wajib diisi)_npwp'), npwp)

WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_Tenggat Pembayaran (hari)_paymentDeadline'), tenggat)

WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_Rp_creditLimit'), limitpiutang)

WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_(Tidak wajib diisi)_companyDetail'), infoperusahaan)

WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/span_Simpan'))

//** Verify field validation **
boolean isErrorPresent = false

if (namapelanggan == '' && WebUI.verifyElementPresent(findTestObject('Pelanggan/Page_TataPabrik/span_wajib_nama pelanggan'), 2)) {
    KeywordUtil.logInfo('Nama Pelanggan is empty and the warning text is displayed')
    isErrorPresent = true
}
if (kodepelanggan == '' && WebUI.verifyElementPresent(findTestObject('Object Repository/Pelanggan/Page_TataPabrik/span_wajib_kode pelanggan'), 
    2)) {
    KeywordUtil.logInfo('Kode Pelanggan is empty and the warning text is displayed')
    isErrorPresent = true
}
if (kelompok == '' && WebUI.verifyElementPresent(findTestObject('Object Repository/Pelanggan/Page_TataPabrik/span_wajib_kelompok'),
	2)) {
	KeywordUtil.logInfo('Kelompok is empty and the warning text is displayed')
	isErrorPresent = true
}
if (tenggat == '' && WebUI.verifyElementPresent(findTestObject('Object Repository/Pelanggan/Page_TataPabrik/span_wajib_tenggat'),
	2)) {
	KeywordUtil.logInfo('Tenggat is empty and the warning text is displayed')
	isErrorPresent = true
}
if (limitpiutang == '' && WebUI.verifyElementPresent(findTestObject('Object Repository/Pelanggan/Page_TataPabrik/span_wajib_limit piutang'),
	2)) {
	KeywordUtil.logInfo('Limit Piutang is empty and the warning text is displayed')
	isErrorPresent = true
}

if (!isErrorPresent){
	if (WebUI.waitForElementPresent(findTestObject('Object Repository/Pelanggan/Page_TataPabrik/div_AlertDialog_error duplicate'), 2)) {
		KeywordUtil.logInfo("Kode Pelanggan is duplicate and the toast message is displayed")
	} else {
		WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_Jenis Alamat_addressName0'), jenisalamat)
		
		WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/textarea_Alamat Lengkap_address0'), alamatlengkap)
		
		WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/textarea_Alamat Faktur_invoiceAddress0'), alamatfaktur)
		
		WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_Nama_picName0'), namapj)
		
		WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_Nomor Telepon_picMobileNumber'), teleponpj)
		
		WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_(Tidak wajib diisi)_emailpj'), emailpj)
		
		WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/span_Tambahkan Alamat'))
		
		WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/span_remove alamat'))
		
		WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/span_Simpan Alamat'))
		
		boolean isErrorPresentAlamat = false
		
		if (jenisalamat == '' && WebUI.verifyElementPresent(findTestObject('Object Repository/Pelanggan/Page_TataPabrik/span_wajib_alamat_jenis'), 2)) {
			KeywordUtil.logInfo('Jenis Alamat is empty and the warning text is displayed')
			isErrorPresentAlamat = true
		}
		if (alamatlengkap == '' && WebUI.verifyElementPresent(findTestObject('Object Repository/Pelanggan/Page_TataPabrik/span_wajib_alamat_lengkap'), 2)) {
			KeywordUtil.logInfo('Alamat Lengkap is empty and the warning text is displayed')
			isErrorPresentAlamat = true
		}
		if (alamatfaktur == '' && WebUI.verifyElementPresent(findTestObject('Object Repository/Pelanggan/Page_TataPabrik/span_wajib_alamat_faktur'), 2)) {
			KeywordUtil.logInfo('Alamat Faktur is empty and the warning text is displayed')
			isErrorPresentAlamat = true
		}
		if (namapj == '' && WebUI.verifyElementPresent(findTestObject('Object Repository/Pelanggan/Page_TataPabrik/span_wajib_alamat_nama pic'), 2)) {
			KeywordUtil.logInfo('Nama PIC is empty and the warning text is displayed')
			isErrorPresentAlamat = true
		}
		if (teleponpj == '' && WebUI.verifyElementPresent(findTestObject('Object Repository/Pelanggan/Page_TataPabrik/span_wajib_alamat_nomor telepon pic'), 2)) {
			KeywordUtil.logInfo('Telepon PIC is empty and the warning text is displayed')
			isErrorPresentAlamat = true
		}
		if (!isErrorPresentAlamat){
			String jenisAlamatText = WebUI.getText(findTestObject('Pelanggan/Page_TataPabrik/td_tabel_jenis alamat'))
		
			WebUI.verifyMatch(jenisAlamatText, jenisalamat, false)
			
			String alamatText = WebUI.getText(findTestObject('Pelanggan/Page_TataPabrik/td_tabel_alamat lengkap'))
			
			WebUI.verifyMatch(alamatText, alamatlengkap, false)
			
			String namaPICText = WebUI.getText(findTestObject('Pelanggan/Page_TataPabrik/td_tabel_nama PIC'))
			
			WebUI.verifyMatch(namaPICText, namapj, false)
			
			String emailPICText = WebUI.getText(findTestObject('Pelanggan/Page_TataPabrik/td_tabel_email PIC'))
			
			WebUI.verifyMatch(emailPICText, emailpj, false)
			
			String nomorPICText = WebUI.getText(findTestObject('Pelanggan/Page_TataPabrik/td_tabel_nomor PIC'))
			
			WebUI.verifyMatch(nomorPICText, teleponpj, false)
			
			WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/div_Pelanggan'))
			
			WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/span_Filter Pencarian_icon'))
			
			WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_Cari_input'), namapelanggan)
			
			WebUI.delay(2)
			
			String namaPelangganText = WebUI.getText(findTestObject('Pelanggan/Page_TataPabrik/td_tabel_nama pelanggan'))
			
			WebUI.verifyMatch(namaPelangganText, namapelanggan, false)
			
			String nomorPonselText = WebUI.getText(findTestObject('Pelanggan/Page_TataPabrik/td_tabel_nomor ponsel'))
			
			WebUI.verifyMatch(nomorPonselText, nomorponsel, false)
			
			String emailText = WebUI.getText(findTestObject('Pelanggan/Page_TataPabrik/td_tabel_email'))
			
			WebUI.verifyMatch(emailText, email, false)
		}
	}
}