package BaekJoon2775;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    static int[][] number = new int[15][15];

    public static void main(String[] args) throws IOException{

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    //연속 출력이므로 StringBuilder 이용
        StringBuilder sb = new StringBuilder();

    //아파트 층 ,호 수 만들기!
        cel();

    //테스트 케이스 입력값(정수로) 받기
        int input = Integer.parseInt(bf.readLine());

    //층 ,호 수 입력값 받기
        for(int i = 0; i<input;i++){

        int k = Integer.parseInt(bf.readLine());

        int n = Integer.parseInt(bf.readLine());

        sb.append(number[k][n]).append('\n');
    }
        System.out.print(sb);
    }

    //계산하는 메서드 생성
    public static void cel() {

        //1층 출력
        for (int i = 0; i < 15; i++) {

            number[i][1] = 1;
            number[0][i] = i;
        }

        //2층 이상 출력 (열기준으로 생성)
            for (int i = 1; i < 15; i++) {
                for (int j = 2; j < 15; j++) {
                number[i][j] = number[i][j - 1] + number[i - 1][j];
                }
            }
        }
}



