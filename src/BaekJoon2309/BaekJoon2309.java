package BaekJoon2309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.Arrays;

public class BaekJoon2309 {
    static int num;

    //100초과 숫자
    static int X;
    public static void main(String[] args) throws IOException {

        //키보드 입력값 받기 위함
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        //정수형 배열 생성, 9명이니깐 크기가 9인 배열 생성
        int[] array1 = new int[9];

        //숫자 입력 순서로 배열에 인덱스 순으로넣기 (반복문이용)
        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            num = Integer.parseInt(bf.readLine());
            array1[i] = num;
        }

        for(int i =0; i < array1.length; i++){
            sum += array1[i];
        }
        Arrays.sort(array1);

        int X = sum - 100;
        int count = 0;
        int number1 = 0;
        int number2 = 0;

        for(int i =0; i<array1.length; i++){
            if(count == 1)
                break;
            for(int j=1; j<array1.length; j++){
                if(array1[i] + array1[j] == X){
                    number1 = i;
                    number2 = j;
                    count++;
                    break;
                }
            }
        }
        for(int i=0; i<array1.length; i++){
            if(i != number1 && i != number2){
                System.out.println(array1[i]);
            }
        }

    }
}
