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
import java.nio.file.Files as Files
import java.nio.file.Paths as Paths

WebUI.callTestCase(findTestCase('Auth/LoginSuccess'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/div_Daftar Kontak'))

WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/div_Pelanggan'))

WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/span_Filter Pencarian_icon'))

WebUI.setText(findTestObject('Pelanggan/Page_TataPabrik/input_Cari_input'), namapelanggan)

WebUI.delay(2)

WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/span_lihat file pendukung'))

WebUI.click(findTestObject('Pelanggan/Page_TataPabrik/span_download file pendukung'))

String downloadPath = 'C:\\Users\\ASUS\\Downloads' // Ganti sesuai dengan path folder download

String fileName = 'valid1.jpg' // Nama file yang di-download

// Tunggu proses download selesai (jika perlu)
WebUI.delay(5)

// Periksa apakah file ada di folder download
boolean isDownloaded = Files.exists(Paths.get(downloadPath, fileName))

// Verifikasi apakah file berhasil di-download
if (isDownloaded) {
    println('File berhasil di-download: ' + fileName)

    WebUI.verifyMatch('File berhasil di-download', 'File berhasil di-download', false)
	
	File file = new File(downloadPath, fileName)
	file.delete()
} else {
    println('File gagal di-download: ' + fileName)

    WebUI.verifyMatch('File berhasil di-download', 'File gagal di-download', false)
}

WebUI.closeBrowser()

