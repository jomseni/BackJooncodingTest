package BaekJoon10926;

import BackJoon11656.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static String s;
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String s = String.valueOf(bf.readLine());

        //문자열 연속 출력
        StringBuilder sb = new StringBuilder();

        sb.append(s).append("??!");
        System.out.println(sb);
    }
}
