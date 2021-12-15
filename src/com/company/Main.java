package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<String> ListA = new ArrayList<>();
        ArrayList<String> ListB = new ArrayList<>();
        ArrayList<String> ListC = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("ListA :");
        for (int i = 0; i <5 ; i++) {
            ListA.add(scanner.nextLine());


        }
        System.out.println(ListA);

        System.out.println("ListB :");
        for (int i = 0; i < 5; i++) {
            ListB.add(scanner.nextLine());

        }
        System.out.println(ListB);
        System.out.println("--------------------");

        Collections.reverse(ListB);
        int x = 0;
        while (ListC.size() < ListA.size() + ListB.size()){
            ListC.add(ListA.get(x));
            ListC.add(ListB.get(x));
            x++;
        }
        System.out.println(ListC);
        System.out.println("-----------------------");


        Collections.sort(ListC, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2){
                return o1.length() - o2.length();
            }
        });
        System.out.println(ListC);
     }
}
