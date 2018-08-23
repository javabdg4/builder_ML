package com.sda.builder;

public class Main {
    public static void main(String[] args) {
        User user =
                User.UserBuilder.anUser()
                .age(21)
                .email("john@kovalsky.org")
                .build();

        System.out.println(user.getAge());
        System.out.println(user.getEmail());
    }
}
