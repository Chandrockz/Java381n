package com.practice;

import java.util.Random;
import java.util.Scanner;

public class Vid20_RockPaperScissor {
    public static void main(String[] args) {
        Random ran = new Random();
        System.out.println("Computer chose a number. '0'- Rock, '1'- Scissor , '2'- Paper");
        int comp = ran.nextInt(3);
        System.out.println("comp chose - "+comp);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number from 0 to 2. '0'- Rock, '1'- Scissor, '2'- Paper");
        int chad = sc.nextInt(3);

        if (comp == chad ){
            System.out.println("DRAW!");
        }
        else if (chad < comp) {
            System.out.println(" Chandrakiran wins");
        }
        else if (comp < chad) {
            System.out.println("Computer Wins");
        }
    }
}
