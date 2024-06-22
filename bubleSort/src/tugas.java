public class tugas {
  public static void main(String[] args) {
    int data [] = {3,1,5,4,2};
    System.out.println("Before bublle sort --> ");
    for(int i = 0; i < data.length; i++) {
        System.out.print(data[i] + " ");
    }

    int n = data.length;
    int bantu = 0;
    for(int i=0; i < n; i++){  
      for(int j=1; j < (n-i); j++){  
          if(data[j-1] > data[j]){    
              bantu = data[j-1];  
              data[j-1] = data[j];  
              data[j] = bantu;  
          }       
      }  
  }
    System.out.println(" ");
    System.out.println("After bublle sort --> ");
    for(int i = 0; i < data.length; i++) {
      System.out.print(data[i] + " ");
    }
  }
}
