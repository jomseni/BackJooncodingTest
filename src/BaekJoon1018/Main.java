package BaekJoon1018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static boolean[][] array;
    static int min = 64;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int input1 = Integer.parseInt(st.nextToken());
        int input2 = Integer.parseInt(st.nextToken());

        array = new boolean[input1][input2];
        for (int i = 0; i < input1; i++) {

            String str = br.readLine();

            for (int j = 0; j < input2; j++) {
                if (str.charAt(j) == 'W') {
                    array[i][j] = true;
                } else {
                    array[i][j] = false;
                }
            }
        }

        int input1row = input1 - 7;
        int input2col = input2 - 7;

        for (int i = 0; i < input1row; i++) {
            for (int j = 0; j < input2col; j++) {
                jongseon(i, j);
            }
        }
        System.out.println(min);

    }

    static void jongseon(int x, int y) {
        int last_x = x + 8;
        int last_y = y + 8;
        int count = 0;


        //첫 번째 칸의 색 설정
        boolean sol = array[x][y];

        for (int i = x; i < last_x; i++) {
            for (int j = y; j < last_y; j++) {

                if (array[i][j] != sol) {
                    count++;
                }

                sol = !sol;
            }

            sol = !sol;

        }

        count = Math.min(count, 64 - count);

        min = Math.min(min, count);
    }
}
