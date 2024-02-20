package com.company;
public class Vid32_Method_Overloading {
    static void mdo(){                      //mdo for MethoD Overloading
        System.out.println("Hey! Chandrockz, How are you?");
    }
    static void mdo(int a){
        System.out.println("Hey bro " + a + ", How are you?");
    }
    static void mdo(int a, int b){
        System.out.println("Hey, " + a + " Buddy" + "what's going on with " + b );
    }

    static void  change2(int[] arr){
        arr[1] = 66;
    }
    static void change(int a){
        a = 20;
    }
    static void tellJoke(){
        System.out.println("I invented a new word\n" +
                "Plagiarism");
        return;
    }

    public static void main(String[] args) {
        //tellJoke();

        // ------ 1. Changing the integer -------------------
//        int x = 78;
//        change(x);
//        System.out.println("The value of a number after changing is: " + x);

        // ------- 2. Changing an array ---------------------
//        int[] y = {78, 46, 96, 76, 80, 69};
//        change2(y);
//        System.out.println("The value of an array after changing is: " + y[1]);
        // --Array value is changed because, the reference is given to change2 method
        //   and then it executed.


        // ----------- Method Overloading --------------------

        mdo();              // mdo for Method Overloading
        mdo(3000);
        mdo(4000,6000);
        // Arguments are actual!


    }
}
