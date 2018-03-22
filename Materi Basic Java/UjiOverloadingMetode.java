public class UjiOverloadingMetode {
 /** Metode utama */
 public static void main(String[] args) {
 // Memanggil metode max dengan parameter-parameter int
 System.out.println("Nilai maksimum antara 3 dan 4 adalah "
 + max(3, 4));

 // Memanggil metode max dengan parameter-parameter double
 System.out.println("Nilai maksimum antara 3.0 dan 5.4 adalah "
 + max(3.0, 5.4));

 // Memanggil metode max dengan tiga parameter double
 System.out.println("Nilai maksimum antara 3.0, 5.4, dan 10.14 adalah "
 + max(3.0, 5.4, 10.14));
 }

 /** Memberikan nilai balik berupa nilai maksium antara dua int */
 public static int max(int num1, int num2){
 if (num1 > num2)
 return num1;
 else
 return num2;
 }

 /** Memberikan nilai balik berupa nilai maksium antara dua double */
 public static double max(double num1, double num2){
 if (num1 > num2)
 return num1;
 else
 return num2;
 }

 /** Memberikan nilai balik berupa nilai maksium antara tiga double */
 public static double max(double num1, double num2, double num3){
 return max(max(num1, num2), num3);
 }
 }