package BaekJoon1003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon1003 {
    //초기 값!
    //0이 출력되는 횟수
    static int zero;
    //1이 출력되는 횟수
    static int one;
    //zero + one을 합친 숫자
    static int tmp;

    public static void main(String[] args) throws IOException {
        //키보드 입력값을 받기 위한 생성자 생성
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        //테스트 케이스의 수를 받음
        int count = Integer.parseInt(bf.readLine());

        //print를 여러번 사용할 때에 사용한다.
        StringBuilder sb = new StringBuilder();


        for( int i =0; i < count; i++){
            int testcase = Integer.parseInt(bf.readLine());
            fibonacci(testcase);
            sb.append(zero).append(" ").append(one).append('\n');
        }
        System.out.println(sb);
    }

    //fibonacci 메서드 정의!!
    public static void fibonacci(int num){

        //첫번째 항이며, f(0)이며 출력 시 1,0로 생각
        zero = 1;
        //두번째 항이며, f(1)이며 출력 시 0,1로 생각
        one = 0;
        //세번째 항이며 , f(0) + f(1) 이다
        tmp = 1;

        for(int i = 0; i < num; i++){
            zero = one;
            one  = tmp;
            tmp  = zero + one;
        }
    }
}
