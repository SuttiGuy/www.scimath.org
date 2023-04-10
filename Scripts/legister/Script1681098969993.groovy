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

WebUI.navigateToUrl('https://register.ocsc.go.th/registration/user/register')

WebUI.setText(findTestObject('Object Repository/Page_Register/input__name'), '1739902053451')

WebUI.setText(findTestObject('Object Repository/Page_Register/input__mail'), '644259025@webmail.npru.ac.th')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register/input__passpass1'), 'RmCl41ZeVGUJT64RjcucDQ==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register/input__passpass2'), 'RmCl41ZeVGUJT64RjcucDQ==')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Register/select_- Select a value -'), '_none', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Register/select_- Select a value -'), '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Register/select_- Select a value -_1'), '0', true)

WebUI.setText(findTestObject('Object Repository/Page_Register/input__field_firstnameund0value'), 'สุทธิพร')

WebUI.setText(findTestObject('Object Repository/Page_Register/input__field_lastnameund0value'), 'แก้วสกุลณี')

WebUI.click(findTestObject('Object Repository/Page_Register/span_10'))

WebUI.click(findTestObject('Object Repository/Page_Register/li_2'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Register/select_JanFebMarAprMayJunJulAugSepOctNovDec'), 
    '5', true)

WebUI.click(findTestObject('Object Repository/Page_Register/span_2023'))

WebUI.click(findTestObject('Object Repository/Page_Register/li_2003'))

WebUI.setText(findTestObject('Object Repository/Page_Register/input__field_telephoneund0value'), '--')

WebUI.setText(findTestObject('Object Repository/Page_Register/input__field_mobileund0value'), '0614294288')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Register/select_- Select a value -_1_2'), '_none', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Register/select_- Select a value -_1_2'), '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Register/select_- Select a value -_1_2'), '5', true)

WebUI.setText(findTestObject('Object Repository/Page_Register/input__field_pos_spund0value'), 'นักศึกษา')

WebUI.setText(findTestObject('Object Repository/Page_Register/input__captcha_response'), '8509')

WebUI.closeBrowser()

