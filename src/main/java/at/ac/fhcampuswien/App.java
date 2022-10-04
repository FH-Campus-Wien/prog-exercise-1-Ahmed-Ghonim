package at.ac.fhcampuswien;

import com.sun.org.apache.xerces.internal.xs.ItemPSVI;

import java.sql.SQLOutput;
import java.util.Scanner;

public class App {
    Scanner scanner = new Scanner(System.in);

    //todo Task 1
    public static void sayHelloWorld(){
        // input your solution here
        System.out.println("Hello World!");


    }

    //todo Task 2
    public static void helloRobot(){
        // input your solution here
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){

    char myChar = 'Z';
    long l = 0xface;
    int i = 012;
    long l1 = 80L;
    float f = 44e-1f;
    float f1 =5.5f;
    double d = 8.88e1;
    double d1 = 99.9;

    int charToInt = myChar;
    int longToInt = (int)l;
    int longToInt2 = (int)l1;
    int floatToInt = (int)f;
    int floatToInt2 = (int)f1;
    int doubleToInt = (int)d;
    int doubleToInt2 = (int)d1;

    int summe = charToInt + longToInt + i + longToInt2 + floatToInt + floatToInt2 + doubleToInt + doubleToInt2;
        System.out.println(summe);
    }

    //todo Task 4
    public void addTwoNumbers(){
int zahl1;
int zahl2;

        Scanner add = new Scanner(System.in);

        zahl1= add.nextInt();
        zahl2= add.nextInt();
        int ergebnis = zahl1+zahl2;

        System.out.println (ergebnis);


    }

    //todo Task 5
    public void swapTwoNumbers(){
        System.out.println("Before Swap:");
        System.out.print("x: ");
        int x = scanner.nextInt();
        System.out.print("y: ");
        int y = scanner.nextInt();

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After Swap:");
        System.out.println("x: "+x);
        System.out.println("y: "+y);

    }

    //todo Task 6
    public void compareTwoNumbers(){
        System.out.print("n1: ");
         int n1;
        n1=scanner.nextInt();

        System.out.print("n2: ");
         int n2;
         n2= scanner.nextInt();

        if(n1>n2) {
            System.out.println("n1 > n2");
        } else if(n2>n1){
            System.out.println("n2 > n1");
        } else {
            System.out.println("n1 == n2");
        }

    }



    //todo Task 7
    public void ratingSalesPerson(){
        // input your solution here
        int sales;

        System.out.print("Enter annual Revenue: ");
        sales = scanner.nextInt();

        if( sales < 0||sales >= 100000){
            System.out.println("Invalid Revenue");
        } else if (0 <= sales && sales <20000){
            System.out.println("Poor Sales Revenue");
        } else if(20000 <= sales && sales <50000){
            System.out.println("Average Sales Revenue");
        } else if(50000 <= sales && sales <80000){
            System.out.println("Good Sales Revenue");
        } else if(80000 <= sales && sales <100000){
            System.out.println("Excellent Sales Revenue");
        }
    }

    //todo Task 8
    public void getCommissionRate() {
        // input your solution here
        int Commission;

        System.out.print("Enter CommissionClass: ");
        Commission = scanner.nextInt();

        switch (Commission) {
            case 1:
                System.out.println("Your Commission Rate was set to 0.01");
                break;

            case 2:
                System.out.println("Your Commission Rate was set to 0.02");
                break;

            case 3:
                System.out.println("Your Commission Rate was set to 0.03");
                break;

            case 4:
                System.out.println("Your Commission Rate was set to 0.04");
                break;

            default:
                System.out.println("Your Commission Rate was set to 0.0");
                break;
        }
    }

    //todo Task 9
    public void leapyear(){
        // input your solution here
        int x;

        System.out.print("Year: ");
        x = scanner.nextInt();

        if(x % 4 == 0 && x % 400 == 0){
            System.out.println("Leapyear");

        } else if (x % 100 == 0 && x % 400 != 0) {
            System.out.println("Not a Leapyear");

        } else System.out.println("Not a Leapyear");
    }

    //todo Task 10
    public void transposedNumbers(){
        // input your solution here
        int transposed = 0;
        int zahl;
        int limit = 999;

        System.out.print("Number: ");
        zahl = scanner.nextInt();

        if(zahl<=limit) {
            while (zahl != 0) {

                int rest = zahl % 10;
                transposed = transposed * 10 + rest;
                zahl = zahl / 10;

            }

            System.out.println(transposed);
        }
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}