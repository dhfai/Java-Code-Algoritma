public class TugasSelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,1,6,5,3,4};
        int n = arr.length;
        System.out.println("Before ---> ");
        for ( int x = 0; x < n; x ++) {
            System.out.print(arr[x] + " , ");
        }
        System.out.println("");
        for ( int i = 0; i < n; i++ ) {
            int max = i;
            for ( int j = i; j < n; j++) {
                if(arr[j] < arr[max]) {
                    max = j;
                }
            }
            int tanda = arr[max];
            arr[max] = arr[i];
            arr[i] = tanda;
        }
        System.out.println("After ---> ");
        for ( int b = 0; b < n; b++) {
            System.out.print(arr[b] + " , ");
        }

    }
}
