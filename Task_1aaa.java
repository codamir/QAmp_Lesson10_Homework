import java.util.Scanner;

public class Task_1aaa {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int number;

        do{
            System.out.println("Please enter integer:");
            number = reader.nextInt();
        } while (number>0);
        System.out.println("You have entered zero or negative number. The loop is over");
    }
}


//1.aaa
//        Napravite petlju koja ce za svaki ukljucujuci i za pocetni broj traziti
//        da unosite za svaki loop pozitivan broj.
//        Ukoliko unesete negativan broj while petlja zavrsava.