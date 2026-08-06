package com.gla.PracticeProblems.AssistedProblems;

import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum = x + y;
        System.out.println(sum);
        sc.close();
    }
}
