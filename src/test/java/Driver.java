import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Driver  {
    private WebDriver driver;

    static private Driver object;



    public Driver() {


        while (true) {
            System.out.println("Lütfen kullanmak istediğiniz tarayıcıyı seçin: ");
            System.out.println("1 - Chrome");
            System.out.println("2 - Firefox");
            System.out.println("3 - Edge");
            System.out.println("4 - Safari");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:

                    driver = new ChromeDriver();

                    driver.manage().window().maximize();


                    return;
                case 2:

                    driver = new FirefoxDriver();

                    driver.manage().window().maximize();

                    return;
                case 3:

                    driver = new EdgeDriver();
                    driver.manage().window().maximize();

                    return;
                case 4:

                    driver = new SafariDriver();
                    driver.manage().window().maximize();

                    return;
                default:
                    System.out.println("Geçersiz seçim, lütfen tekrar deneyin.");


            }

        }





    }
    public WebDriver getDriver() {

        if (driver == null )
            object =  new Driver();

            return this.driver;



    }}


