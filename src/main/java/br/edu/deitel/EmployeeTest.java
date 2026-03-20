package br.edu.deitel;

import java.util.Scanner;
import static java.lang.System.*;

public class EmployeeTest {
    public static void main(String[] args) {
        //create the new object to Employee
        Scanner input = new Scanner(System.in);

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();

        //get the employee's information
        out.println("Enter the first employee's information: ");
        out.print("Enter the first employee's name: ");
        employee1.setNome(input.nextLine());
        out.print("Enter the first employee's last name: ");
        employee1.setSobreNome(input.nextLine());
        out.print("Enter the first employee's salary: ");
        employee1.setSalario(input.nextDouble());
        out.printf("Employee 1: %s %s Amount Salary 12 months: %.2f ", employee1.getNome(), employee1.getSobreNome(), employee1.getSalarioAnual());
        out.println();
        out.println("\nIncrease the salary 10% ");
        employee1.aplicarAumento(10);
        out.printf("Employee 1: %s %s New Amount Salary 12 months: %.2f ", employee1.getNome(), employee1.getSobreNome(), employee1.getSalarioAnual());
        out.println("\n=========================================");
        //Second Employee
        out.println("Enter the second employee's information: ");
        out.print("Enter the second employee's name: ");
        input.nextLine(); // consume the newline
        employee2.setNome(input.nextLine());
        out.print("Enter the second employee's last name: ");
        employee2.setSobreNome(input.nextLine());
        out.print("Enter the second employee's salary: ");
        employee2.setSalario(input.nextDouble());
        out.printf("Employee 2: %s %s Amount Salary 12 months: %.2f ", employee2.getNome(), employee2.getSobreNome(), employee2.getSalarioAnual());
        out.println();
        out.println("\nIncrease the salary 10% ");

        employee2.aplicarAumento(10);
        out.printf("Employee 2: %s %s New Amount Salary 12 months: %.2f ", employee2.getNome(), employee2.getSobreNome(), employee2.getSalarioAnual());
        input.nextLine();
        out.println("\n=========================================");
        input.close(); // end Scanner
    }
}//end class
