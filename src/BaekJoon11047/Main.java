package BaekJoon11047;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());           //동전 종류의 갯수 받기
        int k = Integer.parseInt(st.nextToken());           //동전 가치의 합

        int[] array = new int[n];

        for(int i = 0; i < n; i++){
            array[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;

        //주어진 돈에서 큰 값부터 탐색하면서 counting 하는 것!
        for(int i = n - 1; i >= 0; i--){
            if(array[i] <= k){
                 count  += k / array[i];
                 k = k % array[i];
            }
        }
        sb.append(count);
        System.out.println(sb);
    }
}
