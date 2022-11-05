public class Programmer extends Pegawai{
    double Bonus;

    public void setBonus(double Bonus) {
        this.Bonus = Bonus;
    }
    public double getBonus() {
        return this.Bonus;
    }
    public void cetakinfo() {
        super.cetakinfo();
    }
    public void cetakBonus() {
        Bonus = 3000000.00;
        System.out.println("Bonus : Rp." + this.Bonus);
    }
}