package com.vk.zzzin;

import java.util.Scanner;

public class Coffeebetterthantea {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has:");
        int a = Integer.parseInt(s.nextLine());
        System.out.println("Write how many ml of milk the coffee machine has:");
        int b = Integer.parseInt(s.nextLine());
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int c = Integer.parseInt(s.nextLine());
        System.out.println("Write how many cups of coffee you will need:");
        int d = Integer.parseInt(s.nextLine());
        if (((a < 200 * d ||(b < 50 * d) || (c < 15 * d))) || (d < 1)) {
            System.out.println("No, I can make only 0 cup(s) of coffee");
        } else {
            System.out.println("Yes, I can make that amount of coffee");
        }


    }
}
