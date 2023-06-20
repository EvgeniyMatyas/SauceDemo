package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LoginTest extends BaseTest{

    @Test
    public void loginUserIsValidData(){
        loginPage.open();
        loginPage.login("standard_user","secret_sauce");
        assertTrue(inventoryPage.titleIsVisible());
    }
    
    @Test
    public void userNameShouldBeRequired(){
        loginPage.open();
        loginPage.login("","secret_sauce");
        String errorMessage = loginPage.getErrorMessage();
        assertEquals(errorMessage,"Epic sadface: Username is required","Текст сообщения не верный");
    }

    @Test
    public void passwordShouldBeRequired(){
        loginPage.open();
        loginPage.login("standard_user","");
        String errorMessage = loginPage.getErrorMessage();
        assertEquals(errorMessage,"Epic sadface: Password is required","Текст сообщения не верный");
    }

    @Test
    public void userWithInvalidData(){
        loginPage.open();
        loginPage.login("qaz","edc");
        String errorMessage = loginPage.getErrorMessage();
        assertEquals(errorMessage,"Epic sadface: Username and password do not match any user in this service","Текст сообщения не верный");
    }

    @Test
    public void lockedOutUserAutorization(){
        loginPage.open();
        loginPage.login("locked_out_user","secret_sauce");
        String errorMessage = loginPage.getErrorMessage();
        assertEquals(errorMessage,"Epic sadface: Sorry, this user has been locked out.","Текст сообщения не верный");
    }
}
