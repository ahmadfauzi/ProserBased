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

WebUI.click(findTestObject('Supplier/Page_TataPabrik/span_icon_rinciansupplier'))

String namaSupplierText = WebUI.getAttribute(findTestObject('Supplier/Page_TataPabrik/input_Nama Supplier_rincian'), 'value')

WebUI.verifyMatch(namaSupplierText, namasupplier, false)

String teleponText = WebUI.getAttribute(findTestObject('Supplier/Page_TataPabrik/input_(Tidak wajib diisi)_phoneNumber'), 
    'value')

WebUI.verifyMatch(teleponText, telepon, false)

String kodeText = WebUI.getAttribute(findTestObject('Supplier/Page_TataPabrik/input_Kode_code'), 'value')

WebUI.verifyMatch(kodeText, kode, false)

String tenggatText = WebUI.getAttribute(findTestObject('Supplier/Page_TataPabrik/input_Tenggat Pembayaran (hari)_paymentTerm'), 
    'value')

WebUI.verifyMatch(tenggatText, tenggat, false)

String nikText = WebUI.getAttribute(findTestObject('Supplier/Page_TataPabrik/input_(Tidak wajib diisi)_nik'), 'value')

WebUI.verifyMatch(nikText, nik, false)

String npwpText = WebUI.getAttribute(findTestObject('Supplier/Page_TataPabrik/input_(Tidak wajib diisi)_npwp'), 'value')

WebUI.verifyMatch(npwpText, npwp, false)

String nomorPonselText = WebUI.getAttribute(findTestObject('Supplier/Page_TataPabrik/input_(Tidak wajib diisi)_mobileNumber'), 
    'value')

WebUI.verifyMatch(nomorPonselText, nomorponsel, false)

String emailText = WebUI.getAttribute(findTestObject('Supplier/Page_TataPabrik/input_(Tidak wajib diisi)_emailAddress'), 
    'value')

WebUI.verifyMatch(emailText, email, false)

String pkpText = WebUI.getAttribute(findTestObject('Supplier/Page_TataPabrik/input_(Tidak wajib diisi)_pkp'), 'value')

WebUI.verifyMatch(pkpText, pkp, false)

String catatanText = WebUI.getAttribute(findTestObject('Supplier/Page_TataPabrik/textarea_(Tidak wajib diisi)_note'), 'value')

WebUI.verifyMatch(catatanText, catatan, false)

