package BaekJoon2609;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class Main {
    static int gcd;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        //최대 공약수와 최소공배수 두가지를 연속 출력하기위해서 StringBuilder를 사용한다
        StringBuilder sb = new StringBuilder();


        //최대공약수를 변수 gcd에 저장한다
        gcd = GCD(n,m);
        //sb를 이용해 저장한다
        sb.append(gcd).append('\n');

        //최소공배수를 변수 lcm에 저장한다
        int lcm = LCM(n,m);
        sb.append(lcm);

        System.out.println(sb);

    }


    //최대 공약수 구하기(유클리드 호제법을 이용하여!) 메서드 생성!
    private static int GCD(int n, int m){
        if(n < m){
            int temp = n;
            n = m;
            m = temp;
        }
        while(m != 0){
            int r = n % m;
            n = m;
            m = r;
        }
        return n;
    }

    //최소공배수 구하기 두 수의 곱 / 최대공약수(gcd)
    //gcd를 타 메서드에서 그대로 가져오므로
    //클래스 전체에서 사용하는 변수 static int gcd로 변수 선언해서 사용한다.
    static int LCM(int n , int m){
        return (n * m) / gcd;
    }
}
