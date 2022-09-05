package BaekJoon5086;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        String f = "factor";
        String mul = "multiple";
        //입력 반복하는 횟수가 딱히 정해져 있지 않으므로 while문을 사용한다.
        String nei = "neither";
        while(true){

            //숫자 입력값 받기
            StringTokenizer st = new StringTokenizer(br.readLine()," ");

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            //while문은 종료하는 부분을 잘 정해줘야한다!
            //입력값이 0과 0이 들어오면 반복문 종료한다!
            if(n == 0 && m == 0) break;

            //첫 번째 숫자가 두번째 숫자의 약수일 경우 factor 출력!
            else if (n % m == 0){
                sb.append(mul + '\n');
            }

            //첫 번째 숫자가 두번째 숫자의 배수라면 multiple 출력!
            else if(m % n ==0){
                sb.append(f + '\n');
            }
            //두 경우가 모두 아니라면 neither를 출력!
            else
                sb.append(nei + '\n');

        }
        System.out.println(sb);

    }
}
