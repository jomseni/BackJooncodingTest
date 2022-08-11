package BaekJoon2480;

import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //띄어쓰기 기준으로 토큰을 하나 씩 나누어 입력을 받는다
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        //숫자 세개 변수 선언 ( 입력받는 순서대로 )
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        //(조건연산자)경우의 수 나눠서 출력하기!
        // 세 숫자 모두 같을 경우!
        if(a==b && b==c && a==c){
            System.out.println(10000 + a*1000);
        }
        //세 숫자 중 두 숫자(a==b or a==c)가 같을 경우!
        else if (a == b || a == c ) {
            System.out.println(1000+(a*100));
        }
        //두 숫자 b=c 일경우
        else if(b==c){
            System.out.println(1000+(b*100));
        }
        // 모두 다를 경우!
        else
            System.out.println((Math.max(a,Math.max(b,c))));
    }
}
