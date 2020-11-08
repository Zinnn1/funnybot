package com.vk.zzzin;

import java.util.Scanner;

public class Pamparampamparam {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String b = s.nextLine();
        if (a.contains("@"))
            System.out.println("Некорректный логин");
        else if (!b.contains("@"))
            System.out.println("Некорректный адрес");
        else
            System.out.println("OK");
    }


}

