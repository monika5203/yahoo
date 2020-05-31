package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstant;
import generics.ExcelLibrary;

public class PomFramework implements AutoConstant {

	public WebDriver driver;
	
	@FindBy(xpath="//input[@name='firstName']")
	private WebElement nametextfield;
	
	@FindBy(xpath="//input[@name='lastName']")
	private WebElement lasttextfield;

	
	@FindBy(xpath="//input[@name=\'yid\']")
	private WebElement emailtextfield;

	
	@FindBy(xpath="//input[@name=\'phone\']")
	private WebElement mobiletextfield;

	
	@FindBy(xpath="//button[@type=\'submit\']")
	private WebElement submitbutton;

	public PomFramework(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
public void enterdetails() throws IOException, InterruptedException
{
	nametextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheetname, 1,0));
	Thread.sleep(9000);
	lasttextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheetname, 1, 1));
	Thread.sleep(9000);
	emailtextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheetname, 1, 2));
	Thread.sleep(9000);
	mobiletextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheetname, 1, 3));
	Thread.sleep(9000);
	submitbutton.click();
}
	
}
