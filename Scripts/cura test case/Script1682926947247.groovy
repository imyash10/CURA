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

WebUI.openBrowser('https://katalon-demo-cura.herokuapp.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Page_CURA Healthcare Service/01_Make Appointment'))

WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/02_input_Username'), 'John Doe')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_CURA Healthcare Service/03t_Password_password'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/04_button_Login'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CURA Healthcare Service/05_ select_CURA Healthcare Center'), 
    'Hongkong CURA Healthcare Center', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CURA Healthcare Service/05_ select_CURA Healthcare Center'), 
    'Seoul CURA Healthcare Center', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CURA Healthcare Service/05_ select_CURA Healthcare Center'), 
    'Tokyo CURA Healthcare Center', true)

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/06_input_Apply for hospital'))

WebUI.verifyElementChecked(findTestObject('Page_CURA Healthcare Service/06_input_Apply for hospital'), 2)

WebUI.verifyElementChecked(findTestObject('Page_CURA Healthcare Service/06z_radio Medicare'), 2)

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/07_input_Medicaid_programs'))

WebUI.verifyElementChecked(findTestObject('Page_CURA Healthcare Service/07_input_Medicaid_programs'), 2)

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/08_input_None_programs'))

WebUI.verifyElementChecked(findTestObject('Page_CURA Healthcare Service/08_input_None_programs'), 2)

WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/09_input Visit Date'), '10/05/2000')

WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/10_comment section'), 'hello this dummy desc')

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/11_Book Appointment'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/12_Appointment Confirmation'), 'Appointment Confirmation')

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/13_ Homepage'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/14_cura menu'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/15_Logout'))

WebUI.closeBrowser()

