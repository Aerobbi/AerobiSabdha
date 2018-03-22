public class UjiPelewatanArray {
 /** Metode utama */
 public static void main(String[] args) {
int[] a = {1, 2};

 // Menukar elemen-elemen menggunakan metode tukar
 System.out.println("Sebelum memanggil metode tukar");
 System.out.println("Array adalah {" + a[0] + ", " + a[1] + "}");
 tukar(a[0], a[1]);
 System.out.println("Setelah memanggil metode tukar"); 
 System.out.println("Array adalah {" + a[0] + ", " + a[1] + "}");

 // Menukar elemen-elemen menggunakan metode tukarSatuDuaArray
 System.out.println("Sebelum memanggil metode tukarSatuDuaArray");
 System.out.println("Array adalah {" + a[0] + ", " + a[1] + "}");
 tukarSatuDuaArray(a);
 System.out.println("Setelah memanggil metode tukarSatuDuaArray");
 System.out.println("Array adalah {" + a[0] + ", " + a[1] + "}");
 }

 /** Menukar dua variabel */
 public static void tukar(int n1, int n2){
 int temp = n1;
 n1 = n2;
 n2 = temp;
 }

 /** Menukar dua elemen pertama dalam array */
 public static void tukarSatuDuaArray(int[] array){
 int temp = array[0];
 array[0] = array[1];
 array[1] = temp;
 }
 }