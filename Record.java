record ProfilMahasiswa(String nama, int umur, String nim, String jurusan){}

public class Record{
    public static void main(String[] args){
        ProfilMahasiswa mhs1 = new ProfilMahasiswa("Muhammad Zaki", 19, "123456789", "Teknik Pertambangan");
        ProfilMahasiswa mhs2 = new ProfilMahasiswa("Ruzain Haikal", 18, "789654321", "Teknik Multimedia dan Jaringan");
        ProfilMahasiswa mhs3 = new ProfilMahasiswa("Pahri Mufti", 19, "453216789", "Teknik Informatika");

        System.out.println("Profil Mahasiswa 1:" + mhs1);
        System.out.println("Profil Mahasiswa 2:" + mhs2);
        System.out.println("Profil Mahasiswa 3:" + mhs3);
    }
}