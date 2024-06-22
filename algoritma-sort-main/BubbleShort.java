import java.util.Random;

public class BubbleShort {

    public static void main(String[] args) {
        // Inisialisasi data dan jumlah data
        Random random = new Random();
        int[] data = new int[10]; int ndata = 9;

        // Pengisian data menggunakan random
        for (int i = 0; i < ndata; i++){
            int rand = random.nextInt(1,10); // bertujuan agar data tidak terlalu besar, dengan batas 1-10
            data[i] = rand; // mengisi data
        }

        // Bubble Short
        int temp; // variabel sementara untuk pertukaran data
        for (int i = 0; i < data.length - 1; i++){ // perulangan untuk data
            for (int j = i + 1; j < data.length; j++){ // perulangan untuk membandingkan data
                if (data[i] > data[j]){ // jika data ke i lebih besar dari data ke j maka tukar data, ini adalah kondisi ascending
                    temp = data[j]; // tukar data masukkan data[j] ke variable temp
                    data[j] = data[i]; // berhubung isi dari data[j] sudah masuk ke temp, maka data[j] diisi dengan data[i]
                    data[i] = temp; // kembalikan data[i] dengan isi dari temp
                }
            }
        }

        // Output
        System.out.println("Tampilan data : ");
        for (int i = 0; i < data.length; i++){
            System.out.println("Data pada indeks ke "+i+" : "+data[i]);
        }
    }
}