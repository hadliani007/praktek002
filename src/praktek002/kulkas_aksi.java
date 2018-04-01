package praktek002;

public class kulkas_aksi {
    public static void main(String[] args) {
         kulkas r1 = new kulkas();
         
         r1.harga_kulkas = 6000000;
         r1.jumlah_kulkas = 5;  
         
         r1.cetakInfo();
         System.out.println("total   =   "+r1.hitungPembelian());
         
    }
  
}
