package com.vk.zzzin;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = Integer.parseInt(s.nextLine());
        int b = Integer.parseInt(s.nextLine());
        String c = s.nextLine();
        if (c.equals("-")) {
            System.out.println(a - b);
        } else if (c.equals("+")) {
            System.out.println(a + b);
        } else if (c.equals("*")) {
            System.out.println(a * b);
        } else if (b == 0 && (c.equals("/"))) {
            System.out.println("888888");
        } else if (c.equals("/")) {
            System.out.println(a / b);
        } else {
            System.out.println("888888");
        }
    }
}