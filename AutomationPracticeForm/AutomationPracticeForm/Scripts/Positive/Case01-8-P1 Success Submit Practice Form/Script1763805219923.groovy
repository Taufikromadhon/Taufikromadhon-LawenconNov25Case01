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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

// Membuka browser
WebUI.openBrowser('')

// Bernavigasi ke situs yang akan diotomasikan
WebUI.navigateToUrl('https://demoqa.com/automation-practice-form')

// Memberikan sedikit jeda selama 2 detik untuk menunggu proses yang sedang berjalan
WebUI.delay(2)

// Untuk memaximize jendela browser
WebUI.maximizeWindow()

// Melakukan verivikasi bahwa element sudah tersedia
WebUI.verifyElementPresent(findTestObject('Page_DEMOQA/input_Name_firstName'), 8)

// Melakukan verifikasi bahwa element sudah ada dalam area yang dapat dilihat oleh sistem dengan failure handling
WebUI.verifyElementVisible(findTestObject('Page_DEMOQA/input_Name_firstName'), FailureHandling.STOP_ON_FAILURE)

// Melakukan input set Text pada field object dengan menggunakan variable
WebUI.setText(findTestObject('Page_DEMOQA/input_Name_firstName'), Firstname)

// Melakukan verivikasi bahwa element sudah tersedia
WebUI.verifyElementPresent(findTestObject('Page_DEMOQA/input_Name_lastName'), 8)

// Melakukan verifikasi bahwa element sudah ada dalam area yang dapat dilihat oleh sistem dengan failure handling
WebUI.verifyElementVisible(findTestObject('Page_DEMOQA/input_Name_lastName'), FailureHandling.STOP_ON_FAILURE)

// Melakukan input set Text pada field object dengan menggunakan variable
WebUI.setText(findTestObject('Page_DEMOQA/input_Name_lastName'), Lastname)

// Melakukan verivikasi bahwa element sudah tersedia
WebUI.verifyElementPresent(findTestObject('Page_DEMOQA/input_Email_userEmail'), 8)

// Untuk melakukan scroll ke element
WebUI.scrollToElement(findTestObject('Page_DEMOQA/input_Email_userEmail'), 8)

// Memberikan sedikit jeda selama 2 detik untuk menunggu proses yang sedang berjalan
WebUI.delay(2)

// Melakukan verifikasi bahwa element sudah ada dalam area yang dapat dilihat oleh sistem dengan failure handling
WebUI.verifyElementVisible(findTestObject('Page_DEMOQA/input_Email_userEmail'), FailureHandling.STOP_ON_FAILURE)

// Melakukan input set Text pada field object dengan menggunakan variable
WebUI.setText(findTestObject('Page_DEMOQA/input_Email_userEmail'), EmailAddress)

// Melakukan verivikasi bahwa element sudah tersedia
WebUI.verifyElementPresent(findTestObject('Page_DEMOQA/input_Gender_Male'), 8)

// Melakukan verivikasi bahwa element sudah tersedia
WebUI.verifyElementPresent(findTestObject('Page_DEMOQA/input_Gender_Female'), 8)

// Melakukan verivikasi bahwa element sudah tersedia
WebUI.verifyElementPresent(findTestObject('Page_DEMOQA/input_Gender_Other'), 8)

// Untuk melakukan scroll ke element
WebUI.scrollToElement(findTestObject('Page_DEMOQA/input_Gender_Male'), 100)

// Memberikan sedikit jeda selama 2 detik untuk menunggu proses yang sedang berjalan
WebUI.delay(2)

// Memberikan flag agar tidak merun Scenario Step
not_run: WebUI.verifyElementClickable(findTestObject('Page_DEMOQA/input_Gender_Male'), FailureHandling.STOP_ON_FAILURE)

// Untuk melakukan Click berulang ke Object
WebUI.enhancedClick(findTestObject('Page_DEMOQA/input_Gender_Male'))

// Melakukan verivikasi bahwa element sudah tersedia
WebUI.verifyElementPresent(findTestObject('Page_DEMOQA/input_(10 Digits)_userNumber'), 8)

// Untuk melakukan scroll ke element
WebUI.scrollToElement(findTestObject('Page_DEMOQA/input_(10 Digits)_userNumber'), 8)

// Memberikan sedikit jeda selama 2 detik untuk menunggu proses yang sedang berjalan
WebUI.delay(2)

// Melakukan verifikasi bahwa element sudah ada dalam area yang dapat dilihat oleh sistem dengan failure handling
WebUI.verifyElementVisible(findTestObject('Page_DEMOQA/input_(10 Digits)_userNumber'), FailureHandling.STOP_ON_FAILURE)

// Melakukan input set Text pada field object dengan menggunakan variable
WebUI.setText(findTestObject('Page_DEMOQA/input_(10 Digits)_userNumber'), MobileNumber)

// Melakukan verivikasi bahwa element sudah tersedia
WebUI.verifyElementPresent(findTestObject('Page_DEMOQA/input_DateOfBirth_old'), 8)

// Melakukan verifikasi bahwa element sudah ada dalam area yang dapat dilihat oleh sistem dengan failure handling
WebUI.verifyElementVisible(findTestObject('Page_DEMOQA/input_DateOfBirth_old'), FailureHandling.STOP_ON_FAILURE)

// Mengirimkan Input Keyboard key ke Object
WebUI.sendKeys(findTestObject('Page_DEMOQA/input_DateOfBirth_old'), Keys.chord(Keys.ARROW_LEFT, Keys.ARROW_LEFT, Keys.ARROW_LEFT, 
        Keys.ARROW_LEFT, Keys.ARROW_LEFT, Keys.ARROW_LEFT, Keys.ARROW_LEFT, Keys.ARROW_LEFT, Keys.ARROW_LEFT, Keys.ARROW_LEFT, 
        Keys.ARROW_LEFT))

// Memberikan sedikit jeda selama 2 detik untuk menunggu proses yang sedang berjalan
WebUI.delay(2)

// Mengirimkan Input Keyboard key ke Object
WebUI.sendKeys(findTestObject('Page_DEMOQA/input_DateOfBirth_old'), Keys.chord(Keys.DELETE, Keys.DELETE, Keys.DELETE, Keys.DELETE, 
        Keys.DELETE, Keys.DELETE, Keys.DELETE, Keys.DELETE, Keys.DELETE, Keys.DELETE))

// Melakukan input set Text pada field object dengan menggunakan variable
WebUI.setText(findTestObject('Page_DEMOQA/input_DateOfBirth_old'), DateOfBirth)

// Mengirimkan Input Keyboard key ke Object
WebUI.sendKeys(findTestObject('Page_DEMOQA/input_DateOfBirth_old'), Keys.chord(Keys.ARROW_LEFT, Keys.ARROW_LEFT, Keys.ARROW_LEFT, 
        Keys.ARROW_LEFT, Keys.ARROW_LEFT, Keys.ARROW_LEFT, Keys.ARROW_LEFT, Keys.ARROW_LEFT, Keys.ARROW_LEFT, Keys.ARROW_LEFT, 
        Keys.ARROW_LEFT))

// Memberikan sedikit jeda selama 2 detik untuk menunggu proses yang sedang berjalan
WebUI.delay(2)

WebUI.sendKeys(findTestObject('Page_DEMOQA/input_DateOfBirth_old'), Keys.chord(Keys.BACK_SPACE, Keys.ENTER))

// Memberikan sedikit jeda selama 2 detik untuk menunggu proses yang sedang berjalan
WebUI.delay(2)

// Melakukan verivikasi bahwa element sudah tersedia
WebUI.verifyElementPresent(findTestObject('Page_DEMOQA/input_SubjectsInput'), 8)

// Untuk melakukan scroll ke element
WebUI.scrollToElement(findTestObject('Page_DEMOQA/input_SubjectsInput'), 8)

// Memberikan sedikit jeda selama 2 detik untuk menunggu proses yang sedang berjalan
WebUI.delay(2)

// Melakukan verifikasi bahwa element sudah ada dalam area yang dapat dilihat oleh sistem dengan failure handling
WebUI.verifyElementVisible(findTestObject('Page_DEMOQA/input_SubjectsInput'), FailureHandling.STOP_ON_FAILURE)

// Melakukan input set Text pada field object dengan menggunakan variable
WebUI.setText(findTestObject('Page_DEMOQA/input_SubjectsInput'), Subjects)

WebUI.sendKeys(findTestObject('Page_DEMOQA/input_SubjectsInput'), Keys.chord(Keys.ENTER))

// Melakukan verivikasi bahwa element sudah tersedia
WebUI.verifyElementPresent(findTestObject('Page_DEMOQA/input_Hobbies_Sports'), 8)

// Melakukan verivikasi bahwa element sudah tersedia
WebUI.verifyElementPresent(findTestObject('Page_DEMOQA/input_Hobbies_Reading'), 8)

// Melakukan verivikasi bahwa element sudah tersedia
WebUI.verifyElementPresent(findTestObject('Page_DEMOQA/input_Hobbies_Music'), 8)

// Untuk melakukan scroll ke element
WebUI.scrollToElement(findTestObject('Page_DEMOQA/input_Hobbies_Sports'), 8)

// Memberikan sedikit jeda selama 2 detik untuk menunggu proses yang sedang berjalan
WebUI.delay(2)

// Untuk melakukan Click berulang ke Object
WebUI.enhancedClick(findTestObject('Page_DEMOQA/input_Hobbies_Sports'))

// Melakukan verivikasi bahwa element sudah tersedia
WebUI.verifyElementPresent(findTestObject('Page_DEMOQA/input_Browse'), 8)

// Melakukan verivikasi bahwa element sudah tersedia
WebUI.verifyElementPresent(findTestObject('Page_DEMOQA/input_Browse'), 8)

// Melakukan upload file dengan source file berasal dari project dir + path local
WebUI.uploadFile(findTestObject('Page_DEMOQA/input_Browse'), RunConfiguration.getProjectDir() + FilePathInputBrowse)

// Memberikan sedikit jeda selama 2 detik untuk menunggu proses yang sedang berjalan
WebUI.delay(2)

// Mentriger untuk kembali ke konten default
WebUI.switchToDefaultContent(FailureHandling.STOP_ON_FAILURE)

// Memberikan sedikit jeda selama 2 detik untuk menunggu proses yang sedang berjalan
WebUI.delay(2)

// Melakukan verivikasi bahwa element sudah tersedia
WebUI.verifyElementPresent(findTestObject('Page_DEMOQA/textarea_CurrentAddress'), 8)

// Untuk melakukan scroll ke element
WebUI.scrollToElement(findTestObject('Page_DEMOQA/textarea_CurrentAddress'), 8)

// Melakukan verifikasi bahwa element sudah ada dalam area yang dapat dilihat oleh sistem dengan failure handling
WebUI.verifyElementVisible(findTestObject('Page_DEMOQA/textarea_CurrentAddress'), FailureHandling.STOP_ON_FAILURE)

// Melakukan input set Text pada field object dengan menggunakan variable
WebUI.setText(findTestObject('Page_DEMOQA/textarea_CurrentAddress'), CurrentAddress)

// Melakukan verivikasi bahwa element sudah tersedia
WebUI.verifyElementPresent(findTestObject('Page_DEMOQA/input_Select_State_old'), 8)

// Untuk melakukan scroll ke element
WebUI.scrollToElement(findTestObject('Page_DEMOQA/input_Select_State_old'), 8)

// Memberikan sedikit jeda selama 2 detik untuk menunggu proses yang sedang berjalan
WebUI.delay(2)

// Untuk melakukan Click berulang dengan failure handling ke Object
WebUI.enhancedClick(findTestObject('Page_DEMOQA/input_Select_State_old'), FailureHandling.STOP_ON_FAILURE)

// Melakukan input set Text pada field object dengan menggunakan variable
WebUI.setText(findTestObject('Page_DEMOQA/input_Select_State_old'), State)

// Mengirimkan Input Keyboard key ke Object
WebUI.sendKeys(findTestObject('Page_DEMOQA/input_Select_State_old'), Keys.chord(Keys.ENTER))

// Memberikan sedikit jeda selama 2 detik untuk menunggu proses yang sedang berjalan
WebUI.delay(2)

// Melakukan verivikasi bahwa element sudah tersedia
WebUI.verifyElementPresent(findTestObject('Page_DEMOQA/input_Select_City'), 0)

// Untuk melakukan Click berulang dengan failure handling ke Object
WebUI.enhancedClick(findTestObject('Page_DEMOQA/input_Select_City'), FailureHandling.STOP_ON_FAILURE)

// Melakukan input set Text pada field object dengan menggunakan variable
WebUI.setText(findTestObject('Page_DEMOQA/input_Select_City'), City)

// Mengirimkan Input Keyboard key ke Object
WebUI.sendKeys(findTestObject('Page_DEMOQA/input_Select_City'), Keys.chord(Keys.ENTER))

// Memberikan sedikit jeda selama 2 detik untuk menunggu proses yang sedang berjalan
WebUI.delay(2)

// Melakukan verivikasi bahwa element sudah tersedia
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_DEMOQA/button_Submit'), 0)

// Untuk melakukan scroll ke element
WebUI.scrollToElement(findTestObject('Object Repository/Page_DEMOQA/button_Submit'), 0)

// Memberikan sedikit jeda selama 2 detik untuk menunggu proses yang sedang berjalan
WebUI.delay(2)

// Melakukan verifikasi bahwa element sudah ada dalam area yang dapat dilihat oleh sistem dengan failure handling
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_DEMOQA/button_Submit'), FailureHandling.STOP_ON_FAILURE)

// Memberikan sedikit jeda selama 2 detik untuk menunggu proses yang sedang berjalan
WebUI.delay(2)

// Untuk melakukan Click ke Object
WebUI.click(findTestObject('Object Repository/Page_DEMOQA/button_Submit'))

// Memberikan sedikit jeda selama 2 detik untuk menunggu proses yang sedang berjalan
WebUI.delay(2)

// Melakukan verifikasi bahwa element sudah ada dalam area yang dapat dilihat oleh sistem
WebUI.verifyElementVisible(findTestObject('Page_DEMOQA/div_Modal_Success'))

// Melakukan verivikasi bahwa element sudah tersedia
WebUI.verifyElementPresent(findTestObject('Page_DEMOQA/button_Close'), 0)

// Melakukan verifikasi bahwa element sudah ada dalam area yang dapat dilihat oleh sistem
WebUI.verifyElementVisible(findTestObject('Page_DEMOQA/button_Close'))

