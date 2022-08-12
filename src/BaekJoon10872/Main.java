package BaekJoon10872;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());

        System.out.println(factorial(input));
    }

    static int factorial(int num){
        if( num == 1) return 1;
        if( num == 0) return 1;

        //ex) input = 10 이라면 10 * (10-1) * ... * 1 이므로
        //input값 * num-1 파라미터를 가진 factorial 함수가 호출 되어야하므로
        //return 값을 아래와 같이 호출한다!
        return num * factorial(num-1);
    }
}
