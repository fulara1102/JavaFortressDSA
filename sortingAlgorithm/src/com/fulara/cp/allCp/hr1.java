package com.fulara.cp.allCp;

import java.util.Scanner;

public class hr1 {
    Scanner sc = new Scanner(System.in);
        public static void main(String []args)
        {
            Scanner sc = new Scanner(System.in);
            int i=1;
            while (sc.hasNext()) {
                String s=sc.nextLine();
                System.out.println(i + " " + s);
                i++;
            }
        }

}
