/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poepart1;

/**
 *
 * @author Student
 */
import java.util.Scanner;
public class PoePart1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Hey there, please enter your user name");
        String userName = input.nextLine();
        
        System.out.println("please enter your south african cell phone number");
        String phoneNumber = input.nextLine();
        
        System.out.println("please enter your password");
        String password = input.nextLine();
        
        Login Login = new Login (phoneNumber,userName,password);
        if(Login.checkUserName()){
           System.out.println("username successfully captured");
       }else{
           System.out.println("username not correctly formatted , please ensure that\nyour user "
                   + "name is contains an underscore and is no more than 5 characters in length");
      
       //checking if cell phone number meets requirements
      if(Login.checkCellPhoneNumber()){
           System.out.println("student number captured");
       }else{
           System.out.println("student number not successfully captured");
       }
      if(Login.checkPasswordComplexity()){
          System.out.println("password captured successfully");
      }else{
          System.out.println(" password not correctly formatted , please ensure that\nyour pass "
                   + "word is contains atleast 8 characters, a capital letter,a number and a special charater");
      }
    }
    }
}
