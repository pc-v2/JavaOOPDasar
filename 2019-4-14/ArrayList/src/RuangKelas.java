import java.util.ArrayList;
import java.util.Iterator;

public class RuangKelas {

    public static void main(String[] args)
    {
        // Object yang diisi value
        Pelajar pelajar1 = new Pelajar(1,"Dono",19);
        Pelajar pelajar2 = new Pelajar(9,"Rara",17);
        Pelajar pelajar3 = new Pelajar(3,"Bambang",20);

        // ArrayList dari Kelas Pelajar
        ArrayList<Pelajar> pelajars = new ArrayList<Pelajar>();
        pelajars.add(pelajar1);
        pelajars.add(pelajar2);
        pelajars.add(pelajar3);

        // pake While
       /*Iterator itr = pelajars.iterator();
       while (itr.hasNext())
       {
           Pelajar pj = (Pelajar)itr.next();
           System.out.println(pj.noAbsen +" "+pj.nama+" "+pj.umur);
       } */

        //pake for
        //pake for
        for (Pelajar obj:pelajars)
            System.out.println(obj.noAbsen + " "+ obj.nama +" "+obj.umur);

    }

}
