public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {2,1,6,5,3,4};
        int n = arr.length;
        System.out.println("Before selection sort --> ");
        for(int i =0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        for ( int i = 0; i < n; i++ ){
            int min = i;
            for ( int j = i; j < n; j++) {
                if( arr[j] < arr[min]) {
                    min = j;
                }
            }
            int tanda = arr[min];
            arr[min] = arr[i];
            arr[i] = tanda;
        }
        System.out.println(" ");
        System.out.println("After selection sort --> ");
        for (int x = 0; x < n; x++ ) {
            System.out.print(arr[x] + " ");
        }
    }  
}

