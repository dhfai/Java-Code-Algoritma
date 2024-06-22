package latihankuliahs1;

public class latihan8LoopingWhile {
    public static void main(String args[])
    {
        int i=1; 
        
        System.out.println("Perulangan Dengan Do While : ");
                
        System.out.println("Buat Kopi Sebanyak 10 Cangkir ");
        do {
            System.out.println("Proses "+i+" Jumlah Cangkir kopi adalah "+i);
            i=i+1;
        }while(i<=10);
        
        System.out.println();
        System.out.println("Perulangan Dengan While : ");
        
        i=-5; //nilai awal 
        while(i<=10) //kondisi akhirnya
        {
            System.out.println("Proses "+i+" Jumlah Cangkir kopi adalah "+i);
            i=i+2;//perubahannya 
        }
        
        System.out.println();
        System.out.println("Perulangan Dengan For : ");
        
               
        for (i=1;i<=10;i++)
        {
             System.out.println("Proses "+i+" Jumlah Cangkir kopi adalah "+i);           
             if (i % 2 ==1)
                 System.out.println("Cangkir ini adalah Cangkir Ganjil ");
             else 
                 System.out.println("Cangkir ini adalah Cangkir Genap");
        }
        
       }
    
}
