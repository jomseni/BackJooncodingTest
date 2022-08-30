package BaekJoon10814;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        String[][] str = new String[N][2];

        for(int i=0; i < N; i++){

            StringTokenizer st = new StringTokenizer(br.readLine());

            //숫자로 입력을 받고 그 숫자값을 문자열로 변환시켜서 배열에 저장하는 소스!
            str[i][0] = String.valueOf(Integer.parseInt(st.nextToken()));
            str[i][1] = st.nextToken();
        }

        //기본적으로 오름차순이다 숫자는!
        //숫자와 문자열 섞였을떄 사용한다!
        //2차원 배열에서 오름 차순정렬시 사용! 람다식!
        Arrays.sort(str, (e1,e2)-> {
           if(e1[0] == e2[0]){
               //같을 경우 그대로 종료 return 0
               return 0;
           }else {
               return Integer.parseInt(e1[0]) - Integer.parseInt(e2[0]);
           }
        });



        for(int i=0; i < N; i++){
        sb.append(str[i][0] + " " +str[i][1]).append('\n');
        }

        System.out.println(sb);
    }
}
