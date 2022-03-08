import java.util.Scanner;

public class Task2_optimized {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        printText("Starting size array:");
        int arraySize = reader.nextInt();
        int[] array = new int[arraySize];

        printText("Type the numbers: ");
        int[] initialArray = createInitialArray(array);
        arrayPrint(initialArray);

        char answer = 0;

        printText("Do you want to add more numbers y/n");

        answer = reader.next().toLowerCase().charAt(0);
        if (answer=='y'){
            addNumberToArray(initialArray,9);
            } else if (answer=='n') {
            System.out.println("Ok. Thank you.");
        }
    }

    public static int[] createInitialArray(int[] array) {
        Scanner reader = new Scanner(System.in);
        int numberInArray = 0;

        for (int i = 0; i < array.length; i++) {
            numberInArray = reader.nextInt();
            array[i] = numberInArray;
            }
        return array;
    }

    public static void arrayPrint(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int[] addNumberToArray(int[] array, int number) {
        int[] newArray = createBiggerArray(array);
        int[] bigArrayCopied = copySmallerArrayToBiggerArray(array, newArray);
        int[] resultArray = addNumberToArray(bigArrayCopied, 8);
        return resultArray;
    }

    public static int[] createBiggerArray(int[] array) {
        int [] biggerArray = new int[array.length+1];
        return biggerArray;
    }

    public static int[] copySmallerArrayToBiggerArray(int[] smallArray, int[] bigArray) {
        for (int i = 0; i < smallArray.length; i++) {
            bigArray[i] = smallArray[i] + bigArray[i];
        }
        return bigArray;
    }

    public static String printText(String text) {
        System.out.println(text);
        return text;
        }
}



//2. Napravite petlju u koju unosite brojeve kada petlja detektuje broj -10,
//        ispise vam se niz brojeva koje ste unjeli.
//
//
//        Zatim ce vam se na ekranu
//        pojaviti pitanje da li zelite da prosirite array sa opcijama y/n.
//        Ukoliko upisete y, ponovno unosite brojeve koji cete dodavati na niz
//        kada ponovno unesete -10 ispisu vam se svi brojevi koje ste unjeli.
