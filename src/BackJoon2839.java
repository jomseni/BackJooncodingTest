import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon2839 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int num =0;
        num = Integer.parseInt(bf.readLine());



//        둘 중 하나만 맞아도 true, 둘다 아니면 false 반환!
        if(num == 4 || num == 7){
            System.out.println(-1);
        }
        else if( num % 5 == 0){                 //5로 나눠서 떨어지면 그 나눴을때의 몫의 값이 최소 봉다리의 갯수!
            System.out.println(num/5);
        }
        else if((num % 5) == 1 || (num % 5)  == 3){
            System.out.println((num/5) +1);
        }
        else if (num % 5 == 2 || num % 5 == 4){
            System.out.println((num/5)+2);
        }
    }
}
