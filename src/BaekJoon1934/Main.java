package BaekJoon1934;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        //연속적인 출력값 받기위해서 StringBuilder를 사요한다
        StringBuilder sb = new StringBuilder();
        //테스트 케이스 수 입력값 받기
        int t = Integer.parseInt(br.readLine());

        StringTokenizer st;


        //테스트케이스 갯수만큼의 수를 입력받는다.
        for(int i=0; i < t; i++){
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int result = lcm(a,b);
            sb.append(result).append('\n');
        }
        System.out.println(sb);


    }

    //최대공약수 구하기!
    private static int GCD(int a, int b) {
        if(a < b) { //유클리드 호제법 조건
                int temp = a;
                a = b;
                b = temp;
        }
        while(b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    //최소공배수 구하는 방법!
    static int lcm(int a, int b) {
        return (a * b) / GCD(a,b);
    }

}
