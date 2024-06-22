import java.util.Scanner;
public class makeIf {
    public static void main(String[] args) {
        int data [] = {2,1,6,5,4,3};
        int dataa [] = {2,1,6,5,4,3};
        System.out.println("Data sebelum di sort --> ");
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
        int m = dataa.length;
        int swap = 0;
        for(int i=0; i < m; i++){  
            for(int j=1; j < (m-i); j++){  
                if(dataa[j-1] < dataa[j]){    
                    swap = dataa[j-1];  
                    dataa[j-1] = dataa[j];  
                    dataa[j] = swap;  
                }       
            }  
        }

        System.out.println("    ");
        Scanner in = new Scanner(System.in);
        System.out.println("Pilihan --> ");
        System.out.println("1. Data kecil ke terbesar.");
        System.out.println("2. Data dari besar ke terkecil.");
        System.out.print("Masukkan pilihan => ");
        int read = in.nextInt();
        if(read == 1) {
            System.out.println("Data setelah di sort --> ");
            for(int i=0; i < data.length; i++){  
                System.out.print(data[i]+ " ");
             }    
        }else if(read == 2 ) {
            System.out.println("Data setelah di sorot --> ");
            for(int i = 0; i < dataa.length; i++) {
                System.out.print(dataa[i]+ " ");
            }
        }else {
            System.out.println("Data yang di masukkan tidak valid.");
        }
    }
}
