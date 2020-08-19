package com.company;

public class SelectionSort {

    public void sort(int arr[]){
        int number;

        for (int i = 0; i < arr.length ; i++) {
             number = arr[i];
             int placement = i;

            // find mindste tal
            for (int j = i+1; j < arr.length ; j++) {
                if(number > arr[j]){
                    System.out.println(arr[j] + "er mindre end " + number);
                    number = arr[j];
                    placement = j;
                }
            }

            arr[placement] = arr[i];
            arr[i] = number;

        }

        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }

        System.out.println(arr);

    }
}
