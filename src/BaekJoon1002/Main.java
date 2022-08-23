package BaekJoon1002;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        //연속적 출력이므로 sb 사용한다
        StringBuilder sb = new StringBuilder();

        //테스트 케이스의 개수 T 입력 받기
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());

            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            sb.append(distance(x1,y1,r1,x2,y2,r2)).append('\n');
        }
        System.out.println(sb);

    }

    //return 값을 받기 위하여 int 값을 반환하는 메서드를 수행한다!
    //이 메서드는 중점사이의 거리와 반지름의 합을 계산하는 식을 정의한다.
    public static int distance(int x1, int y1, int r1, int x2, int y2, int r2) {

        //두 원의 중점 사이거리 구하기
        int distance_center = (int) (Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2));

        //원의 접점이 생기는 경우의 수 네 가지로 나누기!
        // 두 원이 완전히 겹칠 경우 return -1 한다
        if(x1 == x2 && y1 == y2 && r1 == r2){
            return -1;
        }

        //두 원의 중심사이거리가 반지름의 길이의 합보다 클 때
        else if(distance_center > (int)Math.pow(r2 + r1,2)) {
            return 0;
        }

        //원이 안에 있는데 겹치지 않을 때
        else if(distance_center < (int)Math.pow(r1 - r2,2)){
            return 0;
        }

        //원이 내접해서 하나의 점을 겹칠 때
        else if(distance_center == (int)Math.pow(r1 - r2,2)){
            return 1;
        }

        //원이 외접해서 하나의 점을 만들 때
        else if(distance_center == (int)Math.pow(r2 + r1,2)){
            return 1;
        }
        //
        else {
            return 2;
        }
    }
}
