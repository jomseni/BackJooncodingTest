package BaekJoon2231;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int k;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //숫자 입력받기
        int input = Integer.parseInt(br.readLine());

        //주어진 숫자 보다 작은 수에서 반복 시킨다
        for( int i = 1; i < input; i++) {

            int sum = 0;
            int num = i;

            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }

            if(input == sum + i) {
                    k = i;
                    break;
            }
        }

        System.out.println(k);
    }


}


