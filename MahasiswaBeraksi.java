public class MahasiswaBeraksi {
    public static void main(String[] args){
    
    // Membuat object
    Mahasiswa anton = new Mahasiswa();

    /* memanggil atribut dan memberi nilai */
    anton.setNim("10102020");
    anton.nama = "Anton Santoso";
    anton.jenisKelamin = "Laki-laki";
    anton.umur = 28;
    anton.alamat = "Bekasi Kota";
    anton.Setjurusan("Informatika");
    anton.cetakInfo();
    System.out.println("Nim: " + anton.getNim());
    System.out.println("Jurusan: " + anton.getJurusan());
    }
} 