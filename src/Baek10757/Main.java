package Baek10757;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        //한줄을 띄어쓰기 기준으로 나눠서 받음
        StringTokenizer st = new StringTokenizer(bf.readLine());

        //띄어쓰기 기준 토큰 앞뒤로 나눠 입력받기 , 한칸씩나눈거~

        //(String 자체가 배열 이므로 배열에 따로 안넣어도 사용가능)
        String first = st.nextToken();
        String last = st.nextToken();

    }
}
