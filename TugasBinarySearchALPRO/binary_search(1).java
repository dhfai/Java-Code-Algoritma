public class binary_search {
    public static void main(String[] arg){

        int[] data= {1,2 ,3, 4,5};

        int i, r, mid, x, ketemu, cari;
        x = 5;
        i = 0;
        r = x - 1;
        ketemu = 0;
        cari = 4;
        while ((i<r) && (ketemu == 0)){
            mid = (i+r)/2;
            System.out.println("data tengah :"+ mid);
            if (data[mid] == cari)
                ketemu = 1;
            else if (cari < data[mid]){
                System.out.println("Cari di kiri ");
                r = mid - 1;
            }
            else{
                i=mid+1;
                System.out.println("Cari di kanan ");
            }
        }
        if (ketemu==1)
            System.out.println("data ada");
        else
            System.out.println("data tidak ada");
    }

}
