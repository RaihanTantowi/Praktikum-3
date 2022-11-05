public class Mahasiswa extends Manusia {
    String nim;
    String jurusan;

    public void cetakInfo() {
        //memanggil method
        super.cetakInfo();
    }
    // setter
        public void setNim(String nim) {
        this.nim = nim;
        }
        public void Setjurusan(String jurusan) {
        this.jurusan = jurusan;
        }
        // getter
        public String getNim() {
        return this.nim;
        }
        public String getJurusan() {
        return this.jurusan;
        }
    }
    
    