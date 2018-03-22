 public class UjiLingkaranPersegiPanjang {
 public static void main(String[] args) {
 Lingkaran4 lingkaran = new Lingkaran4(1);
 System.out.println("Lingkaran "+ lingkaran.keString());
 System.out.println("Radius sebesar "+ lingkaran.dapatRadius());
 System.out.println("Luas sebesar "+ lingkaran.dapatLuas());
 System.out.println("Diameter sebesar "+ lingkaran.dapatDiameter());

 PersegiPanjang1 persegipanjang = new PersegiPanjang1(2, 4);
 System.out.println("\nPersegi-panjang "+ persegipanjang.keString());
 System.out.println("Luas sebesar "+ persegipanjang.dapatLuas());
 System.out.println("Keliling sebesar " +
 persegipanjang.dapatKeliling());
 }
 }