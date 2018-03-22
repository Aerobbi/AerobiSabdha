public class Inkremen {
 public static void main(String[] args) {
 int x = 1;
 System.out.println("Sebelum pemanggilan, x adalah " + x);
inkremen(x);
 System.out.println("Setelah pemanggilan, x adalah " + x);
 }

 public static void inkremen(int n) {
n++;
 System.out.println("n di dalam metode adalah " + n);
 }
 }