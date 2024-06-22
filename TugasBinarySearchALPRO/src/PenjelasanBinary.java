public class PenjelasanBinary{  
  public static void main(String args[]){  
  int surat[] = {1,2,3,4,5}; // Deklarasi array

  int x = 4; // variabel x dan nilai yg kita cari
  System.out.println("\nData yang di cari = " + x); // output

  //nilai awal,akhir,dan tengah
  int awal = 0;
  int akhir=surat.length-1; 
  int mid = (awal + akhir)/2; 
  /*Keterangan : Setelah di lakukan perhintungan int mid = (awal + akhir)/2
  maka hasil dri ketiga varibel tersebut berubah menjadi = 
  mid = 2,5 / 2
  awal = 0
  akhir = 4
  */
  while( awal <= akhir ){  //(awal <= akhir atau 0 <= 4) merupakan kondisinya, s
    // elama kondisinya benar jalankan program nya
    if ( surat[mid] < x ){  
      awal = mid+1; /* kenapa disini mi + 1..? di karenakan seperti yg kitatahu
        nilai dari variabel mid yaitu 2, nah agar bisa samakan dengan index dari nilai x 
        yg kita cari kita harus menambahkan 1 agar indexnya bisa sama, contoh x = 4, 
        jika kita melakukan mid + 1 maka index dari x = 4 adalah 2 */
    }else if ( surat[mid] == x ){ // pengeksekusian jika semua data sudah benar
          System.out.println("Data berada pada index ke-" + mid);  
          break;  
      }else{  
          akhir = mid - 1 ;  /*Kenapa di kurangi 1 lgi..? supaya indexnya pas, 
          jika tidak di kurangi 1 maka akhir index nya bukan 0 melaikan 1 */
      }  
      mid = (awal + akhir)/2;  
  }  
  if ( awal > akhir ){  
      System.out.println("Data " + x + " tidak di temukan");  
  }       
  }  
}  