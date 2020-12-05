/*
 Extend berarti antar kelas ada hubungannya,
 sehingga bsa di askes properti kelasnya
 perantaranya pake objek
*/
public class TestKtp extends Ktp{
    static int uang = 1000;
    // Agregasi kelas Ktp
    Ktp testKtp;
    public static void main(String[] args)
    {
        // tetsKtp itu objek
        Ktp testKtp = new Ktp();
        testKtp.setNama("Bedu2");
        System.out.println(testKtp.getNama());

        Ktp upcastingNih = new TestKtp();
        ((TestKtp) upcastingNih).cek();

    }

    static void cek()
    {
        System.out.println("Cek 123");
    }
}
