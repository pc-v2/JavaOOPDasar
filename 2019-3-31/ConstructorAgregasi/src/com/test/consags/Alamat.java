package com.test.consags;

public class Alamat {
    // Agregasi
    String namaJalan;
    String noRumah;
    String kodePos;

    // Method Constructor
    // alt + insert, pilih constructor
    // buat properti aggragation bsa di kasih nilai
    public Alamat(String namaJalan, String noRumah, String kodePos) {
        this.namaJalan = namaJalan;
        this.noRumah = noRumah;
        this.kodePos = kodePos;
    }
}
