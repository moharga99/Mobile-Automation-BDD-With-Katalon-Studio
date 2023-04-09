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

Mobile.verifyElementExist(findTestObject('android.widget.TextView - Format nomor HP atau No. kartu member anda salah. Mohon periksa kembali'), 
    0)

Mobile.verifyElementExist(findTestObject('android.widget.TextView - Kolom ini diperlukan'), 0)

Mobile.verifyElementExist(findTestObject('android.widget.TextView - Login Gagal'), 0)

Mobile.verifyElementExist(findTestObject('android.widget.TextView - Nomor HP  No. kartu Member tidak boleh kosong'), 0)

Mobile.verifyElementExist(findTestObject('android.widget.TextView - Password minimum 8 karakter'), 0)

Mobile.verifyElementExist(findTestObject('android.widget.TextView - Nomor HP harus di antara 10 hingga 16 digit'), 0)

Mobile.verifyElementExist(findTestObject('android.widget.TextView - MASUK'), 0)

