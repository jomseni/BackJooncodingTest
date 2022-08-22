package BaekJoon2798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    //int 범위 때문에 넣어줌! int 의 범위는 약 -21 억 부터 21억까지
    static int max = 0;
    static List<Integer> integerList;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        //한줄에 받는 것 (첫 번째 입력 줄)
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int input = Integer.parseInt(st.nextToken());
        int sum = Integer.parseInt(st.nextToken());
        int[] array = new int[input];
        integerList = new ArrayList<>(); //ArrayList는 동적 배열!
        //동적 배열이란 ! 요소를 넣으면 자동적으로 늘어난다 공간이!

        //두번쨰 입력 줄
        st = new StringTokenizer(br.readLine()," ");

        //입력값 배열로 만들기
        for(int i=0; i < input; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }

        //배열 내의 값 세개를 더할 것이 므로 3중 for문 사용한다.
        for(int i=0; i < input; i++){
            for(int j=i+1; j < input; j++){
                for(int k=j+1; k < input; k++){
                    if(array[i] + array[j] + array[k] <= sum){
                        int hap = array[i] + array[j] + array[k];
                        integerList.add(hap);
                        if(max <= hap) max = hap;

                        // max = Math.max(max, hap);
                    }
                }
            }
        }
//        for(int i : integerList) System.out.print(i + " ");
//        System.out.println();
        System.out.println(max);
    }
}
