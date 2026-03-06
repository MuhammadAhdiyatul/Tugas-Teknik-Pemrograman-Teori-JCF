import java.util.Vector;

public class Vektor {
    public static void main(String[] args){
        Vector<String> Nama = new Vector<>();
        Nama.add("Ipan");
        Nama.add("Pahri");
        Nama.add("Ruzain");

        System.out.println("Daftar Nama: " + Nama);
        System.out.println("Jumlah Nama: " + Nama.size());
        System.out.println("Ambil Nama indeks ke 2: " + Nama.get(2));
    }
    
}
