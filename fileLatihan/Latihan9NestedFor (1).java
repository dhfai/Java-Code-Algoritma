/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihankuliahs1;

import java.util.Scanner;

public class Latihan9NestedFor {
    public static void main(String args[])
    {
       String isi; 
       Scanner baca=new Scanner(System.in);
       int baris, kolom;
       for (baris=1; baris <=5;baris++)
       {
           for(kolom=1;kolom<=5;kolom++)
           {
               System.out.print("| baris "+baris+" kolom "+kolom+" | ");
              
           }           
          System.out.println();
                    
       }
       
       int i=1;
       System.out.println("Bentuk Segitiga Siku2");
       for (baris=1; baris <=5;baris++)
       {
           for(kolom=1;kolom<=baris;kolom++)
           {
               System.out.print("| baris "+baris+" kolom "+kolom+" | ");
              
           }           
          System.out.println();
                    
       }
       
       i=1;
       System.out.println("Bentuk Segitiga Siku2");
       for (baris=1; baris <=5;baris++)
       {
           for(kolom=1;kolom<=baris;kolom++)
           {
               System.out.print("|"+i+"| ");
               i=i+1;
           }           
          System.out.println();
                    
       }
       
       i=1;
       System.out.println("Bentuk Segitiga Siku2 terbalik");
       for (baris=1; baris<=5;baris++)
       {
           for(kolom=5;kolom>=baris;kolom--)
           {
               System.out.print("|"+i+"| ");
               i++;
           }           
          System.out.println();
                    
       }
       
       i=1;
       System.out.println("Bentuk Segitiga Siku2 terbalik Angka Genap");
       for (baris=1; baris<=5;baris++)
       {
           for(kolom=5;kolom>=baris;kolom--)
           {
               if (i%2==0)
               {
                   System.out.print("|"+i+"| ");
               }
                   i++;
               
           }           
          System.out.println();
                    
       }
       
       i=0;
       System.out.println("Bentuk Segitiga Siku2 terbalik Cetak Karakter");
       for (baris=1; baris<=5;baris++)
       {
           for(kolom=5;kolom>=baris;kolom--)
           {
               System.out.print((char)(i));
               i++;
           }           
          System.out.println();
        }
    }    
}
