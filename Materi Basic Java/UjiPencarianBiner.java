public class UjiPencarianBiner {
public static void main(String[] args) {
    int[] daftar = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
    int i = PencarianBiner.pencarianBiner(daftar, 2); // Mengembalikan 0
    System.out.println(i);
    int j = PencarianBiner.pencarianBiner(daftar, 11); // Mengembalikan 4
    System.out.println(j);
    int k = PencarianBiner.pencarianBiner(daftar, 12); // Mengembalikan –6
    System.out.println(k);
    int l = PencarianBiner.pencarianBiner(daftar, 1); // Mengembalikan –1
    System.out.println(l);
    int m = PencarianBiner.pencarianBiner(daftar, 3); // Mengembalikan –2
    System.out.println(m);
  }
}