package BaekJoon1934;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



        StringBuilder sb = new StringBuilder();

        //숫자 쌍 받을 수를  키보드 값 입력받는다
        int input = Integer.parseInt(br.readLine());

        //두 숫자 받을 입력값을 배열로 받기 위해 배열 생성
        int[] array = new int[2];
        for(int i=0; i < input; i++){
            //한줄의 공백 기준으로 토큰 나누기
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            array[i] = Integer.parseInt(st.nextToken());

        }


    }

}
