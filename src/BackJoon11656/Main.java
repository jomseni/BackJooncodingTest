package BackJoon11656;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {

        //키보드 입력받을 수 있게 bufferedReader생성자를 이용해 받기!
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        //출력을 위한 생성자 만들기!

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //키보드 입력받은 값을 문자열로 저장한다.
        String s = bf.readLine();

        //문자열의 크기만큼을 크기로 하는 배열 result 생성
        String[] result = new String[s.length()];

        //반복문을 통해 배열 인덱스 순서대로 저장한다!
        for(int i =0; i<s.length(); i++){
            result[i] = s.substring(i,s.length()); //(i)
        }

        //오름차순 정렬하기!
        Arrays.sort(result);

        for(String str : result){
            bw.write(str);
            bw.write('\n');
        }

        bw.flush();
    }
}
