 public class TumpukanKu{
 private java.util.ArrayList list = new java.util.ArrayList();

 public boolean apaKosong(){
 return list.isEmpty();
 }

 public int dapatUkuran(){
 return list.size();
 }

 public Object intip(){
 return list.get(dapatUkuran() - 1);
 }

 public Object hapus(){
 Object o = list.get(dapatUkuran() - 1);
 list.remove(dapatUkuran() - 1);
 return o;
 }

 public void dorong(Object o){
 list.add(o);
 }

 public int cari(Object o){
 return list.lastIndexOf(o);
 }

 /** Mengoverride metode toString dalam kelas Object */
 public String toString(){
 return "Tumpukan: " + list.toString();
 }
 }