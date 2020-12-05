public class Ayah extends Kakek{
    // Aggreagation kelas kakek
    Kakek ucok;

    // Global Variabel
    static int uang = 1000;
    static String motor = "Supra";

    public static void main(String[] args)
    {
        Ayah objAyah = new Ayah();
        System.out.println("Jumlah uang ayah dan kakee :"
                +(objAyah.uangKakek+objAyah.uang));
    }

}
