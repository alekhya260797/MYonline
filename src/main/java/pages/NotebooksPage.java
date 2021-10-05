package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NotebooksPage {
	private static WebDriver driver;

	public NotebooksPage(WebDriver driver) 
	{
	

		this.driver=driver;
	}
	//h_signiniframe
private static By notecreationbtn=By.xpath("//a[@id='NewButton']");

private static By textboxbtn=By.xpath("//input[@id='textBox']");
private static By createbtn=By.xpath("//a[@id='CreateButton']");

private static By frame= By.id("h_signiniframe");


public WebElement notebookCreationBtn()
{
	return driver.findElement(notecreationbtn);
}
public WebElement txtboxBtn()
{
	return driver.findElement(textboxbtn);
}
public WebElement createBtn()
{
	return driver.findElement(createbtn);
}

}
