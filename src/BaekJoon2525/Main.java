package BaekJoon2525;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int hour;
    static int minute;
    static int n;
    public static void main(String[] args) throws IOException {


        //BufferedReader를 사용하기 위한 생성자
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        //개행이 안되고 띄어쓰기 공백을 통한 입력이 있을 때 사용한다!
        StringTokenizer st;

        //출력에 공백이 있고 print를 여러번 사용하는 느낌이기에 StringBuilder를 사용한다.
        StringBuilder sb = new StringBuilder();

        //입력값을 공백을 주면서 토큰을 나누게 하기 위한 행
        st = new StringTokenizer(bf.readLine()," ");

        //입력받은 값을 인덱스 0은 시를 인덱스 1은 분을 표현할 수있게 변수에 대입한다.
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());

        //추가 할 분을 입력 받는다.
        int addtime = Integer.parseInt(bf.readLine());

        //분을 추가 했을 때 시간이 잘 추가되게 적용한다.
        if(minute + addtime >= 60) {
            hour += (minute + addtime) / 60 ;
            minute = (minute+addtime) % 60;
            if(hour >= 24){
                hour = hour - 24;
            }
        }
        else if(minute + addtime < 60){
            minute = minute + addtime;
        }

        sb.append(hour).append(" ").append(minute);
        System.out.println(sb);

    }
}
