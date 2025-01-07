package Classes;


import java.util.Random;

public class QuickSort {

    public static void main(String[] args) {
        System.out.println(" Test. Hello world from QuickSort");

        int[] array = new int[10];
        Random randNum = new Random();

        // Initialisiert das Array mit zufälligen Werten
        for (int i = 0; i < array.length; i++) {
            array[i] = randNum.nextInt(100) + 1;
        }

        System.out.println("Unsortiertes Array:");
        printArray(array);

        // QuickSort-Aufruf
        quickSort(array, 0, array.length - 1);

        System.out.println("Sortiertes Array:");
        printArray(array);
    }

    // Führt das Partitionierungsverfahren aus und gibt den Index des Pivots zurück
    private static int partitioning(int[] array, int low, int high) {
        int pivot = array[low];
        int i = low + 1;
        int j = high;

        while (i <= j) {
            while (i <= j && array[i] < pivot) {
                i++;
            }

            while (i <= j && array[j] > pivot) {
                j--;
            }
// Vertausche i und j solange die unterschiedliche Position haben
            if (i < j) {
                // Vertausche array[i] und array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;

            } else {
                break;
            }
        }

        // Setze das Pivot-Element an die korrekte Position
        array[low] = array[j];
        array[j] = pivot;

        return j;  // Gibt die Pivot-Position zurück
    }

    // QuickSo
    private static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Partitioniert das Array und erhält den Pivot-Index
            int pivot_index = partitioning(array, low, high);

            // Das Sortiert die Elemente links und rechts vom Pivot
            quickSort(array, low, pivot_index - 1);
            quickSort(array, pivot_index + 1, high);
        }
    }


    private static void printArray(int[] array) {
        for (var num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}


