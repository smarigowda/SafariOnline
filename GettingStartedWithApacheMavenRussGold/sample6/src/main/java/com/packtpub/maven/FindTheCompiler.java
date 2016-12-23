package com.packtpub.maven;

public class FindTheCompiler {
    public static void main(String... args) {
        Class compiler = com.sun.tools.javac.Main.class;
        System.out.println("The compiler has " + compiler.getDeclaredMethods().length + " methods");
    }
}

