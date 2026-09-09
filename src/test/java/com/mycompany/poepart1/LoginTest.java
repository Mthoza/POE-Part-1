/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.poepart1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public class LoginTest {
    
    @Test
    public void testCheckUserNameCorrectlyFormatted() {
        Login login = new Login("+27838968976", "kyl_1", "Ch&&sec@ke99!");
        assertTrue(login.checkUserName());
    }

    @Test
    public void testCheckUserNameIncorrectlyFormatted() {
        Login login = new Login("+27838968976", "kyle!!!!!!", "Ch&&sec@ke99!");
        assertFalse(login.checkUserName());
    }


    @Test
    public void testCheckPasswordMeetsComplexity() {
        Login login = new Login("+27838968976", "kyl_1", "Ch&&sec@ke99!");
        assertTrue(login.checkPasswordComplexity());
    }

    @Test
    public void testCheckPasswordDoesNotMeetComplexity() {
        Login login = new Login("+27838968976", "kyl_1", "password");
        assertFalse(login.checkPasswordComplexity());
    }
   

    @Test
    public void testCheckCellPhoneNumberCorrectlyFormatted() {
        Login login = new Login("+27838968976", "kyl_1", "Ch&&sec@ke99!");
        assertTrue(login.checkCellPhoneNumber());
    }

    @Test
    public void testCheckCellPhoneNumberIncorrectlyFormatted() {
        Login login = new Login("08966553", "kyl_1", "Ch&&sec@ke99!");
        assertFalse(login.checkCellPhoneNumber());
    }

    @Test
    public void testLoginSuccessful() {
        Login login = new Login("+27838968976", "kyl_1", "Ch&&sec@ke99!");
        assertTrue(login.loginUser("kyl_1", "Ch&&sec@ke99!"));
    }

    @Test
    public void testLoginFailed() {
        Login login = new Login("+27838968976", "kyl_1", "Ch&&sec@ke99!");
        assertFalse(login.loginUser("wrongUser", "wrongPass"));
    }
}