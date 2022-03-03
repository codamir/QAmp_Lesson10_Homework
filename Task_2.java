import java.util.ArrayList;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        char choice;

        ArrayList<Integer> listNumbers = new ArrayList<>();
        arrayFiller(listNumbers);

        do{
            System.out.println("Do you want to add more numbers to array? y/n");
            choice = reader.next().toLowerCase().charAt(0);
            if (choice == 'y'){
                arrayFiller(listNumbers);
            } else
                break;
        }while (choice=='y');

    }

    public static void arrayFiller (ArrayList<Integer> listNumbers){
        Scanner reader = new Scanner(System.in);

        int arrayNumber = 0;
        while(arrayNumber!=-10){
            System.out.println("Please enter any number:");
            arrayNumber=reader.nextInt();
            listNumbers.add(arrayNumber);
        }
        listNumbers.remove(listNumbers.size()-1);
        System.out.println("Number -10 detected, numbers in your array are: " + listNumbers);
    }
}


//2. Napravite petlju u koju unosite brojeve kada petlja detektuje broj -10,
//        ispise vam se niz brojeva koje ste unjeli. Zatim ce vam se na ekranu
//        pojaviti pitanje da li zelite da prosirite array sa opcijama y/n.
//        Ukoliko upisete y, ponovno unosite brojeve koji cete dodavati na niz
//        kada ponovno unesete -10 ispisu vam se svi brojevi koje ste unjeli.