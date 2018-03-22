public class PencarianLinier {
	
public static void main(String[] args) {
int[] daftar = {1, 4, 4, 2, 5, -3, 6, 2};
int i = pencarianLinier(daftar, 4); // memberikan nilai balik 1
System.out.println(i);
int j = pencarianLinier(daftar, -4); // memberikan nilai balik -1
System.out.println(j);
int k = pencarianLinier(daftar, -3); // memberikan nilai balik 5
System.out.println(k);
 }	
	
 /** Metode untuk mencari kunci dalam daftar */
 public static int pencarianLinier(int[] daftar, int kunci) {
 for (int i = 0; i < daftar.length; i++) {
 if (kunci == daftar[i]) 
 return i; 
 } 
 return -1;
 }
 }
