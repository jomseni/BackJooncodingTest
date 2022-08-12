package BaekJoon18258;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        //n번째를 구하기위해 n에 대한 숫자를 입력받는다
        int input = Integer.parseInt(br.readLine());

        System.out.println(fibonacci(input));

    }

    //파라미터 int 형 input이 num으로 던져진다!
    static int fibonacci(int num) {


            return fibonacci(num-1) + fibonacci(num-2);

    }
}
