package com.mypack;

public class Pattern {
    public static void main(String[] args) {
        for(int i=0; i<=9; i++){
            for(int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        for(int k=10; k>0; k--){
            for(int l=k; l>0; l--){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
