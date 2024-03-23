package org.example.class10;

import java.util.Scanner;

public class E5String {
    public static void main(String[] args) {
//Store username, password and confirm password from a user and check following requirements:
//
//Username or Password cannot be  empty, if so→
// message=”Username or Password cannot be empty”.
//Password should be minimum 8 characters, if less →
// message=”Password is too short”.
//Password cannot contain username if so, →
// message=”Password cannot contain username”.
//Password should match confirmed password, if not  → message=“Passwords do not match”.
//Only after all requirements met →
// message “Your username and password has been created”
        String username="strik";
        String password="123xyztyyjj";
        String confirmPassword=password;
        if (username.isEmpty() || password.isEmpty()) {
            System.out.println("Username or Password cannot be empty");
        }if (password.length() < 8) {
            System.out.println("Password is too short");
        }if (password.contains(username)) {
            System.out.println("Password cannot contain username");
        }if (!password.equals(confirmPassword)) {
            System.out.println("Passwords do not match");
        }else {
            System.out.println("Your username and password has been created");
        }
    }







    }

