package alpro1adand;

public class Latihan3 {
    public static void main(String[] args) {
        float L, LP, LS, LL, p, l, s, a, t, j; 
      
        p=20;
        l=15;
        s = 5;
        a = 5;
        j =(float) 2.5;
        t = 10;
          
        LP = s*s;
        LS = (float) (0.5*a*t);
        LL = (float) (3.14*j*j);
        L = (p*l) - (LL +LS+LP);
        
        System.out.println("Luas persegi adalah "+LP);
        System.out.println("Luas Segitiga dalah "+LS);
        System.out.println("Luas Lingkaran dalah "+LL);
        System.out.println("Luas Lapangan adalah "+L);
        System.out.println(L+" Luas Daerah Arsiran adalah ");
                        
    }
}
