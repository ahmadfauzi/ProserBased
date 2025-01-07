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

WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/div_Daftar Kontak'))

WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/div_Pelanggan'))

WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/span_Pelanggan'))

WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_Nama Pelanggan_name'), namapelanggan)

WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_Nomor Telepon'), telepon)

WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_(Tidak wajib diisi)_mobilePhone'), nomorponsel)

WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_(Tidak wajib diisi)_email'), email)

WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_Kode Pelanggan_code'), kodepelanggan)

WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/input_Kelompok_kelompokId'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/span_Group QA 1'))

WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_(Tidak wajib diisi)_nik'), nik)

WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_(Tidak wajib diisi)_npwp'), npwp)

WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_Tenggat Pembayaran (hari)_paymentDeadline'), tenggat)

WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_Rp_creditLimit'), limitpiutang)

WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_(Tidak wajib diisi)_companyDetail'), infoperusahaan)

WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/input_(Tidak wajib diisi)_paymentTerm'))

WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/span_Payment QA'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/input_(Tidak wajib diisi)_discountSelection'))

WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/div_Discount Cst QA 1'))

WebUI.uploadFile(findTestObject('Pelanggan/Page_TataPabrik/section_Drop your files here or click to upload'), 'D:\\KST\\Testdata\\valid1.jpg')

WebUI.delay(1)

WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/span_Simpan'))

WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_Jenis Alamat_addressName0'), jenisalamat)

WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/textarea_Alamat Lengkap_address0'), alamatlengkap)

WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/textarea_Alamat Faktur_invoiceAddress0'), alamatfaktur)

WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_Nama_picName0'), namapj)

WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_Nomor Telepon_picMobileNumber'), teleponpj)

WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_(Tidak wajib diisi)_emailpj'), emailpj)

WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/span_Tambahkan Alamat'))

WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/span_remove alamat'))

WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/span_Simpan Alamat'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Pelanggan/Page_TataPabrik/td_44'))

WebUI.closeBrowser()

