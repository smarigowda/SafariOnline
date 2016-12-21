package com.packtpub.maven;

public class Greetings {
    public static void main(String... args) {
        System.out.println("|========================================");
        System.out.println("|");
        System.out.println("|");
        if (args.length == 0)
            System.out.println("|   Hello, whoever you are!");
        else
            System.out.println("|   That would be " + args[0]);
        System.out.println("|");
        System.out.println("|");
        System.out.println("|========================================");
    }
}

