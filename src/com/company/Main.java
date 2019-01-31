package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner input = new java.util.Scanner(System.in);
        java.util.Random random = new java.util.Random();
        int generatedNumber = random.nextInt(9 + 1);

        System.out.println("Enter your birth year: ");
        int birthYear = input.nextInt();
        System.out.println("Enter your first name: ");
        String firstName = input.next();
        System.out.println("Enter you last name: ");
        String lastName = input.next();
        System.out.println("Enter you employee ID number: ");
        int employeeNumber = input.nextInt();

        printHeader();
        printName(lastName, firstName);
        printAge(birthYear);
        printEvenOrOdd(employeeNumber);
        printGeneratedSecretPassword(employeeNumber, generatedNumber);
    }

    private static void printHeader()

    {
        System.out.println("Welcome to the WallabyTech Employee Application");
        System.out.println("-----------------------------------------------");
        System.out.println("-----------------------------------------------");
    }

    private static void printName(String firstName, String lastName)
    {
        System.out.println(lastName + ", " + firstName);
    }

    private static void printAge(int birthYear)
    {
        int age = 2019 - birthYear;
        System.out.println("Your age is: " + age);
    }

    private static void printEvenOrOdd(int number)
    {
        boolean evenOrOdd = false;

        if (number % 2 == 0)
        {
            evenOrOdd = true;
        }

        System.out.println("Employee number is even: " + evenOrOdd);
    }

    private static void printGeneratedSecretPassword(int employeeNumber, int generatedNumber)
    {
        int secretNumber = ((generatedNumber + employeeNumber) * 5);
        System.out.println("Employee's random secret password is: " + secretNumber);
    }


}
