package testscript2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.google.common.primitives.Booleans;

import testscript.Base;

public class TableHandling extends Base {
	public void tablePrinting()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement tab1 = driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(tab1.getText());
	}
	public void rowPrinting()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement row1 = driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[2]"));
		System.out.println(row1.getText());
	}
	public void cellPrinting()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement cell1 = driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[2]//td[3]"));
		System.out.println(cell1.getText());
	}
	public void columnPrinting()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> col1 = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));
		String s = "Ashton Cox";
		boolean found = false;
		for(WebElement list:col1)
		{
			System.out.println(list.getText());
		}
		for(WebElement list:col1)
		{
			if(list.getText().contains(s))
			{
				found = true;
				break;
			}
			else 
			{
				found = false;	
			}
		}
		if(found==true)
		{
			System.out.println("Ashton Cox present in the list");
		}
		else
		{
			System.out.println("Ashton Cox not present in the list");
		}
	}

	public static void main(String[] args) {
		TableHandling tablehandling = new TableHandling();
		tablehandling.browserInitialization();
		//tablehandling.tablePrinting();
		//tablehandling.rowPrinting();
		//tablehandling.cellPrinting();
		tablehandling.columnPrinting();

	}

}
