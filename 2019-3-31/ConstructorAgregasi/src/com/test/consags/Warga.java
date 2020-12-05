package com.test.consags;

public class Warga {
    // agregasi kelas Alamat dan String nama, pekerjaan
    Alamat alamat;
    String nama, pekerjaan;

    // Constructor
    public Warga(Alamat alamat, String nama, String pekerjaan) {
        this.alamat = alamat;
        this.nama = nama;
        this.pekerjaan = pekerjaan;
    }

    public static void main(String[] args)
    {
        // Isi nilai obj dari hasil method constructor alamat
        Alamat alamat1 = new Alamat("Jalan Baru","021","17423");
        Alamat alamat2 = new Alamat("Jalan Lama","022","17421");

        // Isi nilai obj dari hasil method constructor warga
        Warga warga1 = new Warga(alamat1,"Jaenudin","Penguasa");
        Warga warga2 = new Warga(alamat2,"Udin","Pengusaha");

        // System.out.println(warga1);

        // Print Out isi informasi warga 1 dan warga 2
        warga1.hasil();
        warga2.hasil();
    }

    // Ngedetailin isi objek buat di print out
    // Karena ga bsa langsung di print isi objeknya
    void hasil()
    {
        System.out.println(nama+" "+pekerjaan+" "+ alamat.namaJalan+" "+alamat.noRumah+" "+alamat.kodePos);
    }
}

