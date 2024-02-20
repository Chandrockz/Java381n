package com.company;

public class Vid28_MultiDimensional_Arrays {
    public static void main(String[] args) {
/*      Multi-Dimensional Arrays is an Array of Arrays.
        Each element of a Multi-Dimensional array is an array itself.
        int[] marks ;         ------> 1-D Array
        int[][] elevator;     ------> 2-D Array
        elevator = new int[0][3]    (Elevator starts from zero)
*/
        int[][] flats;          //Houses from zeroth floor
        flats = new int[2][3]; //2 rows and 3 columns

        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;

        for (int i=0; i< flats.length; i++) {
            for (int j = 0; j <= flats.length; j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }

    }
}
