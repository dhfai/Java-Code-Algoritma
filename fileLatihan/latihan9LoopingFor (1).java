package latihankuliahs1;
import java.util.Scanner;
public class latihan9LoopingFor {
    public static void main(String args[]){
        Scanner baca = new Scanner(System.in);
        String nama = "",pilihan="Tidak";
        
        do {
            System.out.print("Apakah Masih basah Atau Sudah Kering ? ");
            nama=baca.nextLine();
        }
        
        while(nama.equalsIgnoreCase("Basah"));
    
        
    
        while (pilihan.equalsIgnoreCase("Tidak"))
        {
            System.out.println("Masukkan Nama ?");
            nama=baca.nextLine();
            System.out.println("Ulangi ?");
            pilihan=baca.nextLine();
            
        }
    }
    
}
