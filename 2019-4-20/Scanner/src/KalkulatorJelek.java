import java.util.Scanner;

public class KalkulatorJelek {

    static float bilangan1=0,bilangan2=0,jumlah=0;

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        while (bilangan1 == 0 && bilangan2 ==0)
        {
            System.out.println("Program Kalkulator sederhana");
            System.out.println("1.Penjumlahan");
            System.out.println("2.Pengurangan");
            System.out.println("3.Perkalian");
            System.out.println("4.Pembagian");
            System.out.println("Pilih Operasi : ");

            int pilihan = input.nextInt();

            System.out.println("Bilangan 1 = ");
            bilangan1 = input.nextFloat();

            System.out.println("Bilangan 2 = ");
            bilangan2 = input.nextFloat();

            switch (pilihan)
            {
                case 1:
                    System.out.println(+bilangan1+" + "+bilangan2);
                    jumlah = bilangan1+bilangan2;
                    break;
                case 2:
                    System.out.println(+bilangan1+" - "+bilangan2);
                    jumlah = bilangan1-bilangan2;
                    break;
                case 3:
                    System.out.println(+bilangan1+" x "+bilangan2);
                    jumlah = bilangan1*bilangan2;
                    break;
                case 4:
                    System.out.println(+bilangan1+" : "+bilangan2);
                    jumlah = bilangan1/bilangan2;
                    break;
                default:
                    System.out.println("Isi pake Angka");
            }
            System.out.println("Hasilnya = "+jumlah);
        }
    }

}
