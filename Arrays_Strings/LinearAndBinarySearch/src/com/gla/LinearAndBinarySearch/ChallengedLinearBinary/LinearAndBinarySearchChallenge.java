package com.gla.LinearAndBinarySearch.ChallengedLinearBinary;

import java.util.Arrays;
import java.util.Scanner;

public class LinearAndBinarySearchChallenge {
    public static int firstMissingPositive(int[] arr) {
        int n = arr.length;
        boolean[] visited = new boolean[n + 2];
        for (int num : arr) {
            if (num > 0 && num <= n + 1) {
                visited[num] = true;
            }
        }
        for (int num : arr) {
            if (num > 0 && num <= n + 1) {
                visited[num] = true;
            }
        }
        for (int i = 1; i <= n + 1; i++) {
            if (!visited[i]) {
                return i;
            }
        }

        return n + 1;
    }
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int missing = firstMissingPositive(arr);
        System.out.println("First Missing Positive Integer: " + missing);
        Arrays.sort(arr);
        System.out.print("Enter the target element: ");
        int target = sc.nextInt();
        int index = binarySearch(arr, target);

        if (index != -1) {
            System.out.println("Target found at index: " + index);
        } else {
            System.out.println("Target not found.");
        }

        sc.close();
    }
    }
