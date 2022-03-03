import java.util.Scanner;

public class Task_1d {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        mathOperationsLoop();

        char choice;

        System.out.println("Would you like to enter first number? y/n");
        choice = reader.next().toLowerCase().charAt(0);

        if (!(choice=='y')){
            sum(0);
        }else System.out.println("Please enter first number:");
        sum(reader.nextInt());

    }

    public static void mathOperationsLoop (){
        Scanner reader = new Scanner(System.in);
        char mathOperator = 0;
        while ((mathOperator!='+')&&(mathOperator!='-')&&(mathOperator!='*')&&(mathOperator!='/')){
            System.out.println("Which operation would you like to use: *,/,+,-?");
            mathOperator=reader.next().charAt(0);
        }
    }

    public static void sum (int x){
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter second number:");
        int secondNumber = reader.nextInt();
        System.out.println("Total of " +x+ " and " +secondNumber+ " is " +(x+secondNumber)+".");
    }

}

//1.d
//        Modifikujte petlju da  trazi znak za artimeticku operaciju prije broja.
//        ie. Which operation would you like to use: *,/,+,-?
//        +
//        Please enter integer:
//        5
//        Total of 0 and 5 is 5;
