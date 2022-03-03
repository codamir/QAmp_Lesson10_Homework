import java.util.Scanner;

public class Task_1b {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int number;

        do {
            System.out.println("Please enter any integer:");
            number = reader.nextInt();
        } while (!(number==-1000));
        System.out.println("Exit number -1000 is detected!");
    }

}

//1.b
//        Napravite petlju koja prima brojeve no ukoliko se posalje broj -1000 izadje iz petlje
//        U konzoli neka se ispise “Please enter any integer” prije vaseg unosa broja.
//        nakon sto unesete -1000 napisite poruku da je exit broj -1000 detektovan.