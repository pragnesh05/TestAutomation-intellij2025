package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class WikiPage {
    WebDriver driver;

    public WikiPage(WebDriver driver) {
        this.driver = driver;

    }

    public void getShareHolderValue() {
        List<String> shareholderValue=new ArrayList<String>();

        int size = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/tbody/tr/td[1]")).size();
        for (int i = 0; i < size; i++) {
            String val = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/tbody/tr/td[1]")).get(i).getText();
            shareholderValue.add(val);
        }
        return.shareholderValue;

    }

    public void getShareHoldingValue() {
        List<String> shareholdingValue=new ArrayList<String>();
        int size = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/tbody/tr/td[2]")).size();
        for (int i = 0; i < size; i++) {
            String val = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/tbody/tr/td[2]")).get(i).getText();
            shareholdingValue.add(val);


        }
        return.shareholdingValue;

    }
}
