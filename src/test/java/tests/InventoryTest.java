package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class InventoryTest extends BaseTest{

    @Test
    public void validationButtonAddToCart(){
        loginPage.open();
        loginPage.login("standard_user","secret_sauce");
        inventoryPage.addItemInCartByItemName("Sauce Labs Onesie");
        inventoryPage.shoppingCartBadgeIsVisible();
        inventoryPage.removeButtonIsVisible();


    }
    @Test
    public void validationShoppingCartButton(){
        loginPage.open();
        loginPage.login("standard_user","secret_sauce");
        inventoryPage.clickShoppingCartButton();
        assertTrue(cartPage.titleIsVisible());


    }
    @Test
    public void validationItemNameButton(){
        loginPage.open();
        loginPage.login("standard_user","secret_sauce");
        inventoryPage.validationItemNameButton("Sauce Labs Backpack");
    }
}
