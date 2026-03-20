package br.edu.deitel.controller;

import br.edu.deitel.model.Account;

import java.util.Scanner;
public class AccountTest {
    public static void main(String[] args) {//program main starts here

        Account account1 = new Account("Jane Green", 50); //create the object of class Account
        Account account2 = new Account("John Blue", -7.53);
        displayAccount(account1);
        displayAccount(account2);

        System.out.println(account1.getName() + " balance: $" + account1.getBalance());
        Scanner scanner = new Scanner(System.in); //the metodo to insert data by user
        double depositAmount; //variable to receive the value of deposit
        System.out.println("Enter deposit amount for account1: ");
        depositAmount = scanner.nextDouble();
        System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount);
        System.out.println(account1.getName() + " balance: $" + account1.getBalance());

        //account2
        System.out.println("Enter deposit amount for account2: ");
        depositAmount = scanner.nextDouble();
        System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount);
        System.out.println(account2.getName() + " balance: $" + account2.getBalance());
        //withdraw balance
        System.out.println("Enter withdraw amount for account2: ");
        double withdrawAmount = scanner.nextDouble();
        account2.withdraw(withdrawAmount);
        System.out.println(account2.getName() + " balance: $" + account2.getBalance());
        scanner.close();
    }
    public static void displayAccount(Account accountToDisplay) {
        // Esta única linha substitui as várias instruções System.out duplicadas
        System.out.printf("%s balance: $%.2f%n",
                accountToDisplay.getName(),
                accountToDisplay.getBalance());
    }
}
