
import java.util.Scanner;
public class tugasBinary {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

// Deklarasi variable
    int[] data = {1,2,3,4,5}; //Data Array
    int batasAtas,batasBawah,nilaiData; // Variabel penentu nilai tengah/batas atas & batas bawah
    int angka; // Variabel untuk menampung nilai yang kita masukkan nanti
    boolean notfound = true; /* Variabel ini bertujuan untuk menjalankan looping while yg berada di baris no 24
      atau sebuah kondisi yang nanti akan kitamasukkan kedalam while 
     */

    batasAtas = data.length-1; /* data.lenght bertujuan umtuk mengukur,
      panjang dari sebuah array, contoh kita dapat menuliskan sebagai berikut untuk mencobanya, 
      System.out.println("panjang data array program ini berjumlah " + batasAtas); 
      */

    batasBawah = 0; /* Batas bawah nya di mulai dari angka nol, yang artinya 
    titik paling rendah dari sebuah data yg kita punya adalah nol */

// end deklarasi variabel


    System.out.println("Data yang di miliki berupa angka 1-5");
    // System.out.println();
    System.out.print("Masukkan data yang ingin di cari  => ");
    angka = input.nextInt();


/*Perulangan while,  Disinilah semua logika,algoritma dan kode yg kita tulis akan di eksekusi*/

    while(notfound) {
      nilaiData = (batasAtas + batasBawah)/2; // Rumus untuk mencari tengah
      if(data[nilaiData] == angka) { /*Pada fase ini akan di lakukakan pencocokan antar nilai yg kita input sama nilaiData yg kita punya */
        notfound = false;
      }else if(batasBawah > batasAtas) { // jika batas bawahnya lebih dari batas atas maka akan false di karenakan nilai yg kita punya hanya memiliki range dari 0 sampai 5
        System.out.println("Angka " + angka+ " di temukan");
      }else {
        System.out.println("Angka " + angka + " tidak ditemukan");
        break;
     
      }
      // System.out.println(x);
    }
    // System.out.print("Angka ditemukan pada index ke-"+x);
  }
}
