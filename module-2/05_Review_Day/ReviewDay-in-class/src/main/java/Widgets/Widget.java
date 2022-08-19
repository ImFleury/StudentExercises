package Widgets;

import java.lang.reflect.WildcardType;

public class Widget {

    public Widget(){

    }

    public int add(int a, int b){
        return a + b;
    }

    public int subtract(int a, int b){
        return a - b;
    }

    public int multiply(int a, int b){
        return a * b;
    }

    public int divide(int a, int b){
        return a / b;
    }

    public int modulus(int a, int b){
        return a % b;
    }

    public String concatenate(String a, String b){
        return a + b;
    }

    public String concatenate(String[] inputArray){
        String output = "";
        for(String item : inputArray){
            output += item;
        }

        return output;
    }

    public String concatenate(String[] inputArray, String separator) {
        String output = "";
        boolean firstime = true;
        for (String item : inputArray) {
            if (firstime) {
                output += item;
                firstime = false;
            } else {
                output += (separator + item);
            }


        }
        return output;
    }
}
