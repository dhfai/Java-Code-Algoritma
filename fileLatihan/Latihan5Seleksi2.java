package alpro1adand;

    public class Latihan5Seleksi2 {
        public static void main(String[] args) {
            String NamaBarang;
            float Harga = 0,Biaya = 0, potongan,Pajak, Total, Untung;
            int jumlah; 
            
            NamaBarang="Lemari";
            jumlah = 2;
            
            //fungsi equalsIgnoreCase adalah untuk membandingkan String
            
            if (NamaBarang.equalsIgnoreCase("Kursi"))//jika NamaBarang yang diinput sama dengan Kursi 
            {
                Harga = 1500000;
                Biaya = 1000000;
            }
            else if (NamaBarang.equalsIgnoreCase("Meja"))
            {
                Harga = 2000000;
                Biaya = 1750000;
            }
            else if (NamaBarang.equalsIgnoreCase("Lemari")) 
            {
                Harga = 3500000;
                Biaya = 3000000;
            }
            
           if (jumlah >=3) 
           {
               potongan = (float) (Harga*jumlah*0.1);
           }
           else 
           {
               potongan = 0; 
           }
           
           Total = (Harga*jumlah)-potongan;
           Untung = Total - (Biaya*jumlah);
           Pajak = (float) (0.02*Untung);
           
           System.out.println("Harga adalah : "+Harga);
           System.out.println("Biaya adalah : "+Biaya);
           System.out.println("Total biaya adalah : "+Total);
           System.out.println("Untung biaya adalah : "+Untung);
           System.out.println("Pajak adalah : "+Pajak);
           
           
        }
    
}
