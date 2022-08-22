package BaekJoon3009;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        int[] one = new int[2];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < 2; i++){
            one[i] = Integer.parseInt(st.nextToken());
        }

        int[] two = new int[2];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < 2; i++){
            two[i] = Integer.parseInt(st.nextToken());
        }

        int[] three = new int[2];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < 2; i++){
            three[i] = Integer.parseInt(st.nextToken());
        }

        //출력 할 점 구하기
        int x=0;
        int y = 0;

        //세 점 비교하여 x 값 찾기
        if(one[0] == two[0]) {
            x = three[0];
        }else if(one[0] == three[0]){
            x = two[0];
        }else if(two[0] == three[0]){
            x = one[0];
        }

        //세 점 비교하여 y 값 찾기
        if(one[1] == two[1]) {
            y = three[1];
        }else if(one[1] == three[1]){
            y = two[1];
        }else if(two[1] == three[1]){
            y = one[1];
        }
        System.out.println(x + " " +y);
    }
}
