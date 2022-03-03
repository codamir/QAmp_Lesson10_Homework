import java.util.Scanner;

public class Task_1c {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        char choice;

        System.out.println("Would you like to enter first number? y/n");
        choice = reader.next().toLowerCase().charAt(0);

        if (!(choice=='y')){
            sum(0);
        }else System.out.println("Please enter first number:");
            sum(reader.nextInt());

    }

    public static void sum (int x){
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter second number:");
        int secondNumber = reader.nextInt();
        System.out.println("Total of " +x+ " and " +secondNumber+ " is " +(x+secondNumber)+".");
    }

    public static void newSum (int x){
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter another number:");
        int nextNumber = reader.nextInt();

    }

}

//1.c
//        Modifikujte petlju da sabira prethodno upisan broj i novi broj i zatim ispise total
//        ukoliko nikakav broj nije deklarisan kao pocetni pocinje od broja 0 :
//        ie. Please enter integer:
//        4
//        Total of 0 and 4 is 4.
