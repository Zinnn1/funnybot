package com.vk.zzzin;

import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        if (a.length() < 8) {
            System.out.println("Короткий!");
            System.exit(0);
        }
        String b = s.nextLine();
        if (a.equals(b)) {
            System.out.println("OK");
        } else {
            System.out.println("Различаются");
        }
    }
}

