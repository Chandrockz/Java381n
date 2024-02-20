package com.practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Vid23_ForLoop {
    public static int minOperations(int[] arr) {

        int min = arr[0];
        int max = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }

        return Math.abs(max - min);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(minOperations(arr));
    }
}
