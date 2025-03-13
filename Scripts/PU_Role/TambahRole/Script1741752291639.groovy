import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

String roleName = 'ROLE TEST ' + GlobalVariable.counter

WebUI.callTestCase(findTestCase('Auth/LoginSuccess'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Role/Page_TataPabrik/div_Pengaturan Umum'))

WebUI.click(findTestObject('Object Repository/Role/Page_TataPabrik/div_Role'))

WebUI.click(findTestObject('Object Repository/Role/Page_TataPabrik/a_Role'))

WebUI.setText(findTestObject('Object Repository/Role/Page_TataPabrik/input_Role_roles'), roleName)

WebUI.setText(findTestObject('Object Repository/Role/Page_TataPabrik/textarea_Catatan_notes'), 'test')

WebUI.click(findTestObject('Object Repository/Role/Page_TataPabrik/span_Nama Akses_check is-access'))

WebUI.click(findTestObject('Object Repository/Role/Page_TataPabrik/span_Beranda_check is-access'))

WebUI.click(findTestObject('Object Repository/Role/Page_TataPabrik/span_Simpan'))

WebUI.click(findTestObject('Object Repository/Role/Page_TataPabrik/span_Filter Pencarian_icon'))

WebUI.setText(findTestObject('Object Repository/Role/Page_TataPabrik/input_Cari_input'), roleName)

String actualRoleName = WebUI.getText(findTestObject('Object Repository/Role/Page_TataPabrik/elemen_hasil_pencarian'))

WebUI.verifyMatch(actualRoleName, roleName, false)