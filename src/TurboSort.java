package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class TurboSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int[] arr=new int[t];
        for (int i = 0; i < t; i++) {
            arr[i]=sc.nextInt();
        }
//        for (int i = 0; i <t ; i++) {
//            for (int j = i+1; j < t; j++) {
//                int temp=0;
//                if (arr[i]>arr[j]){
//                    temp=arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=temp;
//                }
//            }
//            for (i = 0; i < t; i++) {
//                System.out.println(arr[i]);
//            }
//        }
//      2nd Method direct using method......
        Arrays.sort(arr);
        System.out.printf("%d\n",Arrays.toString(arr));
    }
}
