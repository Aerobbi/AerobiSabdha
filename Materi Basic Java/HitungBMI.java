import java.util.Scanner;

 public class HitungBMI {
 public static void main(String[] args) {
 Scanner masukan = new Scanner(System.in);

 // Meminta pengguna memasukkan berat dalam pound
 System.out.print("Masukkan berat badan dalam pound: ");
 double berat = masukan.nextDouble();

 // Meminta pengguna memasukkan tinggi badan dalam inci
 System.out.print("Masukkan tinggi badan dalam inci: ");
 double tinggi = masukan.nextDouble();

 final double KILOGRAM_PER_POUND = 0.45359237; // Konstanta
 final double METER_PER_INCI = 0.0254; // Konstanta

 // Hitung BMI
 double beratDalamKilogram = berat * KILOGRAM_PER_POUND;
 double tinggiDalamMeter = tinggi * METER_PER_INCI;
 double bmi = beratDalamKilogram /
 (tinggiDalamMeter * tinggiDalamMeter);

 // Tampilkan hasil
 System.out.printf("BMI Anda adalah %5.2f\n", bmi);
 if (bmi < 16)
 System.out.println("Anda sangat kurus");
 else if (bmi < 18)
 System.out.println("Anda kurus");
 else if (bmi < 24)
 System.out.println("Anda normal");
else if (bmi < 29)
 System.out.println("Anda gemuk");
 else if (bmi < 35)
 System.out.println("Anda sangat gemuk");
 else
 System.out.println("Anda terlalu gemuk");
 }
 }