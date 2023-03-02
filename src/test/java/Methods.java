import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Methods extends Driver  {


    public static void keyPress() throws InterruptedException {


        TestWikiPage.driver.getDriver().get(Url.VIKIPEDI);

        Actions actions = new Actions(TestWikiPage.driver.getDriver());

        actions.keyDown(Keys.ALT).keyDown(Keys.SHIFT).sendKeys("f").keyUp(Keys.ALT).keyUp(Keys.SHIFT).build().perform();

        actions.sendKeys("fatih sultan mehmet").build().perform();

        Thread.sleep(3000);

        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();

        Thread.sleep(2000);

        System.out.println("************ KEYPRESS METODU UYGULANDI ************");





    }

    public static void counter_writer() throws IOException, InterruptedException {

        WebElement content = TestWikiPage.driver.getDriver().findElement(By.xpath("//*[@id=\"mw-content-text\"]"));

        String contentText = content.getText();

        File contentall = new File("content_all.txt");

        FileWriter writer = new FileWriter(contentall);

        System.out.println(" ************ TÜM İÇERİK YAZDIRILDI ************");

        writer.write(contentText);


        int fatihcount = 0;

        String[] words = contentText.split("\\s+");

        for (String word : words) {

            if (word.equalsIgnoreCase("Fatih")) {

                fatihcount++;
            }
        }

        File file = new File("word_count.txt");

        try {
            writer = new FileWriter(file);

            writer.write("TEXT İÇERİSİNDE 'Fatih'  KELİMESİ " + fatihcount + " KEZ GEÇMEKTEDİR.");
            writer.close();

            System.out.println(" ************ EŞLEŞTİRİLEN KELİME SAYISI TXT DOSYASINDA BELİRTİLDİ ************");

        } catch (IOException e) {

            e.printStackTrace();
        }

        Thread.sleep(5000);

    }
}
