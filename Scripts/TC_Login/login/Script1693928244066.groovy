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

'Membuka browser'
WebUI.openBrowser('')

'Menavigasi ke Url moservice'
WebUI.navigateToUrl('https://moservice.id/')

'Layar window maximize'
WebUI.maximizeWindow()

'Screenshoot tampilan'
WebUI.takeScreenshot()

'Verify button login'
WebUI.verifyElementClickable(findTestObject('Page_login/button_login'))

'Klik button login'
WebUI.click(findTestObject('Page_login/button_login'))

'Screenshoot tampilan'
WebUI.takeScreenshot()

'Verify elemen masukan email atau phone'
WebUI.verifyElementVisible(findTestObject('Page_login/textbox_emailphone'))

'Masukan email atau phone'
WebUI.setText(findTestObject('Page_login/textbox_emailphone'), emailphone)

'Verify elemen password'
WebUI.verifyElementVisible(findTestObject('Page_login/textbox_password'))

'Masukan password'
WebUI.setText(findTestObject('Page_login/textbox_password'), password)

'Screenshoot tampilan'
WebUI.takeScreenshot()

'Verify button masuk'
WebUI.verifyElementClickable(findTestObject('Page_login/button_submit'))

'Klik button masuk'
WebUI.click(findTestObject('Page_login/button_submit'))

'Screenshoot tampilan'
WebUI.takeScreenshot()

