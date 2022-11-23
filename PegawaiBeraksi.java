public class PegawaiBeraksi {
    public static void main(String[] args) {
        // Membuat Object dengan Constructor

        Pegawai kevin = new Manager("Kevin Handoko", 5000000, 1000000);
        Pegawai iqbal = new Programmer("Iqbal Tanjung", 4000000, 400000);

        /* Mengakses Method */
        kevin.cetakInfo();
        System.out.println();
        iqbal.cetakInfo();
    }
}