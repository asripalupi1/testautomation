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

WebUI.navigateToUrl('https://www.service.nsw.gov.au/')

WebUI.click(findTestObject('Object Repository/Page_Home  Service NSW/a_Driving and transport'))

WebUI.click(findTestObject('Object Repository/Page_Driving and transport  Service NSW/a_Number plates'))

WebUI.click(findTestObject('Object Repository/Page_Number plates  Service NSW/a_Apply to collect number plates from anoth_d5291d'))

WebUI.click(findTestObject('Object Repository/Page_Apply to collect number plates from an_450cb5/a_Find a service centre'))

WebUI.setText(findTestObject('Page_Find a Service NSW location  Service NSW/input_Search by suburb, postcode or current_d530bf'), 
    Locate)

WebUI.verifyTextPresent(ServiceCenter, false)

