package BaekJoon7568;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    //rank를 만들어 주기위한 변수 선언
    static int rank;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        //키보드 입력값은 기본적으로 문자이므로 한줄에 있는 문자를 숫자로 변형해준다
        //사람 수 입력 받기
        int input = Integer.parseInt(br.readLine());

        //연속 출력 할 것이므로 StringBuilder를 사용한다.
        StringBuilder sb = new StringBuilder();

        //2차원 배열 만들어주기! (각 사람의 몸무게와 키를 저장할 배열)
        // 1. 배열 생성 (input의 값의 행 갯수와 2열 짜리 만들기)
        int[][] array = new int[input][2];

        //for문을 통해 입력값 받아서 배열에 저장하기!
        for(int i=0; i< input; i++){
            //빈공간 기준으로 몸무게와 키입력값을 반복문 안에서 개행 될때마다 받으므로
            // 여기에 stringTokenizer 작성해준다(한줄에 있는 공백 기준으로 다른 토큰!
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            array[i][0] = Integer.parseInt(st.nextToken());
            array[i][1] = Integer.parseInt(st.nextToken());
        }

        for(int i= 0; i < input; i++){
            int rank = 1;
            for(int j=0; j < input; j++){
                if(i == j) continue;
                if(array[i][0] < array[j][0] && array[i][1] < array[j][1]){
                    rank++;
                }
            }
            sb.append(rank+" ");
        }
        System.out.println(sb);
    }
}
