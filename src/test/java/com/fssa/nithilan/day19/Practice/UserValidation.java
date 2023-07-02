package com.fssa.nithilan.day19.Practice;

import java.util.regex.Pattern;

class User {
    int id;
    String name;
    String password;
    String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

public class UserValidation {
    public static void  validate(User user) {
        try {
            // regex for password
            String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
            // regex for email
            String emailRegEx = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

            boolean isMatch = Pattern.matches(regex, user.getPassword());
            boolean isEmailMatch = Pattern.matches(emailRegEx, user.getEmail());

            if (user.getId() <= 0) {
                throw new IllegalArgumentException("Invalid user id");
            }

            if (user.getName().length() <= 2) {
                throw new IllegalArgumentException("Invalid username");
            }

            if (!isMatch) {
                throw new IllegalArgumentException("Invalid username");
            }

            if (!isEmailMatch) {
                throw new IllegalArgumentException("Invalid email");
            }

            System.out.println("Validation successful");
        } catch (IllegalArgumentException e) {
            System.out.println("Validation failed: " + e.getMessage());
        }
        finally{
        	System.out.println("all are test case are true");
        }
    }

    public static void main(String[] args) {
        User user = new User();
        user.setEmail("nithilansaravananfssa.freshworks.com");
        user.setId(17);
        user.setName("Ab devillers");
        user.setPassword("Nithilan@17");

        validate(user);
    }
}
