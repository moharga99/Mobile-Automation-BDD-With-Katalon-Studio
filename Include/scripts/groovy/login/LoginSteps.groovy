package login
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


class LoginSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User is on the start page")
	def openApps() {
		Mobile.startApplication('D:\\Data Arga\\PRIVATE\\Private\\Document\\Doc\\Dokumen Lamaran-Mohamad Arga\\Alfagift\\alfagift.apk',
				true)
		Mobile.verifyElementExist(findTestObject('android.widget.TextView - Selamat Datang di Alfagift'), 0)
	}

	@When("User tap button Masuk")
	def tapButtonLogin() {
		Mobile.tap(findTestObject('Object Repository/android.widget.TextView - MASUK'), 0)
	}

	@And("User tap field Phone Number or Member Card Number")
	def tapFieldUsername() {
		Mobile.tap(findTestObject('Object Repository/android.widget.EditText - Nomor HPNo. kartu member'), 0)
	}

	@And("User fill field Phone Number or Member Card Number (.*)")
	def inputUsername(String phoneOrMemberCardNumber) {
		Mobile.setText(findTestObject('android.widget.EditText - Nomor HPNo. kartu member'), phoneOrMemberCardNumber, 0)
	}

	@And("User tap field Password")
	def tapFieldPassword() {
		Mobile.tap(findTestObject('android.widget.EditText - Masukkan Password'), 0)
	}

	@And("User fill field Password (.*)")
	def inputFieldPassword(String password) {
		Mobile.setEncryptedText(findTestObject('android.widget.EditText - Masukkan Password'), password, 0)
		Mobile.hideKeyboard()
	}

	@And("User tap button Lanjut")
	def tapButtonNext() {
		Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Lanjut'), 0)
	}

	@Then("User enter homepage")
	def verifyHomepage() {
		Mobile.verifyElementExist(findTestObject('Object Repository/android.widget.TextView - Beranda'), 0)
	}

	@And("User tap scan Member Card")
	def tapScanMemberCard() {
		Mobile.tap(findTestObject('android.widget.ImageView'), 0)
	}

	@And("User Scan Card")
	def delayForScan() {
		Mobile.delay(5)
	}

	@Then("User cant login to apps")
	def verifyLabelLogin() {
		Mobile.verifyElementExist(findTestObject('android.widget.TextView - MASUK'), 0)
	}

	@And("User get a validation message wrong format Phone Number or Member Card Number")
	def verifyValidationMessageWrongFormatUsername() {
		Mobile.verifyElementExist(findTestObject('android.widget.TextView - Format nomor HP atau No. kartu member anda salah. Mohon periksa kembali'),
				0)
	}

	@And("User get a validation Phone Number or Member Card Number is required")
	def verifyValidationUsernameIsRequired() {
		Mobile.verifyElementExist(findTestObject('android.widget.TextView - Nomor HP  No. kartu Member tidak boleh kosong'), 0)
	}

	@And("User get a validation Password is required")
	def verifyValidationPasswordIsRequired() {
		Mobile.verifyElementExist(findTestObject('android.widget.TextView - Kolom ini diperlukan'), 0)
	}

	@And("User get a validation wrong format Phone Number")
	def verifyValidationWrongFormatPhoneNumber() {
		Mobile.verifyElementExist(findTestObject('android.widget.TextView - Nomor HP harus di antara 10 hingga 16 digit'), 0)
	}

	@And("User get a validation message wrong format password")
	def verifyValidationWrongFormatPassword() {
		Mobile.verifyElementExist(findTestObject('android.widget.TextView - Password minimum 8 karakter'), 0)
	}

	@And("User get login failed popup")
	def verifyPopUpLoginFailed() {
		Mobile.verifyElementExist(findTestObject('android.widget.TextView - Login Gagal'), 0)
	}

	@And("User get a validation message incorrect password")
	def verifyValidationIncorrectPassword() {
		Mobile.verifyElementExist(findTestObject('android.widget.TextView - Password Anda salah. Silahkan coba lagi'), 0)
	}
}