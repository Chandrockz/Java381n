package com.company;

public class Vid31_Methods_Ch7 {

    int logic(int x, int y){
        int z = x*y;
        System.out.println(z);
        return z;
    }
    public static void main(String[] args) {
//        ninnati teepi jnapakame ...kannulu daati podasale
//                nuvu ika raavu ani telisi...prasnala vaana ika mugise..
//        janmantha daachestha...neetho unna aa kontha kaalanni

        int a = 50;
        int b = 110;
        int c;
        Vid31_Methods_Ch7 obj = new Vid31_Methods_Ch7();
        c = obj.logic(a,b);
        //int c = logic(a,b);
        System.out.println(c);

        int a1=20;
        int b1 =2;
        int c1;
        Vid31_Methods_Ch7 obj1 = new Vid31_Methods_Ch7();
        c1 = obj1.logic(a1,b1);
        //int c1 = logic(a1,b1);
        System.out.println(c1);
//        int sum = a + b;
//        if (a>b){
//            System.out.println(sum*5);
//        }
//        else {
//            System.out.println(sum/10);
//        }

    }
}
