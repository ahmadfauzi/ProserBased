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

WebUI.click(findTestObject('Object Repository/Supplier/Page_TataPabrik/span_Supplier'))

WebUI.setText(findTestObject('Object Repository/Supplier/Page_TataPabrik/input_Nama Supplier_name'), 'Testing Katalon')

WebUI.setText(findTestObject('Object Repository/Supplier/Page_TataPabrik/input_Kode_code'), '')

WebUI.click(findTestObject('Object Repository/Supplier/Page_TataPabrik/input_Kode_code'))

WebUI.setText(findTestObject('Object Repository/Supplier/Page_TataPabrik/input_Kode_code'), 'TK 001')

WebUI.setText(findTestObject('Object Repository/Supplier/Page_TataPabrik/input_Tenggat Pembayaran (hari)_paymentTerm'), 
    '1')

WebUI.click(findTestObject('Object Repository/Supplier/Page_TataPabrik/span_Simpan'))

WebUI.setText(findTestObject('Object Repository/Supplier/Page_TataPabrik/input_Jenis Alamat_addressName0'), 'Office 1')

WebUI.setText(findTestObject('Object Repository/Supplier/Page_TataPabrik/input_Nama_picName0'), 'Annisa')

WebUI.setText(findTestObject('Object Repository/Supplier/Page_TataPabrik/input_Nomor Telepon_picPhoneNumber0'), '0487383')

WebUI.click(findTestObject('Object Repository/Supplier/Page_TataPabrik/div_Alamat 1           Jenis Alamat  8  200_081c6e'))

WebUI.setText(findTestObject('Object Repository/Supplier/Page_TataPabrik/textarea_Alamat Lengkap_address0'), 'Jl. Prabu ')

WebUI.setText(findTestObject('Object Repository/Supplier/Page_TataPabrik/input_(Gunakan Format email yang benar)_picEmail0'), 
    'test@test.co')

WebUI.click(findTestObject('Object Repository/Supplier/Page_TataPabrik/span_Simpan_1'))

WebUI.click(findTestObject('Object Repository/Supplier/Page_TataPabrik/div_Supplier'))

WebUI.click(findTestObject('Object Repository/Supplier/Page_TataPabrik/span_Filter Pencarian_icon'))

WebUI.setText(findTestObject('Object Repository/Supplier/Page_TataPabrik/input_Cari_input'), 'Testing K')

WebUI.click(findTestObject('Object Repository/Supplier/Page_TataPabrik/div_Testing Katalon'))

