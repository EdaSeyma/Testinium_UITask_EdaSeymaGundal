package com.Beymen;

import com.Beymen.pages.HomePage;
import com.Beymen.utilities.ConfigReader;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class BeymenTest extends HomePage {

    @Test
    public void test01() throws InterruptedException {
        HomePage homePage=new HomePage();
        driver.get(ConfigReader.getProperty("beymenUrl"));
        homePage.verifyHomepage();
        homePage.searchBox.sendKeys("şort"+Keys.DELETE);
        homePage.searchBox.sendKeys("gömlek"+ Keys.ENTER);
        WebElement selectedProduct=homePage.selectRandomProduct();
        String productInfo =homePage.getSelectedProductInfo(selectedProduct);
        homePage.writeTextToFile(productInfo,ConfigReader.getProperty("txtFilePath"));





    }
