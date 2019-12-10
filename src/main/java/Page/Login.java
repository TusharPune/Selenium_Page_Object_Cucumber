package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Base;

public class Login extends Base {
	
	@FindBy(id = "identifierId")
	WebElement UserName_TextBox;
	
	@FindBy(id = "identifierNext")
	WebElement UserName_Next;
	
	@FindBy(id = "password")
	WebElement Password_TextBox;
	
	@FindBy(id = "passwordNext")
	WebElement Password_Next;
	
	
	public Login() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	

}
