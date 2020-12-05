import java.util.Scanner;

public class StringStore {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukan Jumlah String");
        int jmlString = Integer.parseInt(scan.nextLine());

        // Buat String buat nyimpen nilai di array
        String[] arrayNya = new String[jmlString];
        for (int i = 0; i<arrayNya.length; i++)
        {
            System.out.println("Masukan Stringnya" + (i+1) + " : ");
            arrayNya[i] = scan.nextLine();
        }

        // Show up nilai yang kita simpen
        for (int i = 0 ; i<arrayNya.length ; i++)
        {
            System.out.println("Stting : " +(i+1) +" : ");
            System.out.println(arrayNya[i]+"\n");
        }

    }

}
