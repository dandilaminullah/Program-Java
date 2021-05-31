
import com.java.SewaKOS.model.Kamar;
import com.java.SewaKOS.model.Penyewa;
import com.java.SewaKOS.controller.Petugas;
//program penyewaan kos menggunakan java
public class Main {
    public static void main(String args[]){
        Penyewa patur = new Penyewa("Faturrahman Lahay","Desa Datahu","750109040","08534018");
                
        Kamar satu = new Kamar("30","3 orang","12 maret 2021",patur);
        
        Petugas Dandi = new Petugas("Dandi Laminullah", 17);
        
        babakan.tambahKamar(satu);
        babakan.bacaKamar();
    }
}
