package Gun02;

import Utlity.BaseDriver;
import Utlity.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _02_Ornek extends BaseDriver {
    @Test
    public void test1() {
        System.out.println("test 1 çalıştı");
        driver.get("https://opencart.abstracta.us/index.php?route=account/login");
        Tools.Bekle(5);

        WebElement inputEmail = driver.findElement(By.id("input-email"));
        inputEmail.sendKeys("kubilay__culha@hotmail.com");

        WebElement inputPassword = driver.findElement(By.id("input-password"));
        inputPassword.sendKeys("Asdasdpls111");

        WebElement loginButton = driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
        loginButton.click();

        Assert.assertTrue(driver.getTitle().equals("My Account"));
        Assert.assertEquals(driver.getTitle(),"My Account", "Login olamadı");

    }
}
