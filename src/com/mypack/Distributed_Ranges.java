package com.mypack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.*;
import java.util.Arrays;
import java.util.Stack;

public class Distributed_Ranges {

    static int M = (int)1e9 + 7;

    public static void main(String[] args) throws java.lang.Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        try {
            int p = Integer.parseInt(br.readLine());
            int x = Integer.parseInt(br.readLine());

            int arr[][] = new int[p][x];
            int i = 0;
            while (i < p) {
                String str[] = br.readLine().split(" ");

                for (int j = 0; j < 2; j++) {
                    arr[i][j] = Integer.parseInt(str[j]);
                }
                i++;
            }

            int distinct_no_of_intervals = merge(arr);
            long a = modulo_power_(2, distinct_no_of_intervals);
            long b = 2;
            long ans = (a - b) % M;
            System.out.println(ans);
        } catch (Exception e) {
            System.out.println(e);
        }
        br.close();
        bw.close();
    }
    public static int merge(int[][] intervals){
        Arrays.sort(intervals
                ,(a, b)->{
            return a[0]-b[0];
        });
        Stack<int[]> st = new Stack<>();
        st.push(intervals[0]);

        for(int i=1; i< intervals.length; i++){
            if(st.peek()[1]<intervals[i][0]){
                st.push(intervals[i]);
            }
            else if (st.peek()[1]>=intervals[i][0]) {
                if (intervals[i][1]>st.peek()[1])
                    st.peek()[1] = intervals[i][1];
            }
        }
        return st.size();
    }

    public static long modulo_power_(long a, long b) {
        if (b == 0)
            return 1;
        long ans = 1;
        if((b&1)!=0)
            ans = a;
        ans*=modulo_power_((a*a)%M,b>>1)%M;
        return ans %M;
    }

}
