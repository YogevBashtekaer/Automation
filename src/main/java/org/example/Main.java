package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.openqa.driver", "C:\\Users\\yogev\\OneDrive\\שולחן העבודה\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        //  driver.navigate().to("https://www.youtube.com/");  //אופציה נוספת לפתיחת אתר
        driver.get("https://www.youtube.com/");
        //driver.manage().window().maximize();   //מגדיל את החלון
        //System.out.println(driver.getTitle());   //כותרת האתר
        System.out.println("open youtube");

        WebElement search = driver.findElement(By.id("search-form"));
        if (search != null) {
            Utils.sleep(1000);

            System.out.println("press on search");
            search.click();
            Utils.sleep(2500);
            WebElement input = search.findElement(By.id("search"));
            input.sendKeys("ac dc highway to hell");
            input.submit();
            System.out.println("enter text");

            Utils.sleep(2500);
            WebElement video = driver.findElement(By.xpath("//*[@id=\"video-title\"]/yt-formatted-string"));
            video.click();
            System.out.println("choose video");

            Utils.sleep(7000);
            WebElement mute = driver.findElement(By.xpath("//*[@id=\"movie_player\"]/div[25]/div[2]/div[1]/span/button"));
            mute.click();
            System.out.println("mute");

            Utils.sleep(2500);
            mute.click();
            System.out.println("unmute");

            Utils.sleep(2500);
            WebElement fullScreen = driver.findElement(By.xpath("//*[@id=\"movie_player\"]/div[25]/div[2]/div[2]/button[10]"));
            fullScreen.click();
            System.out.println("fullscreen");

            Utils.sleep(2500);
            fullScreen.click();
            System.out.println("out fullscreen");


            Utils.sleep(3000);
            WebElement subTitles = driver.findElement(By.xpath("//*[@id=\"movie_player\"]/div[34]/div[2]/div[2]/button[3]"));
            for (int i = 0; i < 5; i++) {
                Utils.sleep(2500);
                subTitles.click();
                System.out.println("subtitles off/on");
            }


        }

     //   search.sendKeys();
    }
}