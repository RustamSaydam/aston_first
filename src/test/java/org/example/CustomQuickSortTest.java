package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomQuickSortTest {

    @Test
    public  void testQuickSort() {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        CustomQuickSort.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}, arr);
    }

}