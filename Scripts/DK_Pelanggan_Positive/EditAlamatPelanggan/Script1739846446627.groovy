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

WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/span_Filter Pencarian_icon'))

WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_Cari_input'), namapelanggan)

WebUI.delay(2)

WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/span_icon_alamat'))

WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/span_icon_edit alamat'))

WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/input_Jenis Alamat_addressName0'))

WebUI.sendKeys(findTestObject('Pelanggan/Page_TataPabrik/input_Jenis Alamat_addressName0'), Keys.chord(Keys.CONTROL, 'a'))
WebUI.sendKeys(findTestObject('Pelanggan/Page_TataPabrik/input_Jenis Alamat_addressName0'), Keys.chord(Keys.BACK_SPACE))
WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_Jenis Alamat_addressName0'), jenisalamat_edit)

WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/textarea_Alamat Lengkap_address0'), alamatlengkap_edit)

WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/textarea_Alamat Faktur_invoiceAddress0'), alamatfaktur_edit)

WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/input_Nama_picName0'))

WebUI.sendKeys(findTestObject('Pelanggan/Page_TataPabrik/input_Nama_picName0'), Keys.chord(Keys.CONTROL, 'a'))
WebUI.sendKeys(findTestObject('Pelanggan/Page_TataPabrik/input_Nama_picName0'), Keys.chord(Keys.BACK_SPACE))
WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_Nama_picName0'), namapj_edit)

WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/input_Nomor Telepon_picMobileNumber'))

WebUI.sendKeys(findTestObject('Pelanggan/Page_TataPabrik/input_Nomor Telepon_picMobileNumber'), Keys.chord(Keys.CONTROL, 
        'a'))
WebUI.sendKeys(findTestObject('Pelanggan/Page_TataPabrik/input_Nomor Telepon_picMobileNumber'), Keys.chord(Keys.BACK_SPACE))
WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_Nomor Telepon_picMobileNumber'), teleponpj_edit)

WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/input_(Tidak wajib diisi)_emailpj'))

WebUI.sendKeys(findTestObject('Pelanggan/Page_TataPabrik/input_(Tidak wajib diisi)_emailpj'), Keys.chord(Keys.CONTROL, 'a'))
WebUI.sendKeys(findTestObject('Pelanggan/Page_TataPabrik/input_(Tidak wajib diisi)_emailpj'), Keys.chord(Keys.BACK_SPACE))
WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_(Tidak wajib diisi)_emailpj'), emailpj_edit)

WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/span_Simpan Alamat'), FailureHandling.STOP_ON_FAILURE)

String jenisAlamatText = WebUI.getText(findTestObject('Pelanggan/Page_TataPabrik/td_jenis alamat'))

WebUI.verifyMatch(jenisAlamatText, jenisalamat_edit, false)

String alamatLengkapText = WebUI.getText(findTestObject('Pelanggan/Page_TataPabrik/td_alamat lengkap'))

WebUI.verifyMatch(alamatLengkapText, alamatlengkap_edit, false)

String namaPJText = WebUI.getText(findTestObject('Pelanggan/Page_TataPabrik/td_nama PIC'))

WebUI.verifyMatch(namaPJText, namapj_edit, false)

String teleponPJText = WebUI.getText(findTestObject('Pelanggan/Page_TataPabrik/td_nomor PIC'))

WebUI.verifyMatch(teleponPJText, teleponpj_edit, false)

String emailPJText = WebUI.getText(findTestObject('Pelanggan/Page_TataPabrik/td_email PIC'))

