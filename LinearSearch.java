
package Classes;


import java.util.Random;
import java.util.Scanner;



public class LinearSearch {


    public static void main(String[] args) {

        System.out.println("Hello world from Linearsort");

        int[] array = new int[10];


        Random randNum = new Random();


        for (int i = 0; i < array.length; i++) {


            int arrayNum = randNum.nextInt(1, 100) + 1;


            array[i] = arrayNum;

        }


        Scanner InputReader = new Scanner(System.in);


        System.out.println("Enter a valid number: ");

        int key = InputReader.nextInt();


        var result = search(array, key);

        if (result == -1) {

            System.out.println("The key element was not found in the array");
        } else {
            System.out.println("The key element was  found in the array at index: " + result);
        }

        PrintArray(array);

        // TODO Auto-generated constructor stub
    }

    // Führt das Linearsearchvorfahren und gibt das Index vom key, falls es gefunden wurde
    static int search(int[] array, int key) {

        int result = -1;
        for (int i = 0; i < array.length; i++) {

            if (key == array[i]) {


                result = i;
                break;
            }


        }


        System.out.println("The result is :" + result);


        return result;


    }


    static void PrintArray(int[] array) {


        for (var element : array) {

            System.out.print(element + " ");

        }

        System.out.println();
    }

}
