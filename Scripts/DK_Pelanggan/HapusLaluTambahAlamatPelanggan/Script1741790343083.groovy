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

//** Hapus Alamat ** 

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
	WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/span_icon_alamat'))
	
	if (WebUI.waitForElementPresent(findTestObject('Object Repository/DaftarBarang/Page_TataPabrik/p_Tidak ditemukan'), 2, FailureHandling.OPTIONAL)){
		KeywordUtil.logInfo('Alamat is NOT found');
	} else {
		WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/span_icon_delete alamat'))
		
		WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/span_Batalkan'))
		
		WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/span_icon_delete alamat'))
		
		WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/span_Hapus'))
		
		WebUI.verifyTextPresent('Data Alamat Pelanggan berhasil dihapus', false)
		
		//** Tambah Alamat **
		
		WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/button_Alamat Pelanggan'))
		
		WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_Jenis Alamat_addressName0'), jenisalamat)
		
		WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/textarea_Alamat Lengkap_address0'), alamatlengkap)
		
		WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/textarea_Alamat Faktur_invoiceAddress0'), alamatfaktur)
		
		WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_Nama_picName0'), namapj)
		
		WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_Nomor Telepon_picMobileNumber'), teleponpj)
		
		WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_(Tidak wajib diisi)_emailpj'), emailpj)
		
		WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/span_Tambahkan Alamat'))
		
		WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/span_remove alamat'))
		
		WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/span_Simpan Alamat'))
		
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
	}
}


