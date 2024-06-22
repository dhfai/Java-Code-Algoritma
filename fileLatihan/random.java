package com.main;
import java.util.Random;

public class random {
    public static void main(String[] args){
        Random random = new Random();

        for (int i=1; i<=6; i++){
            if (i==3) {
                System.out.print((char) (random.nextInt(2)+' '));
            }
            else {
                System.out.print("|");
            }
            if (i==1 || i==4 || i==6) {
                for (int j=1; j<=4; j++)
                    if (i==4 && j==2) {
                        System.out.print((char) (random.nextInt(2)+' '));
                    }
                    else {
                        System.out.print("-");
                    }
            } else {
                for (int j=1; j<=4; j++)
                    System.out.print(" ");
            }
            System.out.print("|");

            System.out.println();
        }

    }
}
