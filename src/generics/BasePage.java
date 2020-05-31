package generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
public void Selectbyvisibletext(WebElement element,String text)
{
Select sel=new Select(element);
sel.selectByVisibleText(text);
}
public void Selectbyindex(WebElement element,int index)
{
	Select sel=new Select(element);
			sel.selectByIndex(index);
}
public void Selectbyvalue(WebElement element,String value)
{
	Select sel=new Select(element);
	sel.selectByValue(value);
}
public void Contextclick(WebDriver driver,WebElement onElement)
{
Actions act=new Actions(driver);
act.contextClick(onElement).perform();

}
}