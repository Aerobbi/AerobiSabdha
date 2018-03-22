public class TestArray {
public static void main(String[] args) {
int x = 1; // x merepresentasikan suatu nilai int
int[] y = new int[10]; // y merepresentasikan suatu array dengan elemen-elemen int
m(x, y); // Memanggil metode m dengan argumen x dan y
System.out.println("x adalah " + x);
System.out.println("y[0] adalah " + y[0]);
}
public static void m(int angka, int[] array){
angka = 1001; // Menugaskan suatu nilai baru kepada angka
array[0] = 5555; // Menugaskan suatu nilai baru kepada array[0]
}
}