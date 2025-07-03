package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
//1. TC-1 launch Chrome browser
//2. TC-2 go to test URL - https://www.google.com
//3. TC-3 maximize the browser window
//4. TC-4 get the URL of page
//5. TC-5 navigate to test URL - https://www.selenium.dev/
//6. TC-6 get the URL of page
//7. TC-7 navigate back to test URL - https://www.google.com
// 8. TC-8 get the URL of page
//9. TC-9 navigate one step forward to test URL - https://www.selenium.dev/
//10. TC-10 get the URL of page
//11.TC-11 refresh the current page
//12. TC-12 get the URL of page
//13. TC-13 close the browser
public class M3A5 {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = new EdgeDriver();// TC1
        driver.get("https://www.google.com/");//TC2
        driver.manage().window().maximize();//TC3
        System.out.println(driver.getCurrentUrl());//TC4

         Thread.sleep(3000);
         driver.navigate().to("https://www.selenium.dev/");//TC5
         Thread.sleep(3000);
        System.out.println(driver.getCurrentUrl());//TC6
        driver.navigate().back();//TC7
        Thread.sleep(3000);
        System.out.println(driver.getCurrentUrl());//TC8
        driver.navigate().forward();//TC9
        Thread.sleep(3000);
        System.out.println(driver.getCurrentUrl());//TC10
        driver.navigate().refresh();//TC11
        Thread.sleep(3000);
        System.out.println(driver.getCurrentUrl());//TC12
        driver.close();//TC13

    }
}
