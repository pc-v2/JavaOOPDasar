public class Ktp {

    public String nama;
    public String alamat;


    // Teken Alt + insert lalu pilih getter and setter

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public static void main(String[] args)
    {
        Ktp ktp = new Ktp();
        ktp.setNama("Bedu");
        System.out.println(ktp.getNama());

    }

}
