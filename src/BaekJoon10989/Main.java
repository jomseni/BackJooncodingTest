package BaekJoon10989;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        //숫자 갯수 키보드값 입력받기
        int input = Integer.parseInt(br.readLine());

        int[] array = new int[input];

        for(int i =0; i < input; i++){
            array[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(array);

        for(int i =0 ; i< array.length; i++) {
            sb.append(array[i]).append('\n');
        }

        System.out.println(sb);
    }
}
