import java.util.Scanner;

 public class FahrenheitKeCelsius {
 public static void main(String[] args) {
 Scanner masukan = new Scanner(System.in);

 System.out.print("Masukkan derajat Fahrenheit: ");
 double fahrenheit = masukan.nextDouble();

 // Konversi Fahrenheit menjadi Celsius
 double celsius = (5.0 / 9)* (fahrenheit - 32);
 System.out.println("Fahrenheit " + fahrenheit + " adalah " +
 celsius + " dalam Celsius");
 }
 }