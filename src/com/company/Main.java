package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(walk(20,20));
        System.out.println(walk(10,10));
        System.out.println(walk(-10,20));
        System.out.println(walk(-10,45));
        System.out.println(walk(0,50));

        System.out.println(generateRandomAge() + walk(generateRandomAge(),10));


    }
    public static String walk (int temperature, int age){
        String boy = "Можно идти гулять";
        String boy1 = "Нельзя идти гулять";
        String boy2 = "Оставайтесь дома";
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30){
            return boy;

        } else if (age <= 20 && temperature > 0 && temperature <=28) {
            return boy;

        } else {
            return boy2;
        }



    }
    public static int generateRandomAge (){
        Random random = new Random();
        int admin = random.nextInt(45);
        return admin;


    }
}
