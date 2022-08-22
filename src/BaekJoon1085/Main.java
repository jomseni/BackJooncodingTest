package BaekJoon1085;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] array1 = new int[4];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i = 0; i < 4; i++){

            array1[i] = Integer.parseInt(st.nextToken());
        }

        int[] array2 = new int[4];

            array2[0] = array1[0];
            array2[1] = array1[1];
            array2[2] = array1[2] - array1[0];
            array2[3] = array1[3] - array1[1];

        Arrays.sort(array2);

        System.out.println(array2[0]);
    }
}
