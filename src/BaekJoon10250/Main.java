package BaekJoon10250;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    //층 변수 선언
    static int F;
    //순서 변수 선언
    static int N;
    //한 층의 방의 갯수 변수 선언
    static int R;
    //최종 방 호수의 변수!
    static int output;

    public static void main(String[] args) throws IOException {

        //키보드 값을 입력받게 해주는 생성자를 생성한다
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        //테스트 캐이스의 갯수를 입력받는다! (input)
        int input = Integer.parseInt(bf.readLine());

        //출력을 여러번하는 것이므로 Stringbuilder를 사용한다.
        StringBuilder sb = new StringBuilder();


        //반복 문을 통해서 출력해준다
        for(int i =0; i < input; i++) {

            StringTokenizer st = new StringTokenizer(bf.readLine());

            //입력값의 맨처음 값을 N(들어오는 순서를 입력값으로받는다)
            F = Integer.parseInt(st.nextToken());
            //가운데 층 당 방 갯수는 의미가 없으므로 그냥 변수로 받지는 않는다
            st.nextToken();
            //입력값 세번째 숫자는 층의 갯수를 뜻하는 변수로 선언한다
            N = Integer.parseInt(st.nextToken());


            if( N % F == 0){
                sb.append((F*100) + ( N/ F)).append('\n');
            }
            else {
                sb.append((( N % F) * 100)+ ((N / F) + 1)).append('\n');
            }


            }
        System.out.print(sb);
        }
            //테스트 케이스 만큼 출력을 반복적으로 해야하기 때문에 StringBuilder 을 사용하여
            // 출력할 문자열들을 하나로 묶어주고, 마지막에 한 번에 출력하도록 변경했다.
    }

