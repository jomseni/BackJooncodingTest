package BaekJoon1427;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        //입력값 숫자로 받기
        int input = Integer.parseInt(br.readLine());
        // 받은 숫자를 문자열로 형 변환 시키기
        String s = Integer.toString(input);
        //내림차순 정렬하기

        String[] ss = s.split("");

        Arrays.sort(ss,Collections.reverseOrder());

        for(int i = 0 ; i < s.length(); i++) {
            System.out.print(ss[i]);
        }
    }
}
