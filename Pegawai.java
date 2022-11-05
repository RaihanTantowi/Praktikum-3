public class Pegawai {
    String Nama;
    double GajiPokok;

    public void setNama(String Nama){
        this.Nama = Nama;
    }
    public String getNama(){
        return this.Nama;
    }
    public void setGajiPokok(double GajiPokok){
        this.GajiPokok = GajiPokok;
    }
    public double getGajiPokok(){
        return this.GajiPokok;
    }
    public void cetakinfo(){
        System.out.println("Nama : " + this.Nama);
        System.out.println("Gaji Pokok : " + this.GajiPokok);
    }
}