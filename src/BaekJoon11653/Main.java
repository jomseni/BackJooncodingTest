package BaekJoon11653;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//소인수분해란?
//소인수분해는 어떤 수를 소수인 인수로 분해하는 것이다.
//소수는 1과 자기 자신으로만 나누어 떨어지는 정수를 의미한다.


public class Main {
    public static void main(String[] args) throws IOException {

        //bf.readLine 키보드 입력값을 사용하기위한 생성자
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(bf.readLine());

        //소인수 분해 알고리즘 짜기
        //첫 번쨰 경우 솟수가 아닐경우
        //두 번쨰 경우  - 솟수일 경우

        for (int i = 2; i < n; i++) { //while문에서 n이 바뀌므로 for문 조건 n도 바뀐다! 모든 n이 바뀐다
            while(n % i == 0){
                sb.append(i).append('\n');
                n /= i;
            }
        }
        if(n != 1){
            sb.append(n);
        }
        System.out.println(sb);
    }
}
