package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class M7A1 {

    public static void main(String[] args) throws InterruptedException, AWTException {

        WebDriver driver=new ChromeDriver();

        driver.get("https://smallpdf.com/word-to-pdf");
        driver.manage().window().maximize();
        Robot r=new Robot();

        r.setAutoDelay(1000);
        WebElement uploadFileElement = driver.findElement(By.id("__picker-input"));

        // Specify the absolute path to the file you want to upload
        String filePath = "C:\\project\\fileupload\\homework.docx"; // Replace with your file path

        // Send the file path to the input element
        uploadFileElement.sendKeys(filePath);

        // Locate and click the upload button (if applicable)
        WebElement uploadButton = driver.findElement(By.id("file-submit"));

        boolean isDownloadBtn=true;

        do{
            uploadButton = driver.findElement(By.xpath("//button[@class='sc-11drgl3-0 sc-1az4ycp-0 ireDIG hofZyb'][1]s"));
            if(uploadButton!=null){
                isDownloadBtn=false;
            }
        }
        while (isDownloadBtn);
        uploadButton.click();

        Thread.sleep(2000);
        driver.close();



    }
}
