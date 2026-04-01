package br.edu.deitel.exefixacao;

import java.nio.charset.StandardCharsets;

public class HelloJava {
    //use System.getProperty
    public static void main(String[] args) {
        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("os.version"));
        System.out.println(System.getProperty("os.arch"));
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("user.home"));
        System.out.println(System.getProperty("user.dir"));
    }
}
