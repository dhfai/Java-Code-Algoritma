public class latihan {
    public static void main(String[] args) {
        int nilai[] = {2,1,6,5,3,4};
        selectionSortInt(nilai);
    }

    public static void selectionSortInt(int[] bilangan ) {
        System.out.println("BELUM --> ");
        for (int b : bilangan) {
            System.out.print(b + ",");
        }
        
        for(int i = 0; i < bilangan.length; i++ ) {
            int indexArray = i;
            for( int j = i; j < bilangan.length; j++) {
                if( bilangan[indexArray] < bilangan[j]) {
                    indexArray = j;
                }
            }
            int tanda = bilangan[i];
            bilangan[i] = bilangan[indexArray];
            bilangan[indexArray] = tanda;
        }
        System.out.println("");
        System.out.println("SESUDAH --> ");
        for (int b : bilangan) {
            System.out.print(b + ",");
        }
    }
}
