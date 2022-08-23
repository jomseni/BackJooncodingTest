package BaekJoon4153;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int a = -1, b = -1, c = -1;
    public static void main(String[] args) throws IOException {
//        System.setIn(new FileInputStream("codingTest/src/BaekJoon4153/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while(true) {

            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());

            if(a == 0 && b == 0 && c == 0){
                break;
            }

            //피타고라스 식을 이용하여 구하기
            if((a * a) + ( b * b) == c * c )
            {
                System.out.println("right");
            }
            else if((b*b) + (c*c) == a * a )
            {
                System.out.println("right");
            }
            else if((a*a) + (c*c) == b*b) {
                System.out.println("right");
            }
            else
                System.out.println("wrong");
        }
    }
}
