package BaekJoon25305;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st  = new StringTokenizer(br.readLine(), " ");

        int input = Integer.parseInt(st.nextToken());
        int input2 = Integer.parseInt(st.nextToken());

        int[] score = new int[input];


        //개행 후 입력값 받는거 다시 st 초기화 해줘야함!!!!!
        st  = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i < input; i++) {
            score[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(score);
        System.out.println(score[input-input2]);

    }
}
