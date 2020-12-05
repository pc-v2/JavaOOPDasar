package com.test.bag2;

public class IniKelasOverloading {

    public static void main(String[] args)
    {
        System.out.println(pilpres("Jokowi"));
        System.out.println(pilpres("Jokowi","Prabowo"));
        System.out.println(pilpres("Jokowi","Prabowo",2019));
    }

    // Contoh Method yang OverLoading
    public static String pilpres(String s1)
    {
        return s1;
    }

    public static String pilpres(String s1, String s2)
    {
        return s1+s2;
    }

    public static String pilpres(String s1, String s2, int s3)
    {
        return s1+s2+s3;
    }

}

