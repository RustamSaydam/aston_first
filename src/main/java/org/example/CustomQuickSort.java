package org.example;

public class CustomQuickSort {

    /**
   Метод quickSort выполняет быструю сортировку массива целых чисел.
    @param arr массив целых чисел для сортировки
    @param low индекс начала области сортировки массива
    @param high индекс конца области сортировки массива
      */
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    /**
     Mетод partition выполняет фактическую сортировку массива,
     перемещая элементы, меньшие или равные "пику", в начало массива.
     */
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
        }
        arr[high] = arr[i];
        arr[i] = pivot;
        return i;
    }

}
