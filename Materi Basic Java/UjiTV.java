public class UjiTV {
 public static void main(String[] args) {
 TV tv1 = new TV();
 tv1.hidupKan();
 tv1.setKanal(30);
 tv1.setVolume(3);

 TV tv2 = new TV();
 tv2.hidupKan();
 tv2.kanalNaik();
 tv2.kanalTurun();
 tv2.volumeNaik();

 System.out.println("kanal tv1 adalah " + tv1.kanal
 + " dan level volumenya adalah "+ tv1.levelVolume);

System.out.println("kanal tv1 adalah " + tv2.kanal
 + " dan level volumenya adalah " + tv2.levelVolume);
 }
 }