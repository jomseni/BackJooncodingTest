import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;

public class BackJoon3052 {
    public static void main(String[] args) throws IOException {
//      Scanner는 처리시간이 느리므로 이제 BufferedReader을 사용할 것이다!
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int  a[] = new int[10];
        int count = 0;


//        키보드로 입력받은 값을 42로 나누어서 나머지를 배열 a에 저장시킨다!인덱스별로!
        for(int i=0; i<a.length; i++){
            a[i] = Integer.parseInt(bf.readLine()) % 42;
        }

//        a에 저장되어있는 요소 중복 제거 하기
//        맨앞에 나머지 숫자부터 뒤 숫자와 비교 후에 모두 다르다면 카운트 하나 씩 증가시키는 방법
        for(int i=0; i<a.length; i++){
            int select = 0;
            for(int k = i+1; k<a.length; k++){
                if(a[i] == a[k]){
                    select += select +1;
                    break; //for문 빠져나가기
                }
            }
//            만약 뒤 숫자들과 모두 다를경우 카운트 +1
            if(select ==0){
                count++;
            }
        }
        System.out.println(count);


    }
}

//3052번 에서 HashSet과 LinkedHashSet의 개념을 공부 해볼 수 있다!
