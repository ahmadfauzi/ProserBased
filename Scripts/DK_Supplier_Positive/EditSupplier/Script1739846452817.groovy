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

WebUI.click(findTestObject('Salesman/Page_TataPabrik/div_Daftar Kontak'))

WebUI.click(findTestObject('Supplier/Page_TataPabrik/div_Supplier'))

WebUI.click(findTestObject('Supplier/Page_TataPabrik/span_Filter Pencarian_icon'))

WebUI.setText(findTestObject('Salesman/Page_TataPabrik/input_Cari_input'), namasupplier)

WebUI.delay(2)

WebUI.click(findTestObject('Supplier/Page_TataPabrik/span_editbutton'))

WebUI.sendKeys(findTestObject('Supplier/Page_TataPabrik/input_Nama Supplier_name'), Keys.chord(Keys.CONTROL, 'a'))
WebUI.sendKeys(findTestObject('Supplier/Page_TataPabrik/input_Nama Supplier_name'), Keys.chord(Keys.BACK_SPACE))
WebUI.setText(findTestObject('Supplier/Page_TataPabrik/input_Nama Supplier_name'), namasupplier_edit)

WebUI.sendKeys(findTestObject('Supplier/Page_TataPabrik/input_(Tidak wajib diisi)_phoneNumber'), Keys.chord(Keys.CONTROL, 'a'))
WebUI.sendKeys(findTestObject('Supplier/Page_TataPabrik/input_(Tidak wajib diisi)_phoneNumber'), Keys.chord(Keys.BACK_SPACE))
WebUI.setText(findTestObject('Supplier/Page_TataPabrik/input_(Tidak wajib diisi)_phoneNumber'), telepon_edit)

WebUI.sendKeys(findTestObject('Object Repository/Supplier/Page_TataPabrik/input_Kode_code'), Keys.chord(Keys.CONTROL, 'a'))
WebUI.sendKeys(findTestObject('Object Repository/Supplier/Page_TataPabrik/input_Kode_code'), Keys.chord(Keys.BACK_SPACE))
WebUI.setText(findTestObject('Object Repository/Supplier/Page_TataPabrik/input_Kode_code'), kode_edit)

WebUI.sendKeys(findTestObject('Object Repository/Supplier/Page_TataPabrik/input_Tenggat Pembayaran (hari)_paymentTerm'), Keys.chord(Keys.CONTROL, 'a'))
WebUI.sendKeys(findTestObject('Object Repository/Supplier/Page_TataPabrik/input_Tenggat Pembayaran (hari)_paymentTerm'), Keys.chord(Keys.BACK_SPACE))
WebUI.setText(findTestObject('Object Repository/Supplier/Page_TataPabrik/input_Tenggat Pembayaran (hari)_paymentTerm'),
	tenggat_edit)

WebUI.sendKeys(findTestObject('Supplier/Page_TataPabrik/input_(Tidak wajib diisi)_nik'), Keys.chord(Keys.CONTROL, 'a'))
WebUI.sendKeys(findTestObject('Supplier/Page_TataPabrik/input_(Tidak wajib diisi)_nik'), Keys.chord(Keys.BACK_SPACE))
WebUI.setText(findTestObject('Supplier/Page_TataPabrik/input_(Tidak wajib diisi)_nik'), nik_edit)

WebUI.sendKeys(findTestObject('Supplier/Page_TataPabrik/input_(Tidak wajib diisi)_npwp'), Keys.chord(Keys.CONTROL, 'a'))
WebUI.sendKeys(findTestObject('Supplier/Page_TataPabrik/input_(Tidak wajib diisi)_npwp'), Keys.chord(Keys.BACK_SPACE))
WebUI.setText(findTestObject('Supplier/Page_TataPabrik/input_(Tidak wajib diisi)_npwp'), npwp_edit)

WebUI.sendKeys(findTestObject('Supplier/Page_TataPabrik/input_(Tidak wajib diisi)_mobileNumber'), Keys.chord(Keys.CONTROL, 'a'))
WebUI.sendKeys(findTestObject('Supplier/Page_TataPabrik/input_(Tidak wajib diisi)_mobileNumber'), Keys.chord(Keys.BACK_SPACE))
WebUI.setText(findTestObject('Supplier/Page_TataPabrik/input_(Tidak wajib diisi)_mobileNumber'), nomorponsel_edit)

WebUI.sendKeys(findTestObject('Supplier/Page_TataPabrik/input_(Tidak wajib diisi)_emailAddress'), Keys.chord(Keys.CONTROL, 'a'))
WebUI.sendKeys(findTestObject('Supplier/Page_TataPabrik/input_(Tidak wajib diisi)_emailAddress'), Keys.chord(Keys.BACK_SPACE))
WebUI.setText(findTestObject('Supplier/Page_TataPabrik/input_(Tidak wajib diisi)_emailAddress'), email_edit)

WebUI.sendKeys(findTestObject('Supplier/Page_TataPabrik/input_(Tidak wajib diisi)_pkp'), Keys.chord(Keys.CONTROL, 'a'))
WebUI.sendKeys(findTestObject('Supplier/Page_TataPabrik/input_(Tidak wajib diisi)_pkp'), Keys.chord(Keys.BACK_SPACE))
WebUI.setText(findTestObject('Supplier/Page_TataPabrik/input_(Tidak wajib diisi)_pkp'), pkp_edit)

WebUI.sendKeys(findTestObject('Supplier/Page_TataPabrik/textarea_(Tidak wajib diisi)_note'), Keys.chord(Keys.CONTROL, 'a'))
WebUI.sendKeys(findTestObject('Supplier/Page_TataPabrik/textarea_(Tidak wajib diisi)_note'), Keys.chord(Keys.BACK_SPACE))
WebUI.setText(findTestObject('Supplier/Page_TataPabrik/textarea_(Tidak wajib diisi)_note'), catatan_edit)

WebUI.click(findTestObject('Supplier/Page_TataPabrik/span_Simpan'))

WebUI.click(findTestObject('Supplier/Page_TataPabrik/span_Filter Pencarian_icon'))

WebUI.sendKeys(findTestObject('Salesman/Page_TataPabrik/input_Cari_input'), Keys.chord(Keys.CONTROL, 'a'))
WebUI.sendKeys(findTestObject('Salesman/Page_TataPabrik/input_Cari_input'), Keys.chord(Keys.BACK_SPACE))
WebUI.setText(findTestObject('Salesman/Page_TataPabrik/input_Cari_input'), namasupplier_edit)

WebUI.delay(2)

String namaSupplierEditText = WebUI.getText(findTestObject('Supplier/Page_TataPabrik/div_namasupplier'))

WebUI.verifyMatch(namaSupplierEditText, namasupplier_edit, false)

String nomorPonselEditText = WebUI.getText(findTestObject('Supplier/Page_TataPabrik/td_nomorponsel'))

WebUI.verifyMatch(nomorPonselEditText, nomorponsel_edit, false)

String nomorTeleponEditText = WebUI.getText(findTestObject('Supplier/Page_TataPabrik/td_nomortelepon'))

WebUI.verifyMatch(nomorTeleponEditText, telepon_edit, false)

String emailEditText = WebUI.getText(findTestObject('Supplier/Page_TataPabrik/td_emailsupplier'))

WebUI.verifyMatch(emailEditText, email_edit, false)

WebUI.sendKeys(findTestObject('Salesman/Page_TataPabrik/input_Cari_input'), Keys.chord(Keys.CONTROL, 'a'))
WebUI.sendKeys(findTestObject('Salesman/Page_TataPabrik/input_Cari_input'), Keys.chord(Keys.BACK_SPACE))
WebUI.setText(findTestObject('Salesman/Page_TataPabrik/input_Cari_input'), namasupplier_edit)

WebUI.delay(2)

WebUI.click(findTestObject('Supplier/Page_TataPabrik/span_editbutton'))

WebUI.sendKeys(findTestObject('Supplier/Page_TataPabrik/input_Nama Supplier_name'), Keys.chord(Keys.CONTROL, 'a'))
WebUI.sendKeys(findTestObject('Supplier/Page_TataPabrik/input_Nama Supplier_name'), Keys.chord(Keys.BACK_SPACE))
WebUI.setText(findTestObject('Supplier/Page_TataPabrik/input_Nama Supplier_name'), namasupplier)

WebUI.sendKeys(findTestObject('Supplier/Page_TataPabrik/input_(Tidak wajib diisi)_phoneNumber'), Keys.chord(Keys.CONTROL, 'a'))
WebUI.sendKeys(findTestObject('Supplier/Page_TataPabrik/input_(Tidak wajib diisi)_phoneNumber'), Keys.chord(Keys.BACK_SPACE))
WebUI.setText(findTestObject('Supplier/Page_TataPabrik/input_(Tidak wajib diisi)_phoneNumber'), telepon)

WebUI.sendKeys(findTestObject('Object Repository/Supplier/Page_TataPabrik/input_Kode_code'), Keys.chord(Keys.CONTROL, 'a'))
WebUI.sendKeys(findTestObject('Object Repository/Supplier/Page_TataPabrik/input_Kode_code'), Keys.chord(Keys.BACK_SPACE))
WebUI.setText(findTestObject('Object Repository/Supplier/Page_TataPabrik/input_Kode_code'), kode)

WebUI.sendKeys(findTestObject('Object Repository/Supplier/Page_TataPabrik/input_Tenggat Pembayaran (hari)_paymentTerm'), Keys.chord(Keys.CONTROL, 'a'))
WebUI.sendKeys(findTestObject('Object Repository/Supplier/Page_TataPabrik/input_Tenggat Pembayaran (hari)_paymentTerm'), Keys.chord(Keys.BACK_SPACE))
WebUI.setText(findTestObject('Object Repository/Supplier/Page_TataPabrik/input_Tenggat Pembayaran (hari)_paymentTerm'),
	tenggat)

WebUI.sendKeys(findTestObject('Supplier/Page_TataPabrik/input_(Tidak wajib diisi)_nik'), Keys.chord(Keys.CONTROL, 'a'))
WebUI.sendKeys(findTestObject('Supplier/Page_TataPabrik/input_(Tidak wajib diisi)_nik'), Keys.chord(Keys.BACK_SPACE))
WebUI.setText(findTestObject('Supplier/Page_TataPabrik/input_(Tidak wajib diisi)_nik'), nik)

WebUI.sendKeys(findTestObject('Supplier/Page_TataPabrik/input_(Tidak wajib diisi)_npwp'), Keys.chord(Keys.CONTROL, 'a'))
WebUI.sendKeys(findTestObject('Supplier/Page_TataPabrik/input_(Tidak wajib diisi)_npwp'), Keys.chord(Keys.BACK_SPACE))
WebUI.setText(findTestObject('Supplier/Page_TataPabrik/input_(Tidak wajib diisi)_npwp'), npwp)

WebUI.sendKeys(findTestObject('Supplier/Page_TataPabrik/input_(Tidak wajib diisi)_mobileNumber'), Keys.chord(Keys.CONTROL, 'a'))
WebUI.sendKeys(findTestObject('Supplier/Page_TataPabrik/input_(Tidak wajib diisi)_mobileNumber'), Keys.chord(Keys.BACK_SPACE))
WebUI.setText(findTestObject('Supplier/Page_TataPabrik/input_(Tidak wajib diisi)_mobileNumber'), nomorponsel)

WebUI.sendKeys(findTestObject('Supplier/Page_TataPabrik/input_(Tidak wajib diisi)_emailAddress'), Keys.chord(Keys.CONTROL, 'a'))
WebUI.sendKeys(findTestObject('Supplier/Page_TataPabrik/input_(Tidak wajib diisi)_emailAddress'), Keys.chord(Keys.BACK_SPACE))
WebUI.setText(findTestObject('Supplier/Page_TataPabrik/input_(Tidak wajib diisi)_emailAddress'), email)

WebUI.sendKeys(findTestObject('Supplier/Page_TataPabrik/input_(Tidak wajib diisi)_pkp'), Keys.chord(Keys.CONTROL, 'a'))
WebUI.sendKeys(findTestObject('Supplier/Page_TataPabrik/input_(Tidak wajib diisi)_pkp'), Keys.chord(Keys.BACK_SPACE))
WebUI.setText(findTestObject('Supplier/Page_TataPabrik/input_(Tidak wajib diisi)_pkp'), pkp)

WebUI.sendKeys(findTestObject('Supplier/Page_TataPabrik/textarea_(Tidak wajib diisi)_note'), Keys.chord(Keys.CONTROL, 'a'))
WebUI.sendKeys(findTestObject('Supplier/Page_TataPabrik/textarea_(Tidak wajib diisi)_note'), Keys.chord(Keys.BACK_SPACE))
WebUI.setText(findTestObject('Supplier/Page_TataPabrik/textarea_(Tidak wajib diisi)_note'), catatan)

WebUI.click(findTestObject('Supplier/Page_TataPabrik/span_Simpan'))

WebUI.click(findTestObject('Supplier/Page_TataPabrik/span_Filter Pencarian_icon'))

WebUI.sendKeys(findTestObject('Salesman/Page_TataPabrik/input_Cari_input'), Keys.chord(Keys.CONTROL, 'a'))
WebUI.sendKeys(findTestObject('Salesman/Page_TataPabrik/input_Cari_input'), Keys.chord(Keys.BACK_SPACE))
WebUI.setText(findTestObject('Salesman/Page_TataPabrik/input_Cari_input'), namasupplier)

WebUI.delay(2)

String namaSupplierText = WebUI.getText(findTestObject('Supplier/Page_TataPabrik/div_namasupplier'))

WebUI.verifyMatch(namaSupplierText, namasupplier, false)

String nomorPonselText = WebUI.getText(findTestObject('Supplier/Page_TataPabrik/td_nomorponsel'))

WebUI.verifyMatch(nomorPonselText, nomorponsel, false)

String nomorTeleponText = WebUI.getText(findTestObject('Supplier/Page_TataPabrik/td_nomortelepon'))

WebUI.verifyMatch(nomorTeleponText, telepon, false)
