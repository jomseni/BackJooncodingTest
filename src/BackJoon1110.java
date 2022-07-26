import java.util.Scanner;

public class BackJoon1110 {

        public static void main(String[] args){
//        변수생성!
            int count = 0;
//        Scanner 생성자를 통한 입력값 받기
            Scanner sc = new Scanner(System.in);
//        입력받은 값을 정수형 숫자로 바꿔준다!
            int A = sc.nextInt();
            int B = A;
//       횟수가 정확히 정해져있지 않으므로 while문을 사용한다!
            while(true){
                //        A의 값을 십의자리와 일의 자리를 더한다.
                A = (A%10*10)+((A/10 + A%10)%10);   //입력받은 수의 1의자리와 10의 자리를 더해서 나온값의 1의자리
                count++;
                if(B == A){
                    break;
                }

            }

            System.out.println(count);


        }
    }


