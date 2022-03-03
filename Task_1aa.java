import java.util.Scanner;

public class Task_1aa {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Please enter any integer, but it can't be zero:");
        int number = reader.nextInt();

        if (number==0){
            System.out.println("Loop cannot be continued, the integer cannot be number zero");
        }else {
            positiveNumberLoop();
        }


    }

    public static void positiveNumberLoop (){
        Scanner reader = new Scanner(System.in);

        int number;

        do{
            System.out.println("Please enter integer:");
            number = reader.nextInt();
        } while (number>0);
        System.out.println("You have entered zero or negative number. The loop is over");
    }
}



//1.aa Napravite petlju koja ukoliko ima predefiniran neki broj u varijabli  “total”
//        koja je deklarisana prije while-a i koji je razlicit od nula
//        While petlja ce traziti da unosite za svaki loop pozitivan broj.
//        Ukoliko unesete negativan broj while petlja zavrsava.