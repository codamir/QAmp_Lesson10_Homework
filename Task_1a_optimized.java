import java.util.Scanner;

public class Task_1a_optimized {
    public static void main(String[] args) {

        char choice;

        do {

            Scanner reader = new Scanner(System.in);

            printText("What would you like to do?");

            String[] operationsMenu = {
                    "Sum",
                    "Subtract",
                    "Multiplication",
                    "Divison"
            };

            createMenuFromArray(operationsMenu);

            int answer = reader.nextInt();

            if (answer == 1) {
                int sumOfNumbers = sum(inputNumber(), inputNumber());
                printMathOperationResult(sumOfNumbers);
            } else if (answer == 2) {
                int subtractOfNumbers = subtraction(inputNumber(), inputNumber());
                printMathOperationResult(subtractOfNumbers);
            } else if (answer == 3) {
                int multiplicationOfNumbers = multiplication(inputNumber(), inputNumber());
                printMathOperationResult(multiplicationOfNumbers);
            } else if (answer == 4) {
                int divisionOfNumbers = divison(inputNumber(), inputNumber());
                printMathOperationResult(divisionOfNumbers);
            } else System.out.println("Ok, you don't want to do anything.");

            printText("Would you like to use calculator again? y/n");
            choice = reader.next().toLowerCase().charAt(0);

        } while (choice!='n');
    }

    public static String printText(String text) {
        System.out.println(text);
        return text;
    }

    public static String printMathOperationResult (int mathOperation){
        String result = printText("The result is: " + mathOperation);
        return result;
    }

        public static String[] createMenuFromArray(String[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            printText((++counter) + " - " + array[i]);
        }
        return array;
    }


    public static int inputNumber() {
        Scanner reader = new Scanner(System.in);
        printText("Please enter number:");
        int x = reader.nextInt();
        return x;
    }

    public static int sum (int x, int y) {
        return x+y;
    }

    public static int subtraction(int numberFirst, int numberSecond) {
        return numberFirst - numberSecond;
    }

    public static int multiplication(int numberFirst, int numberSecond) {
        return numberFirst * numberSecond;
    }

    public static int divison(int numberFirst, int numberSecond) {
        return numberFirst / numberSecond;
    }

    public static void theResultText (){
        printText("The result is: ");
    }
}




//1a. Napravite 4 funkcije koje int-ove:
//        Sabiraju
//        Oduzimaju
//        mnoze
//        djele