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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://qa.c2cassets.com/doctor/login')

WebUI.setText(findTestObject('Object Repository/Page_Connect2Clinic/input_Login to Virtual Clinic_OTP-input'), '8072536860')

WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/button_Continue'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Connect2Clinic/input_Edit_password-input'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/button_No'))

WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/button_Book Appointment'))

WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/li_In-Clinic Consultation'))

WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/button_0635 PM-0637 PM'))

WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/button_Save  Continue'))

WebUI.setText(findTestObject('Object Repository/Page_Connect2Clinic/input_Mobile Number_patient_no'), '8919')

WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/h5_Sai'))

WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/input_Sex_patient_gender'))

WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/button_Save  Continue'))

WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/button_Pay at Clinic'))

WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/button_Proceed'))

WebUI.click(findTestObject('Object Repository/Page_Connect2Clinic/button_Okay'))

WebUI.closeBrowser()