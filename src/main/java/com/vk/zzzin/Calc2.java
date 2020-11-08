package com.vk.zzzin;

import java.util.Scanner;

public class Calc2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float a = Float.parseFloat(s.nextLine());
        float b = Float.parseFloat(s.nextLine());
        String c = s.nextLine();

        if (c.equals("-")) {
            System.out.println(a - b);
        } else if (c.equals("+")) {
            System.out.println(a + b);
        } else if (c.equals("*")) {
            System.out.println(a * b);
        } else if (c.equals("/")) {
            if (b == 0) {
                System.out.println("888888");
            } else System.out.println(a / b);
        } else {
            System.out.println("888888");
        }
    }
}