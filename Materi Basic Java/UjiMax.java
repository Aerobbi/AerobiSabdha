public class UjiMax {
 /** metode utama */
 public static void main(String[] args) {
 int i = 5;
 int j = 2;
 int k = max(i, j);
 System.out.println("Nilai maksimum antara " + i +
 " dan " + j + " adalah " + k);
 }

 /** Mengembalikan nilai maksimum antara dua angka */
public static int max(int num1, int num2)
{
 int hasil;

 if (num1 > num2)
 hasil = num1;
 else
 hasil = num2;
return hasil;
}
 }