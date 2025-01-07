package Classes;


import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        System.out.println("Hello world from binary search :)");

        int[] array = new int[10];
        Random randNum = new Random();

        // Zufällige Werte für das Array generieren
        for (int i = 0; i < array.length; i++) {
            array[i] = randNum.nextInt(100) + 1; // Zahlen von 1 bis 100
        }

        Scanner inputReader = new Scanner(System.in);

        int attempt = 3;

        while (attempt > 0) {

           try {


                   System.out.println("Enter a key number to look for");
                   int userInput = inputReader.nextInt();

                   System.out.println("Das zufällig generierte und unsortierte Array:");
                   PrintArray(array);

                   // Array sortieren
                   quickSort(array, 0, array.length - 1);

                   System.out.println("Das endgültig sortierte Array:");
                   PrintArray(array);


                   // Binäre Suche durchführen
                   int result = BinSearch(array, userInput);

                   // Ergebnis ausgeben
                   if (result > -1) {
                       System.out.println("The target value/number was found in the array at index: " + result);
                   } else {
                       System.out.println("The target value/number was not found in the array ;)");
                   }
                   break;
               }

           catch (InputMismatchException e)
           {


                   attempt-= 1;
                   inputReader.nextLine();


                   if(attempt == 0){

                       System.out.println("Too many Invalid Inputs. Try again later");
                       System.exit(0);
                   }
                   else
                   {
                       System.out.printf("Please enter only a number. And you have %d tries left " , attempt);
                       System.out.println();



                   }
               }
           finally {
               System.out.println("Thanks for visiting!");
           }



        }
    }





    static int partition(int[] array, int low, int high) {
        int pivot = array[low];
        int i = low + 1;
        int j = high;
        int temp;

        while (i <= j) {
            while (i <= j && array[i] <= pivot) {
                i++;
            }
            while (i <= j && array[j] >= pivot) {
                j--;
            }
            if (i < j) {
                // Elemente tauschen
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        array[low] = array[j];
        array[j] = pivot;
        return j;
    }

    static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    static int BinSearch(int[] array, int key) {
        int low = 0;
        int high = array.length ;

        while (low <= high) {
            int mid = (low + high) / 2;
            System.out.println("Checking middle index " + mid + " with value " + array[mid]);

            if (array[mid] == key) {
                return mid; // gibt index vom gesuchten Element
            } else if (array[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; // Wert nicht gefunden
    }

    static void PrintArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
