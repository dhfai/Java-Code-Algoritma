package com.main;

public class SweetAlabama {

    public static void main(String[] args){

        int a=48, b=12;
        for (int i = 1; i <= 4; i++){
            if (i == 2){
                a = a + 36;
            } else if (i == 3){
                a = a + 24;
            } else if (i == 4){
                a = a + 12;
            }
            for (int j = 1; j <= 4; j++){
                System.out.print(a+" ");=
                a = a - b;
            }
            System.out.println(" ");
            b = b - 3;
        }

        System.out.println("\n");

        int k = 1;
        for (int i = 1; i < 5; i++){
            for (int j = 1; j < 4; j++){
                System.out.print(k++);
            }
            System.out.println(k--);
        }

        System.out.println("\n");

        for (int i = 1; i <= 7; i++){
            for (int j = 1; j <= 4; j++){
                System.out.print("* ");
                if (i == j){
                    break;
                } else if ((i+j)==8){
                    break;
                }
            }
            System.out.println(" ");
        }

    }
}
