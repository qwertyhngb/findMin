package com.company;


import java.awt.*;

public class Main {

    public static void main(String[] args) {
        while (true) {
            System.out.println(MouseInfo.getPointerInfo().getLocation());
        }
    }
;
    public static int factorial(int n){
        if(n==1){
            return n;

        }else{
            return n*factorial(n-1);
        }
    }

    public static int sum(int[] n){
        int min=n[0];
        for (int i=1; i<n.length;i++){
        if(n[0]==1){
            return min;

        }
        }
        return min;
    }


    /*public static int min(int[] arr){

        for (int i=1; i<arr.length-1; i++){
            int min=arr[0];
            for(int j=1; j<arr.length;j++ ){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            if(i!=min){
                int temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }
        }


    }*/
}
