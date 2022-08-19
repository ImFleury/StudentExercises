package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
            List<Integer> result = CreateData();

            PrintData(result);

            List<Integer> moreResults = CreateData2(10);
            PrintData(moreResults);
    }

    private static void PrintData(List<Integer> printParameterList) {
//        for(int i = 0; i <= printParameter.size(); i++){
//            System.out.println(i);
//        }



        for(Integer singleElementInPrintParameterList : printParameterList){
            if (singleElementInPrintParameterList % 2 == 0) {
                System.out.println(singleElementInPrintParameterList);
            }
        }
    }


    public static List<Integer> CreateData(){
        List<Integer> intList = new ArrayList<>();
        for (int i = 1; i <= 50; i++) {
            intList.add(i);
        }

        return intList;
    }

    public static List<Integer> CreateData2(int numberOfElements){
        List<Integer> intList = new ArrayList<>();
        for (int i = 1; i <= numberOfElements; i++) {
            intList.add(i);
        }

        return intList;
    }

        public static void ManuallyConvertingIntegerDataType(){
            List<Integer> intList = new ArrayList<>();
            for (int i = 1; i < 50; i++) {
                intList.add(i);
            }

            List<Integer> intListDemo = new ArrayList<>();
            for (int i = 1; i < 50; i++) {
                intListDemo.add(Integer.valueOf(i));
            }
        }


     public static void ImplicitlyConvertingIntegerDataType(){
         Integer i = new Integer(-8);

         // 1. Unboxing through method invocation
         int absVal = absoluteValue(i);
         System.out.println("absolute value of " + i + " = " + absVal);

         List<Double> ld = new ArrayList<>();
         ld.add(3.1416);    // # is autoboxed through method invocation.

         // 2. Unboxing through assignment
         double pi = ld.get(0);
         System.out.println("pi = " + pi);
     }
    public static int absoluteValue(int i) {
        return (i < 0) ? -i : i;
    }
}
