package BaekJoon10845;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] array;
    //인덱스의 초기값은 0으로 정한다!
    static int index = 0;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        //명령의 수 최대 개수 배열 만들기!
        array = new int[10001];

        //몇번의 명령을 할 지 숫자를 정한다!
        int input = Integer.parseInt(br.readLine());

        //반복문을 통해 명령문 반복시킨다!
        for(int i = 0; i < input; i++){
            //띄어쓰기 기준으로 나눈다 스트링토크나이저를 통해!
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            //앞 문자를 문자열 s로 저장한다
            String s = st.nextToken();

            String[] res = new String[2];

            res[0] = s;

            switch(s){
                case "push":
                    int k = Integer.parseInt(st.nextToken());
                    push(k);
                    break;
                case "front":
                    sb.append(front()).append('\n');
                    break;
                case "back":
                    sb.append(back()).append('\n');
                    break;
                case "empty":
                    sb.append(empty()).append('\n');
                    break;
                case "pop":
                    sb.append(pop()).append('\n');
                    break;
                case "size":
                    sb.append(size()).append('\n');
                    break;
            }
        }
        System.out.println(sb);
    }

    //push메서드 정의
    static void push(int k){
        array[index] = k;
        index++;
    }
    //front 메서드 정의
    static int front(){
        if(empty() == 1){
            return -1;
        }
        else{
            return array[0];
        }

    }
    //back 메서드 정의
    static int back(){
        if(empty() == 1){
            return -1;
        }
        else{
            return array[index-1];
        }
    }
    //size 메서드 정의
    static int size(){
        return index;
    }
    //empty 메서드 정의
    static int empty(){
        if(index == 0){
            return 1;       //큐가 비어있다면 1을 출력한다!
        }
        else return 0;      //큐가 비어있지 않으면 0을 출력한다
    }
    //pop 메서드 정의
    static int pop(){
        if(empty() == 1){
            return -1;
        }
        else{
            int tmp = array[0];

            for(int i = 0; i < index-1; i++){
                array[i] = array[i+1];

            }
            array[index - 1] = 0;
            index--;
            return tmp;
        }
    }
}
