package com.test.bag2;

public class overLoad {

    public static void main(String[] args)
    {
        System.out.println(temen("Andre"));
        temen();
        System.out.println(temen(1,"Andre"));

        System.out.println("");

        // Sahabat
        System.out.println(sahabat("Andi"));
        sahabat();
        System.out.println(sahabat(2,"Andi"));

    }

    // method temen
    public static String temen(String t1)
    {
        return t1;
    }

    // overloading method temen
    public static void temen()
    {
        System.out.println("Teman Void");
    }

    public static int temen(int ti1, String ti2)
    {
        System.out.print(ti2);
        return ti1;
    }

    // method sahabat
    public static String sahabat(String s1)
    {
        return s1;
    }

    // overloading method sahabat
    public static void sahabat()
    {
        System.out.println("Sahabat Void");
    }

    public static int sahabat(int ti1, String ti2)
    {
        System.out.print(ti2);
        return ti1;
    }

}

