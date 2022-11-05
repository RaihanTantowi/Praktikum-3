public class Manager extends Pegawai{
    double Tunjangan;

    public void setTunjangan(double Tunjangan) {
        this.Tunjangan = Tunjangan;
    }
    public double getTunjangan() {
        return this.Tunjangan;
    }
    public void cetakinfo() {
        super.cetakinfo();
    }
    public void cetakTunjangan() {
         Tunjangan = 6000000;
         System.out.println("Tunjangan : Rp." + this.Tunjangan);
    }
}