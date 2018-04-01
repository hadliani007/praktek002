package praktek002;

public class kulkas {
    
       int harga_kulkas;
       int jumlah_kulkas;

    public kulkas(){
          harga_kulkas=1200000;
           jumlah_kulkas=5;
    
    }
       
       
       void cetakInfo(){
           System.out.println("====================");
           System.out.println("harga_kulkas:   "+harga_kulkas);
           System.out.println("jumlah_kulkas : "+jumlah_kulkas);
           System.out.println("====================");
       }
       Integer hitungPembelian(){
            int total;
            total=harga_kulkas*jumlah_kulkas;
            return total;
 }        
       void cetaktotal(){
        System.out.println("Totalnya    = "+hitungPembelian());
    }
}
