package BaekJoon11399;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[] time = new int[N];


        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i = 0; i < N; i++){
            time[i] = Integer.parseInt(st.nextToken());
        }

        //시간이 적게 걸리는 사람부터 더하면 그값이 최소값이 되므로  배열을 오름차순 정렬하고 요소들을 순서대로  더한다
        Arrays.sort(time);

        int time_hap = 0;

        for(int i=0; i < N; i++){
            time_hap += time[i];
        }
        sb.append(time_hap);
        System.out.println(sb);
    }
}
