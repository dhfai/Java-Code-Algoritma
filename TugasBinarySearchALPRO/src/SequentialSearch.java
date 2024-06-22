public class SequentialSearch {
  public static void main(String[] args) {
    int[] data = {1, 2, 3, 4, 5};
    int x = 3;
    int i;
    boolean ditemukan = false;

    for (i = 0; i < data.length; i++) {
        if (data[i] == x) {
            ditemukan = true;
            break;
        }
    }
    if (ditemukan) {
        System.out.println("Data : " + x + " ditemukan pada index : " + i);
    }
    else {
        System.out.println("Data tidak ditemukan");
    }
  }
}
