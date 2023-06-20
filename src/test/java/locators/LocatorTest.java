package locators;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LocatorTest extends BaseTest {
@Test
    public void findLocatorTest(){
    driver.get(BASE_URL);
    driver.findElement(By.id("user-name")).sendKeys("standard_user");
    driver.findElement(By.name("password")).sendKeys("secret_sauce");
    driver.findElement(By.className("submit-button")).click();
    driver.findElement(By.xpath("//button[@data-test='add-to-cart-sauce-labs-bike-light']")).click();
    driver.findElement(By.xpath("//div[text()='Sauce Labs Fleece Jacket']")).click();
    driver.findElement(By.xpath("//button[contains(@class,'btn btn_primary btn_small btn_inventory')]")).click();
    driver.findElement(By.xpath("//button[contains(text(),'Back to ')]")).click();
    driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']/ancestor::a")).click();
    driver.findElement(By.xpath("//div[@class='inventory_details_desc_container']/descendant::button")).click();
    driver.findElement(By.cssSelector(".btn_secondary")).click();
    driver.findElement(By.cssSelector(".btn.btn_primary")).click();
    driver.findElement(By.cssSelector("#react-burger-menu-btn")).click();
    driver.findElement(By.cssSelector("select.product_sort_container")).click();
    driver.findElement(By.cssSelector("[value='hilo']")).click();
    driver.findElement(By.cssSelector("[class*='opping']")).click();
    driver.findElement(By.cssSelector("[data-test^='che']")).click();
    driver.findElement(By.cssSelector("[class$='cancel_link']")).click();
    driver.findElement(By.cssSelector("[class~='btn_action']")).click();
    driver.findElement(By.xpath("//div[@id = 'root']//following::input[1]")).sendKeys("Evgeniy");
    driver.findElement(By.xpath(" //input[@class='input_error form_input' and @name='lastName']")).sendKeys("Matyas");
    driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("12345");
    driver.findElement(By.xpath(" //input[@type='submit' and @class='submit-button btn btn_primary cart_button btn_action']")).click();





}
}
