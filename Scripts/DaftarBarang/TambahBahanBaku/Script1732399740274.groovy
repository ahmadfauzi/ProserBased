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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://172.30.100.100:8059/login')

WebUI.setText(findTestObject('Object Repository/Page_TataPabrik/input_User name_username'), 'proser2023Pro')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_TataPabrik/input_Password_password'), 'vRRrCeg9Qho=')

WebUI.click(findTestObject('Object Repository/Page_TataPabrik/span_Login'))

WebUI.click(findTestObject('Object Repository/Page_TataPabrik/div_Inventaris'))

WebUI.click(findTestObject('Object Repository/Page_TataPabrik/div_Daftar Barang'))

WebUI.click(findTestObject('Object Repository/Page_TataPabrik/span_Bahan Baku'))

WebUI.click(findTestObject('Object Repository/Page_TataPabrik/span_Jenis Bahan Baku'))

WebUI.setText(findTestObject('Object Repository/Page_TataPabrik/input_Nama Barang_itemName'), nama)

WebUI.setText(findTestObject('Object Repository/Page_TataPabrik/input_Kode Barang_itemCode'), kodebarang)

WebUI.setText(findTestObject('Object Repository/Page_TataPabrik/input_Satuan_uom'), '')

WebUI.click(findTestObject('Object Repository/Page_TataPabrik/input_Satuan_uom'))

WebUI.click(findTestObject('Object Repository/Page_TataPabrik/span_Karung - 1 kg'))

WebUI.setText(findTestObject('Object Repository/Page_TataPabrik/input_Netto_netto'), '1')

WebUI.setText(findTestObject('Object Repository/Page_TataPabrik/input_Satuan Berat_nettoUnit'), satuanterkecil)

WebUI.setText(findTestObject('Object Repository/Page_TataPabrik/input_Rp_price'), hargabeli)

WebUI.click(findTestObject('Object Repository/Page_TataPabrik/span_Simpan'))

WebUI.click(findTestObject('Object Repository/Page_TataPabrik/span_Bahan Baku_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_TataPabrik/select_Sesuai Nama Barang DESCSesuai Nama B_a94553'), 
    'Sesuai Barang Terbaru', true)

WebUI.verifyElementText(findTestObject('Page_TataPabrik/td_Auto baku 1'), nama)

WebUI.verifyElementText(findTestObject('Page_TataPabrik/td'), kodebarang)

WebUI.verifyElementText(findTestObject('Page_TataPabrik/td_kg'), satuanterkecil)

WebUI.closeBrowser()

