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

// Membuka browser
WebUI.openBrowser('')

// Bernavigasi ke situs yang akan diotomasikan
WebUI.navigateToUrl('https://demoqa.com/automation-practice-form')

// Untuk memaximize jendela browser
WebUI.maximizeWindow()

// Memberikan sedikit jeda selama 2 detik untuk menunggu proses yang sedang berjalan
WebUI.delay(2)

// Melakukan verivikasi bahwa element sudah tersedia
WebUI.verifyElementPresent(findTestObject('Page_DEMOQA/input_(10 Digits)_userNumber'), 8)

// Melakukan verifikasi bahwa element sudah ada dalam area yang dapat dilihat oleh sistem
WebUI.verifyElementVisible(findTestObject('Page_DEMOQA/input_(10 Digits)_userNumber'), FailureHandling.STOP_ON_FAILURE)

// Memberikan sedikit jeda selama 2 detik untuk menunggu proses yang sedang berjalan
WebUI.delay(2)

// Melakukan input set Text pada field object dengan menggunakan variable
WebUI.setText(findTestObject('Page_DEMOQA/input_(10 Digits)_userNumber'), MobileNumber)

// Memberikan sedikit jeda selama 2 detik untuk menunggu proses yang sedang berjalan
WebUI.delay(2)

// Melakukan verivikasi bahwa element sudah tersedia
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_DEMOQA/button_Submit'), 0)

// Memberikan sedikit jeda selama 2 detik untuk menunggu proses yang sedang berjalan
WebUI.delay(2)

// Untuk melakukan scroll ke element
WebUI.scrollToElement(findTestObject('Page_DEMOQA/button_Submit'), 100)

// Memberikan sedikit jeda selama 2 detik untuk menunggu proses yang sedang berjalan
WebUI.delay(2)

// Melakukan verifikasi bahwa element sudah ada dalam area yang dapat dilihat oleh sistem
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_DEMOQA/button_Submit'), FailureHandling.STOP_ON_FAILURE)

// Memberikan sedikit jeda selama 2 detik untuk menunggu proses yang sedang berjalan
WebUI.delay(2)

// Untuk melakukan Click ke Object
WebUI.click(findTestObject('Object Repository/Page_DEMOQA/button_Submit'))

// Memberikan sedikit jeda selama 2 detik untuk menunggu proses yang sedang berjalan
WebUI.delay(2)

// Melakukan verivikasi bahwa element sudah tersedia
WebUI.scrollToElement(findTestObject('Page_DEMOQA/input_(10 Digits)_userNumber'), 0)

// Memberikan sedikit jeda selama 2 detik untuk menunggu proses yang sedang berjalan
WebUI.delay(2)

// Melakukan verivikasi bahwa element sudah tersedia
WebUI.verifyElementPresent(findTestObject('Page_DEMOQA/input_(10 Digits)_userNumber'), 8)

// Untuk melakukan Click ke Object
WebUI.click(findTestObject('Page_DEMOQA/input_(10 Digits)_userNumber'))

// Melakukan verivikasi bahwa element sudah tersedia
WebUI.verifyElementPresent(findTestObject('Page_DEMOQA/class_Mobile_Number_Invalid'), 8)

