import java.awt.*;

public class ArraysTester {
    public static void main(String[] args) {


//        String[] requsets;
//        Point[] points;
//        float[] donation;
//
//        int[] tmp = new int[99];
//        tmp[0]=1;
//        tmp[1]=5;
//        tmp[2]=7;
//        tmp[98]= 100;
//
//        System.out.println(tmp[10]);
//        System.out.println(tmp.length);
//
//        int[] n = {1,2,3,4,5,6,7};
//
//        System.out.println(n[5]);

//        Point[] markups = {new Point(1, 5), new Point(0, 3), new Point(1, 1)};
//        String[] titles = {"Pan", "Pani", "Państow", "Doktor" };
//        Point p = new Point(100,100);
//        markups[0] = p;
//        markups[1] = markups[0];
//        markups[2] = markups[1];
//        System.out.println(markups[0]);
//        System.out.println(markups[1]);
//        System.out.println(markups[2]);
//
//        p.x = 200;
//        System.out.println();
//
//        System.out.println(markups[0]);
//        System.out.println(markups[1]);
//        System.out.println(markups[2]);

//        int[][][] multiDimArr = {{{1}}, {{1}, {3}}};
//
//        int[] arr = {1, 2, 3, 12, 17};
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("i= " + i + " ,arr[" + i + "] = " + arr[i]);
//
//        }
//        for (int a : arr) {
//            System.out.println("i= " + a + " ,arr[" + a + "] = " + arr[a]);

        String[] dogs = {"Burek","Pluto","Łajka"};
        String[] people = {"Ania","Wojtek","Dorota"};

       String[][] names = {dogs,people};

        System.out.println(names[0][0]);
        System.out.println(names[1][1]);

        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names.length; j++) {
                System.out.print(names[i][j]+" ");
            }
            System.out.println();
        }
    }
    }

