package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SearchResultPage {
    WebDriver driver;
    public SearchResultPage(WebDriver driver) {

        this.driver=driver;
    }

    public void sortBy(){

    }
    public void selectProduct(String value){
       // driver.findElement(By.xpath("//div[@data-cel-widget='search_result_"+value+"']/descendant::a[2]")).click();
       driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[5]/div[1]/div[1]/span[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]/a[1]/div[1]/img[1]")).click();
    }
}
