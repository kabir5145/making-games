package com.company;

import java.util.Arrays;

public class main_1 {
    public void reverse(int arr[],int start , int end){
        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        main_1 m = new main_1();
        int arr[] ={13,45,32,12,32,34};
        m.reverse(arr,0, arr.length-1);
    }
}
