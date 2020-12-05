import java.io.IOException;
import java.util.ArrayList;

public class Arithmetic {

    static {
        System.out.println("Ini Static block");
    }

    public static void main(String[] args)
    {
        int b = 3;
        try {
            int a =1/0;
            try {

            }catch (Exception e)
            {

            }
        }catch (ArithmeticException e)
        {
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Cek Exception udah");
        }
        System.out.println(b);
    }
}
