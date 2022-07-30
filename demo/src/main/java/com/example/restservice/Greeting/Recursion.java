package com.example.restservice.Greeting;

public class Recursion {

    public static int search(int[] arr, int target) {
        int min = 0, max = arr.length - 1;
        int mid = (int) Math.floor((max + min) / 2 );

        while ( arr[mid] != target && min < max) {
            if ( target > arr[mid] ) {
                min = mid + 1;
            } else {
                max = mid - 1
            }
            mid = (int) Math.floor((max + min) / 2 );
        }
        if (arr[mid] == target) {
            return mid;
        } else {
            return -1;
        }
    }
}
