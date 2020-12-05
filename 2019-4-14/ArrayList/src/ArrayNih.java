import java.util.ArrayList;
import java.util.Iterator;

public class ArrayNih {

    public static void main(String[] args)
    {
        // Buat araylist
        ArrayList<String> arrayList = new ArrayList<String>();

        // nambahin data ke ArrayList
        arrayList.add("Budi");
        arrayList.add("Andi");
        arrayList.add("Toni");

        // Print out nilai yang ada di arrayList, pake iterator

        // pake while
       /* Iterator itr = arrayList.iterator();
       while (itr.hasNext())
           System.out.println(itr.next()); */

        //pake for
        for (String obj:arrayList)
            System.out.println(obj);
    }
}
