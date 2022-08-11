package BaekJoon3003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] perfect = {1,1,2,2,2,8};

        int[] mine = new int[6];


        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for(int i = 0; i < 6; i++){
            mine[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < mine.length ; i++){
            mine[i] = perfect[i] - mine[i];
            System.out.print(mine[i]+" ");
        }

    }
}
