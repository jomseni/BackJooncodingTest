package BaekJoon1436;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int count = 1;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int number = 666;

        //반복시키면서 666이 들어갈때 마다 count 하고 count 출력!
        while(n != count){
            number++;
            //666숫자를 문자열 형으로 변환시킨다.
            if(String.valueOf(number).contains("666")){
                count++;
            }
        }
        System.out.println(number);
    }
}
