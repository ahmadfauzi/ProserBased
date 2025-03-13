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
	WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/span_icon_edit pelanggan'))
	
	WebUI.sendKeys(findTestObject('Pelanggan/Page_TataPabrik/input_Nama Pelanggan_name'), Keys.chord(Keys.CONTROL, 'a'))
	WebUI.sendKeys(findTestObject('Pelanggan/Page_TataPabrik/input_Nama Pelanggan_name'), Keys.chord(Keys.BACK_SPACE))
	WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_Nama Pelanggan_name'), namapelanggan_edit)
	
	WebUI.sendKeys(findTestObject('Pelanggan/Page_TataPabrik/input_Nomor Telepon'), Keys.chord(Keys.CONTROL, 'a'))
	WebUI.sendKeys(findTestObject('Pelanggan/Page_TataPabrik/input_Nomor Telepon'), Keys.chord(Keys.BACK_SPACE))
	WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_Nomor Telepon'), telepon_edit)
	
	WebUI.sendKeys(findTestObject('Pelanggan/Page_TataPabrik/input_(Tidak wajib diisi)_mobilePhone'), Keys.chord(Keys.CONTROL, 'a'))
	WebUI.sendKeys(findTestObject('Pelanggan/Page_TataPabrik/input_(Tidak wajib diisi)_mobilePhone'), Keys.chord(Keys.BACK_SPACE))
	WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_(Tidak wajib diisi)_mobilePhone'), nomorponsel_edit)
	
	WebUI.sendKeys(findTestObject('Pelanggan/Page_TataPabrik/input_(Tidak wajib diisi)_email'), Keys.chord(Keys.CONTROL, 'a'))
	WebUI.sendKeys(findTestObject('Pelanggan/Page_TataPabrik/input_(Tidak wajib diisi)_email'), Keys.chord(Keys.BACK_SPACE))
	WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_(Tidak wajib diisi)_email'), email_edit)
	
	WebUI.sendKeys(findTestObject('Pelanggan/Page_TataPabrik/input_Kode Pelanggan_code'), Keys.chord(Keys.CONTROL, 'a'))
	WebUI.sendKeys(findTestObject('Pelanggan/Page_TataPabrik/input_Kode Pelanggan_code'), Keys.chord(Keys.BACK_SPACE))
	WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_Kode Pelanggan_code'), kodepelanggan_edit)
	
	WebUI.sendKeys(findTestObject('Pelanggan/Page_TataPabrik/input_(Tidak wajib diisi)_nik'), Keys.chord(Keys.CONTROL, 'a'))
	WebUI.sendKeys(findTestObject('Pelanggan/Page_TataPabrik/input_(Tidak wajib diisi)_nik'), Keys.chord(Keys.BACK_SPACE))
	WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_(Tidak wajib diisi)_nik'), nik_edit)
	
	WebUI.sendKeys(findTestObject('Pelanggan/Page_TataPabrik/input_(Tidak wajib diisi)_npwp'), Keys.chord(Keys.CONTROL, 'a'))
	WebUI.sendKeys(findTestObject('Pelanggan/Page_TataPabrik/input_(Tidak wajib diisi)_npwp'), Keys.chord(Keys.BACK_SPACE))
	WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_(Tidak wajib diisi)_npwp'), npwp_edit)
	
	WebUI.sendKeys(findTestObject('Pelanggan/Page_TataPabrik/input_Tenggat Pembayaran (hari)_paymentDeadline'), Keys.chord(Keys.CONTROL, 'a'))
	WebUI.sendKeys(findTestObject('Pelanggan/Page_TataPabrik/input_Tenggat Pembayaran (hari)_paymentDeadline'), Keys.chord(Keys.BACK_SPACE))
	WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_Tenggat Pembayaran (hari)_paymentDeadline'), tenggat_edit)
	
	WebUI.sendKeys(findTestObject('Pelanggan/Page_TataPabrik/input_Rp_creditLimit'), Keys.chord(Keys.CONTROL, 'a'))
	WebUI.sendKeys(findTestObject('Pelanggan/Page_TataPabrik/input_Rp_creditLimit'), Keys.chord(Keys.BACK_SPACE))
	WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_Rp_creditLimit'), limitpiutang_edit)
	
	WebUI.sendKeys(findTestObject('Pelanggan/Page_TataPabrik/input_(Tidak wajib diisi)_companyDetail'), Keys.chord(Keys.CONTROL, 'a'))
	WebUI.sendKeys(findTestObject('Pelanggan/Page_TataPabrik/input_(Tidak wajib diisi)_companyDetail'), Keys.chord(Keys.BACK_SPACE))
	WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_(Tidak wajib diisi)_companyDetail'), infoperusahaan_edit)
	
	WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/span_Simpan'))
	
	// Ambil teks dari atribut "value"
	String namaPelangganEditText = WebUI.getAttribute(findTestObject('Pelanggan/Page_TataPabrik/disabled_Nama Pelanggan_name'),
		'value')
	
	// Verifikasi teks yang diharapkan
	WebUI.verifyMatch(namaPelangganEditText, namapelanggan_edit, false)
	
	String teleponEditText = WebUI.getAttribute(findTestObject('Pelanggan/Page_TataPabrik/disabled_(Tidak wajib diisi)_phoneNumber'),
		'value')
	
	WebUI.verifyMatch(teleponEditText, telepon_edit, false)
	
	String mobilePhoneText = WebUI.getAttribute(findTestObject('Pelanggan/Page_TataPabrik/disabled_(Tidak wajib diisi)_mobilePhone'),
		'value')
	
	WebUI.verifyMatch(mobilePhoneText, nomorponsel_edit, false)
	
	String emailText = WebUI.getAttribute(findTestObject('Pelanggan/Page_TataPabrik/disabled_(Tidak wajib diisi)_email'), 'value')
	
	WebUI.verifyMatch(emailText, email_edit, false)
	
	String kodePelangganText = WebUI.getAttribute(findTestObject('Pelanggan/Page_TataPabrik/disabled_Kode Pelanggan_code'),
		'value')
	
	WebUI.verifyMatch(kodePelangganText, kodepelanggan_edit, false)
	
	String nikText = WebUI.getAttribute(findTestObject('Pelanggan/Page_TataPabrik/disabled_(Tidak wajib diisi)_nik'), 'value')
	
	WebUI.verifyMatch(nikText, nik_edit, false)
	
	String npwpText = WebUI.getAttribute(findTestObject('Pelanggan/Page_TataPabrik/disabled_(Tidak wajib diisi)_npwp'), 'value')
	
	WebUI.verifyMatch(npwpText, npwp_edit, false)
	
	String tenggatText = WebUI.getAttribute(findTestObject('Pelanggan/Page_TataPabrik/disabled_Tenggat Pembayaran'), 'value')
	
	WebUI.verifyMatch(tenggatText, tenggat_edit, false)
	
	String limitPiutangText = WebUI.getAttribute(findTestObject('Pelanggan/Page_TataPabrik/disabled_Rp_creditLimit'), 'value')
	
	String actualLimitText = limitPiutangText.replace(".", "").trim();
	
	WebUI.verifyMatch(actualLimitText, limitpiutang_edit, false)
	
	String infoPerusahaanText = WebUI.getAttribute(findTestObject('Pelanggan/Page_TataPabrik/disabled_(Tidak wajib diisi)_companyDetail'),
		'value')
	
	WebUI.verifyMatch(infoPerusahaanText, infoperusahaan_edit, false)
	
	//**Edit kembali ke data awal**
	
	WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/div_Pelanggan'))
	
	WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/span_Filter Pencarian_icon'))
	
	WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_Cari_input'), namapelanggan_edit)
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/span_icon_edit pelanggan'))
	
	WebUI.sendKeys(findTestObject('Pelanggan/Page_TataPabrik/input_Nama Pelanggan_name'), Keys.chord(Keys.CONTROL, 'a'))
	WebUI.sendKeys(findTestObject('Pelanggan/Page_TataPabrik/input_Nama Pelanggan_name'), Keys.chord(Keys.BACK_SPACE))
	WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_Nama Pelanggan_name'), namapelanggan)
	
	WebUI.sendKeys(findTestObject('Pelanggan/Page_TataPabrik/input_Nomor Telepon'), Keys.chord(Keys.CONTROL, 'a'))
	WebUI.sendKeys(findTestObject('Pelanggan/Page_TataPabrik/input_Nomor Telepon'), Keys.chord(Keys.BACK_SPACE))
	WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_Nomor Telepon'), telepon)
	
	WebUI.sendKeys(findTestObject('Pelanggan/Page_TataPabrik/input_(Tidak wajib diisi)_mobilePhone'), Keys.chord(Keys.CONTROL, 'a'))
	WebUI.sendKeys(findTestObject('Pelanggan/Page_TataPabrik/input_(Tidak wajib diisi)_mobilePhone'), Keys.chord(Keys.BACK_SPACE))
	WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_(Tidak wajib diisi)_mobilePhone'), nomorponsel)
	
	WebUI.sendKeys(findTestObject('Pelanggan/Page_TataPabrik/input_(Tidak wajib diisi)_email'), Keys.chord(Keys.CONTROL, 'a'))
	WebUI.sendKeys(findTestObject('Pelanggan/Page_TataPabrik/input_(Tidak wajib diisi)_email'), Keys.chord(Keys.BACK_SPACE))
	WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_(Tidak wajib diisi)_email'), email)
	
	WebUI.sendKeys(findTestObject('Pelanggan/Page_TataPabrik/input_Kode Pelanggan_code'), Keys.chord(Keys.CONTROL, 'a'))
	WebUI.sendKeys(findTestObject('Pelanggan/Page_TataPabrik/input_Kode Pelanggan_code'), Keys.chord(Keys.BACK_SPACE))
	WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_Kode Pelanggan_code'), kodepelanggan)
	
	WebUI.sendKeys(findTestObject('Pelanggan/Page_TataPabrik/input_(Tidak wajib diisi)_nik'), Keys.chord(Keys.CONTROL, 'a'))
	WebUI.sendKeys(findTestObject('Pelanggan/Page_TataPabrik/input_(Tidak wajib diisi)_nik'), Keys.chord(Keys.BACK_SPACE))
	WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_(Tidak wajib diisi)_nik'), nik)
	
	WebUI.sendKeys(findTestObject('Pelanggan/Page_TataPabrik/input_(Tidak wajib diisi)_npwp'), Keys.chord(Keys.CONTROL, 'a'))
	WebUI.sendKeys(findTestObject('Pelanggan/Page_TataPabrik/input_(Tidak wajib diisi)_npwp'), Keys.chord(Keys.BACK_SPACE))
	WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_(Tidak wajib diisi)_npwp'), npwp)
	
	WebUI.sendKeys(findTestObject('Pelanggan/Page_TataPabrik/input_Tenggat Pembayaran (hari)_paymentDeadline'), Keys.chord(Keys.CONTROL, 'a'))
	WebUI.sendKeys(findTestObject('Pelanggan/Page_TataPabrik/input_Tenggat Pembayaran (hari)_paymentDeadline'), Keys.chord(Keys.BACK_SPACE))
	WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_Tenggat Pembayaran (hari)_paymentDeadline'), tenggat)
	
	WebUI.sendKeys(findTestObject('Pelanggan/Page_TataPabrik/input_Rp_creditLimit'), Keys.chord(Keys.CONTROL, 'a'))
	WebUI.sendKeys(findTestObject('Pelanggan/Page_TataPabrik/input_Rp_creditLimit'), Keys.chord(Keys.BACK_SPACE))
	WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_Rp_creditLimit'), limitpiutang)
	
	WebUI.sendKeys(findTestObject('Pelanggan/Page_TataPabrik/input_(Tidak wajib diisi)_companyDetail'), Keys.chord(Keys.CONTROL, 'a'))
	WebUI.sendKeys(findTestObject('Pelanggan/Page_TataPabrik/input_(Tidak wajib diisi)_companyDetail'), Keys.chord(Keys.BACK_SPACE))
	WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_(Tidak wajib diisi)_companyDetail'), infoperusahaan)
	
	WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/span_Simpan'))
	
	String namaPelangganText = WebUI.getAttribute(findTestObject('Pelanggan/Page_TataPabrik/disabled_Nama Pelanggan_name'),
		'value')
	
	WebUI.verifyMatch(namaPelangganText, namapelanggan, false)
	
	String teleponText = WebUI.getAttribute(findTestObject('Pelanggan/Page_TataPabrik/disabled_(Tidak wajib diisi)_phoneNumber'),
		'value')
	
	WebUI.verifyMatch(teleponText, telepon, false)
}


