package br.edu.deitel;

public class Welcome {
    public static void main(String[] args) {
        String greeting = "Welcome to Java Programming!";
        System.out.println(greeting);
        for(int i = 0; i < greeting.length(); i++)
            System.out.println("=");
        System.out.println();

    }
}
