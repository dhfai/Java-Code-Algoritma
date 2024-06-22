package alpro1adand;

public class Latihan2 {
    public static void main(String[] args) {
     float s, t , L, r;
     
     s = 8;
     t = 5;
     
     r = (float) (s * 0.5);   
     L = (float) ((s*s)+(s*0.5*t)+(r*r*3.14));
     
    System.out.println("Sisi Adalah : "+s);//tanda tambah disebut concatenasi penyambung antara String dan Variabel 
    System.out.println("Tinggi Adalah : "+t);       
    System.out.println("Alas Adalah : "+s);
    System.out.println("Jari Adalah : "+r);   
    System.out.println("Luas Bangun Datar adalah : "+L);
    
    
    }
}
