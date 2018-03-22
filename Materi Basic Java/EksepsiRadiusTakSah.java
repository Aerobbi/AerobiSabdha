 public class EksepsiRadiusTakSah extends Exception{
 private double radius;

 /** Menciptakan suatu eksepsi */
 public EksepsiRadiusTakSah(double radius){
 super("Radius tidak sah " + radius);
 this.radius = radius;
 }

 /** Mengembalikan radius */
 public double dapatRadius() {
 return radius;
 }
 }