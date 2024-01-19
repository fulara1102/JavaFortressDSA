package com.fulara.LinearSearch.in1D;

public class stringElement {
    public static void main(String[] args) {
        String[] str = {"Gaurav","Aayush","Diya","Fulara"};
        String target = "Fulara";
        int flag = 0;
        for (int i = 0;i<str.length;i++){

            if (str[i].equals(target)){
                System.out.println("Element found at "+i+" index poisition");
                flag = 1;
            }
        }
        if (flag == 0){
            System.out.println("Element not found");
        }

    }
}