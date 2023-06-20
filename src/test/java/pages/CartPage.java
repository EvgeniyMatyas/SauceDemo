package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage{
    public CartPage(WebDriver driver) {
        super(driver);
    }

    public static final By CART_TITLE = By.xpath("//span[@class='title' and text()='Your Cart']");
    public boolean titleIsVisible() {
        return driver.findElement(CART_TITLE).isDisplayed();
    }
    //todo

}
