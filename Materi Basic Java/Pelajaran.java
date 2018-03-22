 public class Pelajaran {
 private String namaPelajaran;
 private String[] siswa = new String[100];
 private int jumlahSiswa;

 public Pelajaran(String namaPelajaran) {
 this.namaPelajaran = namaPelajaran;
 }

 public void tambahSiswa(String siswa1) {
 siswa[jumlahSiswa] = siswa1;
 jumlahSiswa++;
 }

 public String[] dapatSiswa() {
 return siswa;
 }

 public int dapatJumlahSiswa() {
 return jumlahSiswa;
 }

 public String dapatNamaPelajaran() {
 return namaPelajaran;
 }

 public void buangSiswa(String siswa) {
 // dibiarkan kosong untuk latihan
 }
 }