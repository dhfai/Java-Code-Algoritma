public class latihan {
  public static void main(String[] args ) {
    int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}; 
    int x = 7;
    System.out.println("Nilai yang di cari = " + x);

    int awal = 0;
    int akhir = data.length;
    int mid = (awal+akhir)/2;

    while(awal <= akhir ) {
      if(data[mid] < x ) {
        awal = mid + 1;
      }else if (data[mid] == x) {
        System.out.println("Data " + x + " di temukan");
        break;
      }else {
        akhir = mid - 1;
      }
      mid = (awal + akhir)/2;
    }
    if ( awal > akhir ){  
      System.out.println("Data " + x + " tidak di temukan");  
  }       
  }
}
