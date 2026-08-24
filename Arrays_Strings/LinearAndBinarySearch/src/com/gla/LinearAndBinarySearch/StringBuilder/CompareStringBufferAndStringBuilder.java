package com.gla.LinearAndBinarySearch.StringBuilder;

public class CompareStringBufferAndStringBuilder {
    public static void main(String[] args) {

        int n = 1000000;

        StringBuffer sbuffer = new StringBuffer();
        long startBuffer = System.nanoTime();

        for (int i = 0; i < n; i++) {
            sbuffer.append("hello");
        }

        long endBuffer = System.nanoTime();

        StringBuilder sbuilder = new StringBuilder();
        long startBuilder = System.nanoTime();

        for (int i = 0; i < n; i++) {
            sbuilder.append("hello");
        }

        long endBuilder = System.nanoTime();
        System.out.println("StringBuffer Time: " + (endBuffer - startBuffer) + " ns");
        System.out.println("StringBuilder Time: " + (endBuilder - startBuilder) + " ns");
    }
    }
