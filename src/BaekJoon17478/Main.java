package BaekJoon17478;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static String line2 ="";

    //psv tab
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input  = Integer.parseInt(br.readLine());

        System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
        jongseon(input);

    }

    //재귀함수 정의
    static void jongseon(int num){

        String line = line2;

        //횟수 마무리 할 때에 출력되는 부분!
        if(num == 0 ) {

            System.out.println(line + "\"재귀함수가 뭔가요?\"");
            System.out.println(line + "\"재귀함수는 자기 자신을 호출하는 함수라네");
            System.out.println(line + "라고 답변하였지.");
            return;
        }


        // 0이 되기 전까지는 재귀 반복 시키기
        System.out.println(line + "\"재귀함수가 뭔가요?\"");
        System.out.println(line + "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");
        System.out.println(line + "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
        System.out.println(line + "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");

        // 재귀를 들어가기 전에 빈칸 사이즈를 늘려준다.

        line2 += "____";

        jongseon(num - 1);

        System.out.println(line + "라고 답변하였지.");

    }
}




