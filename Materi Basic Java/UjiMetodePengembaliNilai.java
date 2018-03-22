public class UjiMetodePengembaliNilai {
 public static void main(String[] args) {
System.out.print("Nilai adalah " + dapatNilai(78.5));
 System.out.print("\nNilai adalah "+ dapatNilai(59.5));
 }

 public static char dapatNilai(double skor) {
 if (skor >= 90.0)
 return 'A';
 else if (skor >= 80.0)
 return 'B';
 else if (skor >= 70.0)
 return 'C';
 else if (skor >= 60.0)
 return 'D';
 else
 return 'F';
 }
 }