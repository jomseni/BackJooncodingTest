package BaekJoon11651;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        여러개의 출력을 해야 하므로 StringBuilder를 사용한다
        StringBuilder sb = new StringBuilder();

        //점의 갯수 키보드 값 입력받기
        int N = Integer.parseInt(br.readLine());

        //x좌표와 y좌표를 받아야 하므로 2차원 배열 생성
        int[][] array = new int[N][2];


        //반복문을 통해 주어진 점의 갯수를 x좌표 y좌표로 받는다!
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            array[i][0] = Integer.parseInt(st.nextToken());
            array[i][1] = Integer.parseInt(st.nextToken());
        }

//        2차원 배열에서 정렬 사용하기위해 람다식 이용한다 2차원배열에선 Arrays.sort()로 배열을 정렬 할 수없어
//          람다식을 이용한 해결!
        Arrays.sort(array, (e1,e2) -> {

//           e 안의 인덱스는 열 기준이다! 1차원 배열이므로! 매우 중요 헷갈린부분!!!
            if(e1[1] == e2[1]){
                return e1[0] - e2[0];//이 값이 양수 이면 위치 바꾸기!
            }else{
                return e1[1] - e2[1];
            }

        });

        for(int i =0; i < N; i++){
            sb.append(array[i][0] + " " + array[i][1]).append('\n');
        }
        System.out.println(sb);
    }
}
