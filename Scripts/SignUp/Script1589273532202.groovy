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

WebUI.navigateToUrl('https://welcome.indihome.co.id/info-tagihan')

WebUI.click(findTestObject('SignUp/Page_Amazoncom Online Shopping for Electron_9e43a3/i_Skip to main content_hm-icon nav-sprite'))

WebUI.click(findTestObject('SignUp/Page_Amazoncom Online Shopping for Electron_9e43a3/div_Hello Sign in'))

WebUI.click(findTestObject('SignUp/Page_Amazon Sign-In/a_Create your Amazon account'))

WebUI.setText(findTestObject('SignUp/Page_Amazon Registration/input_Your name_customerName'), 'Gilang Rahmat')

WebUI.setText(findTestObject('SignUp/Page_Amazon Registration/input_Email_email'), 'gilangbc07@gmail.com')

WebUI.setEncryptedText(findTestObject('SignUp/Page_Amazon Registration/input_Password_password'), 'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.setEncryptedText(findTestObject('SignUp/Page_Amazon Registration/input_Re-enter password_passwordCheck'), 'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.click(findTestObject('SignUp/Page_Amazon Registration/input_Passwords must match_continue'))

WebUI.setText(findTestObject('SignUp/Page_Authentication required/input_Enter OTP_code'), '067437')

WebUI.click(findTestObject('SignUp/Page_Authentication required/input_Enter OTP_a-button-input'))

WebUI.closeBrowser()

