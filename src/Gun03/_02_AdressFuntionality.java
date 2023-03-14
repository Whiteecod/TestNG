package Gun03;

import Utlity.BaseDriver;
import Utlity.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

/*
       Senaryo;
       1- Siteyi açınız.
       2- Adress Ekleyiniz.
       3- En son adresi edit yaparak ad ve soyadı değiştirip kaydediniz.
       4- En son adresi siliniz.
 */
public class _02_AdressFuntionality extends BaseDriver {

    @Test
    void addAddress() {
        Tools.Bekle(4);
        WebElement adress = driver.findElement(By.linkText("Address Book"));
        adress.click();

        WebElement newAdress = driver.findElement(By.linkText("New Address"));
        newAdress.click();

        WebElement firstName = driver.findElement(By.id("input-firstname"));
        firstName.sendKeys("Kubilay");

        WebElement lastName = driver.findElement(By.id("input-lastname"));
        lastName.sendKeys("Culha");

        WebElement company = driver.findElement(By.id("input-company"));
        company.sendKeys("TechnoStudy");

        WebElement address1 = driver.findElement(By.id("input-address-1"));
        address1.sendKeys("Fatih Mah 16 nolu sokak");

        WebElement city = driver.findElement(By.id("input-city"));
        city.sendKeys("Gaziantep");

        WebElement postKod = driver.findElement(By.id("input-postcode"));
        postKod.sendKeys("27500");

        WebElement country = driver.findElement(By.id("input-country"));
        Select sc = new Select(country);
        sc.selectByVisibleText("Turkey");

        // 2. Seçenek
        wait.until(ExpectedConditions.elementToBeClickable(country));

        // state yani şehir seçimi
        // WebElement options = driver.findElement(By.cssSelector("select[id='input-zone']>option"));
        // wait.until(ExpectedConditions.stalenessOf(options));

        WebElement region = driver.findElement(By.id("input-zone"));
        Select re = new Select(region);
        // re.selectByVisibleText("Ankara");
        // re.selectByValue("3321");
        re.selectByIndex(7); // tez buldum erken kaybettim 'stale element hatası'
        // selectByIndex : implicitlyWait ile ÇALIŞMIYOR. Ancak Explicitwait ile çalışır.
        // selectByVisibleText, selectByValue : findElement gibi çalıştığından
        // imlictly wait i kullanır. imlictly wait kaldırınca elementi bulamadı

        WebElement defaultAdress = driver.findElement(By.name("default"));
        if (defaultAdress.isDisplayed())
            defaultAdress.click();

        WebElement continuee = driver.findElement(By.cssSelector("[class='btn btn-primary']"));
        continuee.click();

        Tools.successMessageValidation();

    }
    @Test(dependsOnMethods = {"addAddress"})
    void editAddress() {
        WebElement adress = driver.findElement(By.linkText("Address Book"));
        adress.click();

        List<WebElement> editAll = driver.findElements(By.linkText("Edit"));
        WebElement sonEdit = editAll.get(editAll.size() -1 ); // son edit
        sonEdit.click();

        WebElement firstName = driver.findElement(By.id("input-firstname"));
        firstName.clear();
        firstName.sendKeys("Kubilay1");

        WebElement lastName = driver.findElement(By.id("input-lastname"));
        lastName.clear();
        lastName.sendKeys("Culha1");

        WebElement continuee = driver.findElement(By.cssSelector("[class='btn btn-primary']"));
        continuee.click();


    }
    @Test(dependsOnMethods = {"editAddress"})
    void deleteAddress() {

        List<WebElement> editAll = driver.findElements(By.linkText("Delete"));
        WebElement silinebilirAdres = editAll.get(editAll.size() - 2); // silinebilir 2.cisi
        silinebilirAdres.click();

        Tools.successMessageValidation();
    }
}
