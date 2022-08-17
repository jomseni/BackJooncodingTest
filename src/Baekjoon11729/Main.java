package Baekjoon11729;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import javax.xml.bind.SchemaOutputResolver;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int count =0;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        //원판의 갯수
        int input = Integer.parseInt(br.readLine());


        hanoi(input,1,2,3);

    }

    //하노이 함수  매서드 정의 (재귀함수 이용)
    static void hanoi(int n, int start, int tmp, int end) {
        //탈출 조건 만들기  3 -> 2 -> 1-----> 출력!
         //출력 어디서 어디로 갔는지
        if(n == 1) {
            System.out.println(start + " " + end);
        } else{
            hanoi(n-1, start, end, tmp);

            System.out.println(start + " " + end);

            hanoi(n-1, tmp, start, end);
        }
    }
}
