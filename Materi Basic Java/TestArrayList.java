 public class TestArrayList {
 public static void main(String[] args) {
 // Menciptakan suatu list untuk menyimpan nama-nama kota
 java.util.ArrayList listKota = new java.util.ArrayList();

 // Menambahkan beberapa kota dalam list
 listKota.add("Klaten");
 // listKota sekarang memuat [Klaten]
 listKota.add("Balige");
 // listKota sekarang memuat [Klaten, Balige]
 listKota.add("Mataram");
 // listKota sekarang memuat [Klaten, Balige, Mataram]
 listKota.add("Yogyakarta");
 // listKota sekarang memuat [Klaten, Balige, Mataram, Yogyakarta]
 listKota.add("Siantar");
 // memuat [Klaten, Balige, Mataram, Yogyakarta, Siantar]
 listKota.add("Tarabunga");
 // memuat [Klaten, Balige, Mataram, Yogyakarta, Siantar, Tarabunga]

 System.out.println("Ukuran list? "+ listKota.size());
 System.out.println("APakah Klaten ada dalam list? " +
 listKota.contains("Klaten"));
 System.out.println("Lokasi Tarabunga dalam list? "
 + listKota.indexOf("Tarabunga"));
 System.out.println("Apakah list kosong? " +
 listKota.isEmpty()); // Menampilkan false

 // Menyisipkan suatu kota baru pada indeks 2
 listKota.add(2, "Solo");
 // memuat [Klaten, Balige, Solo, Mataram, Yogyakarta, Siantar, Tarabunga]

 // Menghapus suatu kota dari list
 listKota.remove("Siantar");
 // memuat [Klaten, Balige, Solo, Mataram, Yogyakarta, Tarabunga]

 // Menghapus suatu kota pada indeks 1
 listKota.remove(1);
 // memuat [Klaten, Solo, Mataram, Yogyakarta, Tarabunga]

 // Menampilkan isi list
 System.out.println(listKota.toString());

 // Menampilkan isi list dalam urutan terbalik
 for (int i = listKota.size() - 1; i >= 0; i--)
 System.out.print(listKota.get(i) + " ");
 System.out.println();

 // Menciptakan suatu list untuk menyimpan dua lingkaran
 java.util.ArrayList list = new java.util.ArrayList();

 // Menambahkan dua lingkaran
 list.add(new Lingkaran4(2));
 list.add(new Lingkaran4(3));

 // Menampilkan luas lingkaran pertama di dalam list
 System.out.println("Luas lingkaran pertama? " +
 ((Lingkaran4)list.get(0)).dapatLuas());
 
  // Menampilkan luas lingkaran kedua di dalam list
 System.out.println("Luas lingkaran kedua? " +
 ((Lingkaran4)list.get(1)).dapatLuas());
 }
 }