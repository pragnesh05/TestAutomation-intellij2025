package assignments;

import base.ExcelHandler;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

public class M9A3 {
    WebDriver driver;
    @BeforeClass
    public void setDriver(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }
    @DataProvider(name="LoginData")
    public Object[][] readLoginData(){
        return ExcelHandler.getExcelData("C:\\Users\\ShivShubh\\Downloads\\Book1.xlsx","SheetName")
    }



}
