package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage extends BasePage{

    public static final By INVENTORY_TITLE = By.xpath( "//span[@class='title' and text()='Products']");
    String addButtonByItemName = "//div[text()='%s']/ancestor::div[@class='inventory_item']//button";
    String itemsNames = "//button[@class='btn btn_primary btn_small btn_inventory']/ancestor::div[@id='root']//div[text()='%s']";
    public InventoryPage(WebDriver driver) {
        super(driver);
    }
    public void addItemInCartByItemName(String itemName){
        driver.findElement(By.xpath(String.format(addButtonByItemName,itemName))).click();
    }

    public void getItemName(String itemName){
        driver.findElement(By.xpath(String.format(itemsNames,itemName))).getText();
    }
    public void validationItemNameButton(String itemName){
        driver.findElement(By.xpath(String.format(itemsNames,itemName))).click();
    }

    public boolean titleIsVisible(){

        return driver.findElement(INVENTORY_TITLE).isDisplayed();
    }
    public void clickShoppingCartButton(){
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
    }
    public void shoppingCartBadgeIsVisible(){
        driver.findElement(By.xpath("//span[@class='shopping_cart_badge' and text()='1']")).isDisplayed();
    }
    public void removeButtonIsVisible(){
        driver.findElement(By.xpath("//button[@class='btn btn_secondary btn_small btn_inventory' and text()='Remove']")).isDisplayed();
    }
}
