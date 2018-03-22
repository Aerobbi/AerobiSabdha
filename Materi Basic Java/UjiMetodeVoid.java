public class UjiMetodeVoid {
public static void main(String[] args) {
System.out.print("Nilai adalah ");
cetakNilai(78.5);
System.out.print("Nilai adalah ");
cetakNilai(59.5);
}

public static void cetakNilai(double skor) {
	if (skor >= 90.0) {
 System.out.println('A');
 }
 else if (skor >= 80.0) {
 System.out.println('B');
 }
 else if (skor >= 70.0) {
 System.out.println('C');
 }
 else if (skor >= 60.0) {
 System.out.println('D');
 }
 else {
 System.out.println('F');
 }
 }
 }