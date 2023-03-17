package Gun06;

import Utlity.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _03_PlaceOrderElements {

    public _03_PlaceOrderElements() {
        PageFactory.initElements(BaseDriver.driver , this);
        // çalıştığı zaman burada ki driver i al
    }

    @FindBy(name = "search")
    public WebElement searchBox;

    @FindBy(css = "[class='btn btn-default btn-lg']")
    public WebElement searchButton;

    @FindBy(xpath = "//span[text()='Add to Cart']")
    public WebElement addToChart;

    @FindBy(linkText = "Shopping Cart")
    public WebElement shoppingChart;

    @FindBy(linkText = "Checkout")
    public WebElement checkOut;

    @FindBy(id = "button-payment-address")
    public WebElement continue1;

    @FindBy(id = "button-shipping-address")
    public WebElement continue2;

    @FindBy(id = "button-shipping-method")
    public WebElement continue3;

    @FindBy(name = "agree")
    public WebElement agree;

    @FindBy(id = "button-payment-method")
    public WebElement continue4;

    @FindBy(id = "button-confirm")
    public WebElement confirm;

    @FindBy(css = "[id='content']>h1")
    public WebElement msg;

}
