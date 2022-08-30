package BaekJoon1181;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        //문자열을 연속 출력할 것이므로 StringBuilder를 사용한다
        StringBuilder sb = new StringBuilder();

        //문자열 갯수를 입력 키보드로 입력 받는다.
        int N  = Integer.parseInt(br.readLine());

        //문자열 배열을 생성해준다
        String[] str = new String[N];

        //반복문을 통해 한줄한줄 문자열을 배열에 저장한다
        for(int i = 0; i < N; i++){
            str[i] = br.readLine();
        }


        //해쉬셋을 이용해서  중복 값을 제거하기!
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(str));

        //중복제거를 한 배열을 새로 생성한다.
        String[] resultstr = hashSet.toArray(new String[0]);

        //그 배열을 사전순으로 정렬한다.
        Arrays.sort(resultstr);


        //사전순으로 정렬한 후 , 길이 순으로 정렬한다!
        Arrays.sort(resultstr, Comparator.comparing(String::length));

        //StringBuilder를 sb에 저장 후 사용 +  출력하기!
        for(int i =0; i< resultstr.length; i++) {
            sb.append(resultstr[i]).append('\n');
        }

        System.out.println(sb);
    }
}
