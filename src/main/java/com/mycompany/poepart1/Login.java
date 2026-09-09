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
   public String cellPhoneNumber;
   public String username;
   public String password;

    public Login(String cellPhoneNumber, String username, String password) {
        this.cellPhoneNumber = cellPhoneNumber;
        this.username = username;
        this.password = password;
    }
    public boolean checkUserName() {
        return username != null && username.contains("_") && username.length() <= 5;
    }

    /* Password must be at least eight characters long and contain
      a capital letter, a number, and a special character.
     */
    public boolean checkPasswordComplexity() {
        if (password == null || password.length() < 8) {
            return false;
        }
        boolean hasUppercase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(c)) {
                // anything that isn't a letter and isn't a digit
                // is seen as a special character
                hasSpecialChar = true;
            }
        }

        return hasUppercase && hasDigit && hasSpecialChar;
    }
    /*
     Cell phone number must contain the South African international
     code (+27) followed by no more than 10 digits.
    */
    public boolean checkCellPhoneNumber() {
        if (cellPhoneNumber == null) {
            return false;
        }

        if (!cellPhoneNumber.startsWith("+27")) {
            return false;
        }

        // everything after the "+27" code
        String numberPart = cellPhoneNumber.substring(3);

        if (numberPart.length() == 0 || numberPart.length() > 10) {
            return false;
        }

        // make sure the remaining characters are all digits
        for (int i = 0; i < numberPart.length(); i++) {
            if (!Character.isDigit(numberPart.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    /*
      Returns the appropriate registration message depending on which
      validation checks pass or fail.
     */
    public String registerUser() {
        if (!checkUserName()) {
            return "Username is not correctly formatted; please ensure that your "
                    + "username contains an underscore and is no more than five characters in length.";
        }
        if (!checkPasswordComplexity()) {
            return "Password is not correctly formatted; please ensure that the "
                    + "password contains at least eight characters, a capital letter, a number, "
                    + "and a special character.";
        }
        if (!checkCellPhoneNumber()) {
            return "Cell number is incorrectly formatted or does not contain an "
                    + "international code; please correct the number and try again.";
        }
        return "Username successfully captured.\nPassword successfully captured.\n"
                + "Cell number successfully captured.\nYou have been registered successfully, "
                + username + "!";
    }

    /*
     Checks whether the username and password entered at login match
     the details this Login object was registered with.
     */
    public boolean loginUser(String enteredUsername, String enteredPassword) {
        return username != null && username.equals(enteredUsername)
                && password != null && password.equals(enteredPassword);
    }

    /*
      Returns the welcome message on successful login, or a failure
      message if the entered credentials don't match.
     */
    public String returnLoginStatus(String enteredUsername, String enteredPassword) {
        if (loginUser(enteredUsername, enteredPassword)) {
            return "Welcome " + username + ", it is great to see you again.";
        }
        return "Username or password incorrect, please try again.";
    }
}
/* References 
freeCodeCamp.org (2022) Java Programming for Beginners – Full Course. Available at: https://www.youtube.com/watch?v=A74TOX803D0 (Accessed: 9 September 2026).

Saini, M. (2018) Java NetBeans Tutorial | chat application in java. Available at: https://www.youtube.com/watch?v=dlacc6831zw (Accessed: 9 September 2026).
*/