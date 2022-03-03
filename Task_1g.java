import java.util.Scanner;

public class Task_1g {
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


//1.g Bonus
//        Modifikujte petlju tako da
//        Ukoliko niste deklarisali prvi broj tj pocetni. Apliakcija vas pita za vrijednost prvog broja,
//        u protivnom trazi da unesete integer:
//        Ie.
//        Please enter the starting integer:
//        5
//        Which operation would you like to use: *,/,+,-,=?
//        +
//        Please enter integer:
//        5
//        Which operation would you like to use: *,/,+,-,=?
//        -
//        Please enter integer:
//        3
//        Which operation would you like to use: *,/,+,-,=?
//        etc etc etc.
//        medjutim ukoliko ja deklarisem 0 kao prvi intedjer necu da me pita “Please enter
//        the starting integer:” u narednom loop-u.