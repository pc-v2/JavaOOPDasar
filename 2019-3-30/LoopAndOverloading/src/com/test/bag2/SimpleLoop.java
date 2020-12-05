package com.test.bag2;

public class SimpleLoop {

    public static void main(String[] args)
    {
        // Simple Loop
        // angka++ -> angka = angka + 1
        for (int angka=1;angka<10;angka++)
            System.out.println(angka);

        int i=1;
        while (i<10)
        {
            System.out.println(i);
            i++;
        }

        // For Loop, diapakai klo mau looping variabel
        // dgn isi banyak (array)
        int array[]={21,2,31,31,31,14};
        for (int a:array)
        {
            System.out.println(a);
        }

    }
}
