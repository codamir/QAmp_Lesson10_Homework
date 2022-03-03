import java.util.Scanner;

public class Task_1f {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Please enter integer:");
        totalCalculation(reader.nextInt());
    }

    public static void totalCalculation (int number){
        Scanner reader = new Scanner(System.in);

        char choiceEntry = 0;
        int calculator=number;

        do {
            System.out.println("Which operation would you like to use: *,/,+,-,=?");
            choiceEntry = reader.next().charAt(0);

            while ((choiceEntry != '+') && (choiceEntry != '-') && (choiceEntry != '*')
                    && (choiceEntry != '/') && (choiceEntry != '=')) {
                System.out.println("Which operation would you like to use: *,/,+,-,=?");
                choiceEntry = reader.next().charAt(0);

            }
            if (choiceEntry == '=') {
                break;
            }
            reader.nextLine();

            System.out.println("Please enter integer:");
            calculator = reader.nextInt();

            switch (choiceEntry) {
                case '*':
                    calculator = calculator * number;
                    break;

                case '/':
                    calculator = calculator / number;
                    break;

                case '+':
                    calculator = calculator + number;
                    break;

                case '-':
                    calculator = calculator - number;
                    break;
            }

        } while (choiceEntry != '=');

        System.out.println("Calculator Result is: " + calculator);

    }
}

//1.f Modifikujte petlju da mozete artimeticke operacije da radite u nedogled sve dok ne upisete “=” i zatim enter
//        kada ce se ispisati samo total
//        ie
//        Which operation would you like to use: *,/,+,-,=?
//        +
//        Please enter integer:
//        5
//        Which operation would you like to use: *,/,+,-,=?
//        -
//        Please enter integer:
//        3
//        Which operation would you like to use: *,/,+,-,=?
//        *
//        please enter integer
//        5
//        Which operation would you like to use: *,/,+,-,=?
//        =
//        Calculator Result is 10;