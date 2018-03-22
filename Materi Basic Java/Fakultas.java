 public class Fakultas extends Karyawan{
 public static void main(String[] args) {
 new Fakultas();
 }

 public Fakultas(){
 System.out.println("(4) Melaksanakan tugasnya Fakultas");
 }
 }

 class Karyawan extends Orang{
 public Karyawan(){
 this("(2) Memanggil konstruktor teroverload kelas Karyawan");
 System.out.println("(3) Melaksanakan tugasnya Karyawan ");
 }

 public Karyawan(String s){
 System.out.println(s);
 }
 }

 class Orang {
 public Orang(){
 System.out.println("(1) Melakukan tugasnya Orang");
 }
  }