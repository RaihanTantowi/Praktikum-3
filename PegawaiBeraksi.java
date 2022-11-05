public class PegawaiBeraksi {
    public static void main(String[] args) {
        //Membuat Objek
        Manager manager = new Manager();
        manager.Nama = "Beni";
        manager.GajiPokok = 5000000;
        manager.cetakinfo();
        manager.cetakTunjangan();
        System.out.println("========================");
        Programmer programer = new Programmer();
        programer.Nama = "Amar";
        programer.GajiPokok = 8000000;
        programer.cetakinfo();
        programer.cetakBonus();
    }
}
