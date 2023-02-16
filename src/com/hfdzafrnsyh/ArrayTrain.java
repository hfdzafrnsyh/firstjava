package com.hfdzafrnsyh;

import java.util.Arrays;

public class ArrayTrain {

    public static void main(String[] args){



        int[] arrayAngka1 = {1,2,4,6,8,9,10};
        int[] arrayAngka2 = {4,7,8,10,15,18,22};


//        sum array
        int[] arrayResult = tambahArray(arrayAngka1,arrayAngka2);

        printArray(arrayAngka1, "Array-1");
        printArray(arrayAngka2, "Array-2");
        printArray(arrayResult , "Result Array");

//          merge array

        int[] arrayResultTwo = new int[arrayAngka1.length + arrayAngka2.length];

        for(int i=0; i<arrayAngka1.length; i++){
            arrayResultTwo[i] = arrayAngka1[i];
        }

        for (int i=0; i<arrayAngka2.length; i++){
            arrayResultTwo[i + arrayAngka1.length] = arrayAngka2[i];
        }


        printArray(arrayAngka1, "Array-1");
        printArray(arrayAngka2, "Array-2");
        printArray(arrayResultTwo , "Result Array");


//        sorting array reserve

        printArray(arrayAngka1, "Array-1");
        reserve(arrayAngka1);
        printArray(arrayAngka1, "Array Reserve");


        //   sorting reserve switch

        printArray(arrayAngka2, "Array-1");
        reserveTwo(arrayAngka2);
        printArray(arrayAngka2, "Array Reserve Two");


    }



    private static void reserveTwo(int[] dataArray){
       Arrays.sort(dataArray);
        int buffer;

        for (int i=0; i<dataArray.length/2; i++){
            buffer = dataArray[i];
            dataArray[i] = dataArray[(dataArray.length - 1) - i];
            dataArray[(dataArray.length - 1) - i] = buffer;
        }
    }

    private static void reserve(int[] dataArray){
        Arrays.sort(dataArray);
        int[] arrayBuffers = java.util.Arrays.copyOf(dataArray,dataArray.length);

        for (int i=0; i<dataArray.length; i++){
            dataArray[i] = arrayBuffers[(arrayBuffers.length - 1) - i];
        }

    }


    private static int[] tambahArray(int[] arrayAngka1, int[] arrayAngka2){
        int[] arrayResult = new int[arrayAngka1.length];
        for (int i=0; i<arrayAngka1.length; i++){
            arrayResult[i] = arrayAngka1[i] + arrayAngka2[i];
        }

        return arrayResult;
    }


    private static void printArray(int[] dataArray, String message){
        System.out.println(message + " = " + Arrays.toString(dataArray));
    }


}
