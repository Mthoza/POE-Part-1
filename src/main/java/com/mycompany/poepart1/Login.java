/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poepart1;

/**
 *
 * @author Student
 */
public class Login {
     public String phoneNumber ;
     public String userName;
      public String password;
      
     //constructors
      public Login (String phoneNumber,String userName,String password){
      this.userName=userName;
      this.phoneNumber=phoneNumber;
      this.password=password;
      }
      public boolean checkUserName(){
          return userName != null && userName.contains("_") && userName.length() <6;
       
      }
      public boolean checkCellPhoneNumber(){
      return  phoneNumber!= null && phoneNumber.startsWith("ST") && phoneNumber.length()==10;
      
      }
      public boolean checkPasswordComplexity(){
      return password.contains(".*[A-Z].*") && password.contains(".*[0-9].*") && password.contains(".*[!@#$%^].*") && password.length()>=8;
      }
      public String registerUser(){
      if(checkUserName() && checkPasswordComplexity()){
         return "welcome" + userName + "it is great to see you again";
      }else return "username or password incorrect, please try again";
      }
     public boolean loginUser(){
     
     
     }
     }
     public String returnLoginStatus(){
     
     }
}
