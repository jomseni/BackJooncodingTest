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


        //내림 차순으로 구할때는 int[] 가 아닌 Intger[]  = new Integer를 사용해야한다.
        Integer[] score = new Integer[input];


        //개행 후 입력값 받는거 다시 st 초기화 해줘야함!!!!!
        st  = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i < input; i++) {
            score[i] = Integer.parseInt(st.nextToken());
        }


        //내림차순을 사용할 때 Collections.reverseOrder() 사용한다!
        Arrays.sort(score, Collections.reverseOrder());
        System.out.println(score[input2-1]);

    }
}
