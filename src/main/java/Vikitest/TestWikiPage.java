package Vikitest;

import dev.failsafe.internal.util.Assert;
import org.junit.platform.commons.annotation.Testable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;



public class TestWikiPage {

    public static void main(String[] args) {
        testFatihCount();
    }
    public static void testFatihCount(){

        WebDriver driver = new ChromeDriver();

        driver.get("https://tr.wikipedia.org/wiki/II._Mehmed");


        WebElement content = driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]"));
        String contentText = content.getText();
        int fatihcount= 0 ;

        String[] words = contentText.split("\\s+");

        for(String word : words){

            if (word.equalsIgnoreCase("Fatih")){

                fatihcount++;
            }
        }

        File file = new File("fatih_count.txt");

        try {
            FileWriter writer = new FileWriter(file);

            writer.write("Fatih kelimesi " + fatihcount + "kez geciyor." );
            writer.close();
        }catch (IOException e){

            e.printStackTrace();
        }

        driver.quit();



    }



}
