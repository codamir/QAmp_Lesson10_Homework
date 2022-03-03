import java.util.Scanner;

public class Task_1a {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("What would you like?\n"+"1 - sum\n"+"2 - subtract\n"+"3 - multiplication\n"+
                           "4 - division\n" + "Type the number for the function you want:");
        int answer = reader.nextInt();
        if (answer==1){
            sum();
        }else if (answer==2){
            subtraction();
        }else if (answer==3){
            multiplication();
        }else if (answer==4){
            divison();
        }else System.out.println("Ok, you don't want to do anything.");


    }

    public static void sum (){
        Scanner reader = new Scanner(System.in);
        System.out.println("You chose sum option\n"+"Please enter first number:");
        int x = reader.nextInt();
        System.out.println("Please enter second number:");
        int y = reader.nextInt();
        System.out.println("The result is " +x+ " + " +y+ " = " +(x+y));
    }

    public static void subtraction (){
        Scanner reader = new Scanner(System.in);
        System.out.println("You chose subtraction option\n"+"Please enter first number:");
        int x = reader.nextInt();
        System.out.println("Please enter second number:");
        int y = reader.nextInt();
        System.out.println("The result is " +x+ " - " +y+ " = " +(x-y));

    }

    public static void multiplication (){
        Scanner reader = new Scanner(System.in);
        System.out.println("You chose multiplication option\n"+"Please enter first number:");
        int x = reader.nextInt();
        System.out.println("Please enter second number:");
        int y = reader.nextInt();
        System.out.println("The result is " +x+ " * " +y+ " = " +(x*y));
    }

    public static void divison (){
        Scanner reader = new Scanner(System.in);
        System.out.println("You chose division option\n"+"Please enter first number:");
        int x = reader.nextInt();
        System.out.println("Please enter second number:");
        int y = reader.nextInt();
        System.out.println("The result is " +x+ " / " +y+ " = " +(x/y));
    }

}


//1a. Napravite 4 funkcije koje int-ove:
//        Sabiraju
//        Oduzimaju
//        mnoze
//        djele