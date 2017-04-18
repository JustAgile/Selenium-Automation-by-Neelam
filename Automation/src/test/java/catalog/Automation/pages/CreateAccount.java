package catalog.Automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import catalog.Automation.common.CommonMethods;





public class CreateAccount {
	private WebDriver driver;
        CommonMethods CM;
	
	public CreateAccount(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver,this);
		CM=new CommonMethods();
		CM.verifyText("My Account Information");	
	}
	
	@FindBy(how= How.XPATH, using = "//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[1]/td[2]/input[1]" )
	private WebElement GENDERMALE;
	
	@FindBy(how= How.XPATH, using = "//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[1]/td[2]/input[2]" )
	private WebElement GENDERFEMALE;
	
	@FindBy(how = How.NAME, using = "firstname")
	private WebElement FIRSTNAME;
	
	@FindBy(how = How.NAME, using = "lastname")
	private WebElement LASTNAME;
	
	@FindBy(how = How.NAME, using = "dob")
	private WebElement DATEOFBIRTH;
	
	@FindBy(how = How.NAME, using = "email_address")
	private WebElement EMAILADDRESS;
	
	@FindBy(how = How.NAME, using = "company")
	private WebElement COMPANYNAME;
	
	@FindBy(how = How.NAME, using = "street_address")
	private WebElement STREETADDRESS;
	
	@FindBy(how = How.NAME, using = "suburb")
	private WebElement SUBURB;
	
	@FindBy(how = How.NAME, using = "postcode")
	private WebElement POSTCODE;
	
	@FindBy(how = How.NAME, using = "city")
	private WebElement CITY;
	
	@FindBy(how = How.NAME, using = "state")
	private WebElement STATE;
	
	@FindBy(how = How.NAME, using = "country")
	private WebElement COUNTRY;
	
	@FindBy(how = How.NAME, using = "telephone")
	private WebElement TELEPHONENUMBER;
	
	@FindBy(how = How.NAME, using = "fax")
	private WebElement FAXNUMBER;
	
	@FindBy(how = How.NAME, using = "newsletter")
	private WebElement NEWSLETTER;
	
	@FindBy(how = How.NAME, using = "password")
	private WebElement PASSWORD;
	
	@FindBy(how = How.NAME, using = "confirmation")
	private WebElement PASSWORDCONFIRMATION;
	
	@FindBy (how = How.ID, using = "tdb4")
	private WebElement CONTINUE;
	
	public void selectGenderMale(){
		CM.click(GENDERMALE);	
	}
	
	public void selectGenderFemale(){
		CM.click(GENDERFEMALE);
	}
	
	public void enterFirstName(String fisrtname){
		CM.setValue(FIRSTNAME, fisrtname);
	}
	
	public void enterEmail(String email){
		CM.setValue(EMAILADDRESS, email);
	}
	
	public void enterCompanyName(String companyname){
		CM.setValue(COMPANYNAME, companyname);
	}
	
	public void enterStreetAddress(String streetaddress){
		CM.setValue(STREETADDRESS, streetaddress);
	}
	
	public void enterSuburb(String suburb){
		CM.setValue(SUBURB, suburb);
	}
	
	public void enterPostCode(String postcode){
		CM.setValue(POSTCODE, postcode);
	}
	
	public void enterCity(String city){
		CM.setValue(CITY, city);
	}
	
	public void enterState(String state){
		CM.setValue(STATE, state);
	}

	public void enterCountry(String country){
		CM.setValue(COUNTRY, country);
	}
	
	public void enterTelephone(String telephone){
		CM.setValue(TELEPHONENUMBER, telephone);
	}
	
	public void enterFax(String fax){
		CM.setValue(FAXNUMBER, fax);
	}
	
	public void SelectNewsLetter(){
		CM.click(NEWSLETTER);
	}
	
	public void enterPassword(String password){
		CM.setValue(PASSWORD, password);
	}
	public void enterPasswordConfirmation(String confirmation){
		CM.setValue(PASSWORDCONFIRMATION, confirmation);
	}
	
	public void clickContinue(){
		CM.click(CONTINUE);;
	}
	
}
