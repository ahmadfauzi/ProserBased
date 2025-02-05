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

WebUI.click(findTestObject('Supplier/Page_TataPabrik/span_alamatsupplier'))

WebUI.click(findTestObject('Supplier/Page_TataPabrik/span_icon_editalamat'))

WebUI.sendKeys(findTestObject('Object Repository/Supplier/Page_TataPabrik/input_Jenis Alamat_addressName0'), Keys.chord(
        Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/Supplier/Page_TataPabrik/input_Jenis Alamat_addressName0'), Keys.chord(
        Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Supplier/Page_TataPabrik/input_Jenis Alamat_addressName0'), jenisalamat_edit)

WebUI.sendKeys(findTestObject('Object Repository/Supplier/Page_TataPabrik/textarea_Alamat Lengkap_address0'), Keys.chord(
        Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/Supplier/Page_TataPabrik/textarea_Alamat Lengkap_address0'), Keys.chord(
        Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Supplier/Page_TataPabrik/textarea_Alamat Lengkap_address0'), alamatlengkap_edit)

WebUI.sendKeys(findTestObject('Object Repository/Supplier/Page_TataPabrik/input_Nama_picName0'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.sendKeys(findTestObject('Object Repository/Supplier/Page_TataPabrik/input_Nama_picName0'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Supplier/Page_TataPabrik/input_Nama_picName0'), namapj_edit)

WebUI.sendKeys(findTestObject('Object Repository/Supplier/Page_TataPabrik/input_Nomor Telepon_picPhoneNumber0'), Keys.chord(
        Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/Supplier/Page_TataPabrik/input_Nomor Telepon_picPhoneNumber0'), Keys.chord(
        Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Supplier/Page_TataPabrik/input_Nomor Telepon_picPhoneNumber0'), teleponpj_edit)

WebUI.sendKeys(findTestObject('Object Repository/Supplier/Page_TataPabrik/input_(Gunakan Format email yang benar)_picEmail0'), 
    Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/Supplier/Page_TataPabrik/input_(Gunakan Format email yang benar)_picEmail0'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Supplier/Page_TataPabrik/input_(Gunakan Format email yang benar)_picEmail0'), 
    emailpj_edit)

WebUI.click(findTestObject('Supplier/Page_TataPabrik/span_Simpan'))

String jenisAlamatText = WebUI.getText(findTestObject('Supplier/Page_TataPabrik/div_jenisalamat'))

WebUI.verifyMatch(jenisAlamatText, jenisalamat_edit, false)

String alamatText = WebUI.getText(findTestObject('Supplier/Page_TataPabrik/div_alamat'))

WebUI.verifyMatch(alamatText, alamatlengkap_edit, false)

String namaPICText = WebUI.getText(findTestObject('Supplier/Page_TataPabrik/div_namapic'))

WebUI.verifyMatch(namaPICText, namapj_edit, false)

String emailPICText = WebUI.getText(findTestObject('Supplier/Page_TataPabrik/td_emailpic'))

WebUI.verifyMatch(emailPICText, emailpj_edit, false)

String nomorPICText = WebUI.getText(findTestObject('Supplier/Page_TataPabrik/td_nomorpic'))

WebUI.verifyMatch(nomorPICText, teleponpj_edit, false)

