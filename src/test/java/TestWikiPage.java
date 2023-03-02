import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import java.io.IOException;

public class TestWikiPage extends Driver {

   static Driver driver = new Driver();

    public static void main(String[] args) throws InterruptedException, IOException {




        driver.getDriver().get(Url.VIKIPEDI);


        Methods.keyPress();


        Methods.counter_writer();


        driver.getDriver().quit();


    }


    }








