 // Menciptakan suatu objek lingkaran1 dengan radius 1.0
 Lingkaran1.lingkaran1 = new Lingkaran1();
 System.out.println("Luas lingkaran dengan radius "
 + lingkaran1.radius + " adalah " + lingkaran1.dapatLuas());
 
 // Menciptakan suatu objek lingkaran2 dengan radius 25
Lingkaran1.lingkaran2 = new Lingkaran1(25);
 System.out.println("Luas lingkaran dengan radius "
 + lingkaran2.radius + " adalah " + lingkaran2.dapatLuas() );
 
 
// Menciptakan suatu objek lingkaran2 dengan radius 25
Lingkaran1.lingkaran3 = new Lingkaran1(125);
 System.out.println("Luas lingkaran dengan radius "
 + lingkaran3.radius + " adalah " + lingkaran3.dapatLuas());
 
 
 // Memodifikasi radius lingkaran
 lingkaran2.radius = 100;
System.out.println("Luas lingkaran dengan radius "
 + lingkaran2.radius + " adalah " + lingkaran2.dapatLuas());