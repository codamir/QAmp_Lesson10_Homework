import java.util.Objects;
import java.util.Scanner;

public class Task_1e {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        char choiceEntry = 0;

        do {
            System.out.println("Which operation would you like to use: *,/,+,-?");
            choiceEntry = reader.next().charAt(0);

            if (choiceEntry == +'*') {
                multiplication();
            } else if (choiceEntry=='/'){
                division();
            } else if (choiceEntry=='+'){
                sum();
            }else if (choiceEntry=='-'){
                subtraction();
            }else System.out.println("You must type in math operation sign (*,/,+,-)!");
        } while ((choiceEntry != '+') && (choiceEntry != '-') && (choiceEntry != '*') && (choiceEntry != '/'));

    }

        public static void sum () {
            Scanner reader = new Scanner(System.in);

            int x, y;

            System.out.println("You chose sum option.\n");

            System.out.println("Would you like to enter first number?\n"+"Please type Yes or No:");
            String answer = reader.nextLine().toLowerCase();

            if (!(Objects.equals(answer, "yes"))){
            x=0;
                System.out.println("Please enter integer:");
                y=reader.nextInt();
                System.out.println("The sum of " + x + " and " + y + " is " + (x + y));
            }else System.out.println("Please enter first number:");
            x = reader.nextInt();
            System.out.println("Please enter second number:");
            y = reader.nextInt();
            System.out.println("The sum of " + x + " and " + y + " is " + (x + y));
    }

        public static void subtraction () {
            Scanner reader = new Scanner(System.in);

            int x, y;

            System.out.println("You chose subtraction option.\n");

            System.out.println("Would you like to enter first number?\n"+"Please type Yes or No:");
            String answer = reader.nextLine().toLowerCase();

            if (!(Objects.equals(answer, "yes"))){
                x=0;
                System.out.println("Please enter integer:");
                y=reader.nextInt();
                System.out.println("The subtraction of " + x + " and " + y + " is " + (x - y));
            }else System.out.println("Please enter first number:");
            x = reader.nextInt();
            System.out.println("Please enter second number:");
            y = reader.nextInt();
            System.out.println("The subtraction of " + x + " and " + y + " is " + (x - y));

        }

        public static void multiplication () {
            Scanner reader = new Scanner(System.in);

            int x, y;

            System.out.println("You chose multiplication option.\n");

            System.out.println("Would you like to enter first number?\n"+"Please type Yes or No:");
            String answer = reader.nextLine().toLowerCase();

            if (!(Objects.equals(answer, "yes"))){
                x=0;
                System.out.println("Please enter integer:");
                y=reader.nextInt();
                System.out.println("The multiplication of " + x + " and " + y + " is " + (x * y));
            }else System.out.println("Please enter first number:");
            x = reader.nextInt();
            System.out.println("Please enter second number:");
            y = reader.nextInt();
            System.out.println("The multiplication of " + x + " and " + y + " is " + (x * y));
        }

        public static void division () {
            Scanner reader = new Scanner(System.in);

            double x, y;

            System.out.println("You chose division option.\n");

            System.out.println("Would you like to enter first number?\n"+"Please type Yes or No:");
            String answer = reader.nextLine().toLowerCase();

            if (!(Objects.equals(answer, "yes"))){
                x=0;
                System.out.println("Please enter integer:");
                y=reader.nextInt();
                System.out.println("The division of " + x + " and " + y + " is " + (x / y));
            }else System.out.println("Please enter first number:");
            x = reader.nextInt();
            System.out.println("Please enter second number:");
            y = reader.nextInt();
            System.out.println("The division of " + x + " and " + y + " is " + (x/y));
        }


}

//1.e
//        Modifikujte petlju da radi artimeticke operacije i daje ispis shodno operaciji.
//        ie.
//        Which operation would you like to use: *,/,+,-?
//        -
//        Please enter integer:
//        5
//        Difference of 0 and -5 is -5
