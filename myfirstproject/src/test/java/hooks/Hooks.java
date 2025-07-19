package hooks;


import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void beforecall(){
        System.out.println("execution is started");
    }



    @After
    public void closeDriver(){
        System.out.println("close the browser");

    }


    @AfterStep
    public void screenshotCapture(){
        System.out.println("Screenshot");
    }
}
