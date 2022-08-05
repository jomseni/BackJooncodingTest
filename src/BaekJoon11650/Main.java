package BaekJoon11650;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        //키보드 입력값을 정수값으로 바꿔 입력값을 받는다.
        int input = Integer.parseInt(bf.readLine());

        //연속적인 문자열 만들기!
        StringBuilder sb = new StringBuilder();

        //점의 위치 x와 y가 주어 진다. 따라서 2원 배열을 생성 및 초기화 한다! 행렬의 크기는 input값과 같다!

        int[][] arrays = new int[input][2];

        //반복문을 통해 행렬 인덱스에 숫자를 대입한다!
        for(int i=0; i < arrays.length; i++) {                          //행을 만든다

            //한줄에 있는 입력이 숫자 띄어쓰기를 포함한 숫자이므로 StringTokenizer 사용, 하나씩 분할하는것
                StringTokenizer st = new StringTokenizer(bf.readLine());
                arrays[i][0] = Integer.parseInt(st.nextToken());        //인덱스 위치에 숫자를 하나씩 넣는다 i행 0열
                arrays[i][1] = Integer.parseInt(st.nextToken());        // i행 1열에 숫자 입력!
        }

        //만들어진 2차원 배열을 오름 차순 정리!!!!!!!!!!
        Arrays.sort(arrays, new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2){
                if(o1[0] == o2[0]){
                    return o1[1]-o2[1];
                }
                else{
                    return o1[0]-o2[0];
                }
            }
        });

        //2차원 배열을 출력하는 방법!
        for(int i =0; i<arrays.length;i++){
            sb.append(arrays[i][0]).append(" ").append(arrays[i][1]).append('\n');
        }
        System.out.println(sb);
    }
}
