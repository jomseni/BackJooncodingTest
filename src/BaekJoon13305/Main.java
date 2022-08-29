package BaekJoon13305;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        //도시의 갯수 입력 받기
        int N = Integer.parseInt(br.readLine());

        long[] km = new long[N-1]; //길이를 나타낼 배열 생성(도시의 길이 -1 만큼의 갯수를 생성
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i = 0; i < N-1; i++){
            km[i] = Integer.parseInt(st.nextToken());
        }

        //누적 최소 비용
        long sum = 0;

        //도시의 기름값 출력
        long[] price = new long[N];
        st = new StringTokenizer(br.readLine());
        for(int i =0; i < N; i++){
            price[i] = Integer.parseInt(st.nextToken());
        }

        long minPrice = price[0];  //최소 기름 값


        //범위를 잘 사용 해야한다 마지막 L당 가격은 사용하지 않으므로 범위에서 잘 빼서 사용해야 한다!!
        for(int i = 0; i < N-1; i++){
            if(price[i] < minPrice){
                minPrice = price[i];
            }
            sum += minPrice * km[i];
        }
        System.out.println(sum);

    }
}
