package org.example.MockTestCoding;

public class Registration {
    private String email;// Private instance variable
    private String userName;
    private String password;

    // Method to set user's email
    public void setEmail(String email) {
        if (isValidEmail(email)) {
            this.email = email;
            System.out.println("Email set successfully: " + email);
        } else {
            System.out.println("Invalid email format. Only Yahoo emails are allowed.");
        }
    }

    // Method to set user's username
    public void setUserName(String userName) {
        if (isValidUserName(userName)) {
            this.userName = userName;
            System.out.println("Username set successfully: " + userName);
        } else {
            System.out.println("Invalid username format. Username cannot be empty and should be at least 6 characters long.");
        }
    }

    // Method to set user's password
    public void setPassword(String password) {
        if (isValidPassword(password)) {
            if (!password.contains(userName)) {
                this.password = password;
                System.out.println("Password set successfully.");
            } else {
                System.out.println("Invalid password. Password cannot contain the username.");
            }
        } else {
            System.out.println("Invalid password format. Password cannot be empty and should be at least 6 characters long.");
        }
    }

    // Method to validate email format (only Yahoo emails are allowed)
    private boolean isValidEmail(String email) {
        return email.endsWith("@yahoo.com");
    }

    // Method to validate username format (cannot be empty and should be at least 6 characters long)
    private boolean isValidUserName(String userName) {
        return !userName.isEmpty() && userName.length() > 6;
    }

    // Method to validate password format (cannot be empty, should be at least 6 characters long, and cannot contain the username)
    private boolean isValidPassword(String password) {
        return !password.isEmpty() && password.length() > 6;
    }

    public static void main(String[] args) {
        Registration registration = new Registration();

        // Setting email
        registration.setEmail("example@yahoo.com");

        // Setting username
        registration.setUserName("exampleuser");

        // Setting password
        registration.setPassword("examplepassword");

        // Attempting to set invalid email
        registration.setEmail("invalid@gmail.com");

        // Attempting to set invalid username
        registration.setUserName("");

        // Attempting to set invalid password (contains username)
        registration.setPassword("exampleuser123");
    }
}
//The Registration class has private instance variables email, userName, and password, ensuring that they are
// accessible only within the class.
//Public setter methods setEmail(), setUserName(), and setPassword() are provided to set the values of email,
// username, and password respectively, with appropriate validation.
//Validations are performed within each setter method according to the specified requirements:
//Email must end with "@yahoo.com".
//Username and password must not be empty and should be at least 6 characters long.
//Password cannot contain the username.
//The main() method demonstrates the usage of the class by creating an object of Registration and calling the
// setter methods with valid and invalid inputs.