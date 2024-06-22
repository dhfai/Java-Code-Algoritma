public class BinarySearch {
    public static void main(String[] args) {
        // data yang akan di cari
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        // nilai yang dicari
        int search = 30;

        // inisialisasi nilai start, end, dan mid
        int start = 0;
        int end = 19; //atau bisa menggunakan => int end = arr.length - 1;
        int mid = (start + end) / 2;

        // binary search untuk mencari data menggunakan for loop

        /*
        * ini adalah cara penulisan for loop tanpa kondisi,
        * kenapa tanpa kondisi? karena kondisi sudah di dalam loop maksudnya adalah start <= end
        * jadi kita tidak membutuhkan kondisi lagi di dalam for loop ini
        */
        for (; start <= end; mid = (start + end) / 2) {
            /*
            * ini untuk melakukan pengecekkan data, array[mid] == search artinya data yang dicari ditemukan
            * arr[mid] = maksudnya adalah data yang ada di index mid itu berapa setelah itu di bandingkan dengna data yang dicari
            * contoh : arr[mid] = 10, search = 10, maka data ditemukan
            */
            if (arr[mid] == search) {
                System.out.println("Data found at index: " + mid); // menampilkan data yang ditemukan
                System.out.println("Start: " + start); // menampilkan nilai start
                System.out.println("Mid: " + mid); // menampilkan nilai mid
                System.out.println("End: " + end); // menampilkan nilai end
                break; // keluar dari loop jika data ditemukan
            } else if (arr[mid] < search) { // ini untuk melakukan pengecekkan jika data yang dicari lebih besar dari data yang ada di index mid
                start = mid + 1; // jika data yang dicari lebih besar dari data yang ada di index mid, maka nilai start di tambah 1
            } else {
                end = mid - 1; // jika data yang dicari lebih kecil dari data yang ada di index mid, maka nilai end di kurang 1
            }
        }


        // menggunakan while loop
        while (start <= end) {
            if (arr[mid] == search) {
                System.out.println("Data found at index: " + mid);
                System.out.println("Start: " + start);
                System.out.println("Mid: " + mid);
                System.out.println("End: " + end);
                break;
            } else if (arr[mid] < search) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
    }
}
