import java.util.ArrayList;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int entryChoice = 0;

        System.out.println("Chose one of the following functions");
        System.out.println("1 - Is string a palindrome?");
        System.out.println("2 - Filter an Array");
        System.out.println("3 - Number is divisible by X");

        entryChoice=reader.nextInt();

        switch (entryChoice){

            case 1 :
                boolean isPalindrome = isStringPalindrome("");

                if (isPalindrome){
                    System.out.println("Entered string is a palindrome.");
                }else
                    System.out.println("Entered string is not a palindrome.");
                break;

            case 2:
                System.out.println("Please enter size of array:");

                int arrayElementsNumber = reader.nextInt();
                ArrayList<Integer> listNumbers = new ArrayList<>();

                int counter = 0;

                System.out.println("Please enter numbers for your array:");
                for (int i=0;i<arrayElementsNumber;i++){
                    System.out.println("Enter " + (++counter) + "."+ " number:");
                    int number = reader.nextInt();
                    listNumbers.add(number);
                }
                arrayFilter(listNumbers);

                char choice;

                do {
                    System.out.println("Do you want to remove another number (y/n)?");
                    choice = reader.next().toLowerCase().charAt(0);
                    if (choice=='y'){
                        arrayFilter(listNumbers);
                    }else if (choice=='n'){
                        break;
                    }else System.out.println("You must type letter 'y' or 'n'!");
                }while (choice == 'y');
                break;

            case 3 :
                System.out.println("Please enter number A - dividend:");
                int numberA = reader.nextInt();
                System.out.println("Please enter number B - divisor:");
                int numberB = reader.nextInt();

                if (isNumberDivisible(numberA,numberB)){
                    System.out.println("The "+numberA+" is divisible by "+ numberB +".");
                }else
                    System.out.println("The "+numberA+" is not divisible by "+ numberB +".");
                break;

        }
    }

    public static boolean isStringPalindrome (String word){
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter a string to check whether it is a palindrome:");
        word = reader.nextLine();

        String wordLowerCase = word.toLowerCase();
        String reversedWord = "";

        for (int i = word.length() - 1; i >= 0; i--){
            reversedWord = reversedWord + wordLowerCase.charAt(i);
        }

        if (wordLowerCase.equals(reversedWord))
            return true;
        else
            return false;
    }

    public static boolean isNumberDivisible (int numberA, int numberB)
    {
        return numberA%numberB==0;

    }

    public static void arrayFilter (ArrayList<Integer> listNumbers){
        Scanner reader = new Scanner(System.in);

        System.out.println("Which number from your array do you want to remove?");
        System.out.println(listNumbers);

        int numberRemove= reader.nextInt();
        listNumbers.remove(Integer.valueOf(numberRemove));
        System.out.println("Now your array looks like this "+listNumbers);
    }

}




//3. Napravide funkciju koja provjereava da li je nesto palindrom,
//        Napravite Funkciju koja iz niza izbacuje brojeve koji mi specifikujemo,
//        Napravite funkciju koja provjerava da li je broj djeljiv sa brojem x.
//        Kada se pokrene aplikacija Pojavi vam se meni
//        Is string a palindrom
//        Filter an Array
//        Number is divisible by X.
//        Ukoliko izaberete  broj 2
//        Morate unjeti prvo brojeve za niz i zatim broj koji zelite izbaciti iz niza… (edited)