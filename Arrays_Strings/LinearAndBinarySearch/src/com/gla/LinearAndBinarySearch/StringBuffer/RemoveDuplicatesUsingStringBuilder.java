package com.gla.LinearAndBinarySearch.StringBuffer;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicatesUsingStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!set.contains(ch)) {
                sb.append(ch);
                set.add(ch);
            }
        }
        System.out.println("String after removing duplicates: " + sb.toString());

        sc.close();
    }
    }
