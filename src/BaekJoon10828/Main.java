package BaekJoon10828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    //array는 스택의 배열!
    static int[] array;
    static int index = 0;
    public static void main(String[] args) throws IOException {

        //키보드 입력값을 받기위해 사용하는 생성자
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        //스택 배열의 최대 갯수 지정
        array = new int[10001];

        StringBuilder sb = new StringBuilder();

        //명령의 갯수를 받기 ( 문자를 정수로 바꿔서 받기)
        int input = Integer.parseInt(br.readLine());



        for(int i  = 0; i < input; i++){
            //StringTokenizer를 이용해  입력받은 한 줄 문자열을 " " 기준으로 나눈다 , push 숫자를 따로받기위해
            StringTokenizer st = new StringTokenizer(br.readLine()," ");

            //앞 문자열 => s "" 기준으로 앞 토큰
            String s = st.nextToken();

            String[] res = new String[2];

            res[0] = s;

            switch(s){
                case "push":
                    //문자열 "" 기준 뒤에 숫자를 문자열로 받아서 정수로 바꾼다
                    int k = Integer.parseInt(st.nextToken()); //이부분중요
                    push(k);
                    break;
                case "pop":
                    sb.append(pop()).append('\n');
                    break;
                case "size":
                    sb.append(size()).append('\n');
                    break;
                case "empty":
                    sb.append(empty()).append('\n');
                    break;
                case "top":
                    sb.append(top()).append('\n');
                    break;
            }
        }
        System.out.println(sb);
    }


    //push 메서드 정의
    static void push(int k){
        array[index] = k;
        index++;
    }
    //top 메서드 정의
    static int top(){
        if(empty() == 1){
            return - 1;
        }
        else
            return array[index-1];
    }
    //size 메서드 정의
    static int size(){
        return index;
    }
    //empty 메서드 정의
    static int empty(){
        if(index == 0){    /////////// 이부분틀림ㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁ!!!!!
            return 1;
        }
        else return 0;
    }
    //pop 메서드 정의
    static int pop(){
        if(empty() == 1) return -1;
        else
        {
            index--;
            return array[index]; ///////이부분틀림ㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁ!!!!!
        }
    }
}
