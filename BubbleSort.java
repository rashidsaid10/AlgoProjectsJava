package Classes;
import java.util.Random;
public class BubbleSort {




        public static void main(String[]args) {

            Random  randNum = new Random();
            int [] array = new int [10];

            for(int i = 0; i< array.length; i++) {

                array[i] = randNum.nextInt(1, 20);
            }
            System.out.println("Unsortiertes array: ");
            printArray(array);
            BubbleSort(array);



        }

        public static void BubbleSort(int [] array) {

            boolean swapped;
            int n = array.length;
            int temp;
            int comparison = 0;
            int vertausch = 0;

            for(int i = 0; i < n-1; i++ ) {

                swapped = false;

                for(int j = 0; j< n-1-i; j++ ) {

                    comparison += 1;

                    if (array[j]> array[j+1]) {

                        temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                        swapped = true;
                        vertausch += 1;
                        System.out.println("Zwischenschritt vom array");
                        printArray(array);
                    }
                }

                if (swapped == false);



                System.out.println("Das endgültig sortiertes Array");
                printArray(array);
                System.out.println("Es wurde "+ vertausch + " Vertauschungen stattgefunden");
                System.out.println("Es wurde "+ comparison + " Vergleiche stattgefunden");
                break;
            }
        }


        public static void printArray(int [] array) {

            for(var element: array) {

                System.out.print(element + " ");
            }

            System.out.println();
        }

    }


