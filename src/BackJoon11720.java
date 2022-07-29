import java.util.Scanner;

public class BackJoon11720{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        //나열할 숫자의 수를 입력 받고 엔터누르면 개행까지 완료
        int input = sc.nextInt();

        //정수가 아닌 String(문자열)로 입력 받는다(숫자의 범위가 int,double등의 범위가 아니므로)
        //예제 입력이 숫자가 공백이 없이 붙어 있으므로 떨어진 숫자가 아니라 하나의 숫자로 봐야하므로
        //int를 사용하지못함 (범위가 넘어가므로)
        String a = sc.next();

        //각자리의 숫자의 합을 구하기 위해 sum변수  초기화
        int sum = 0;

        //작성되어진 숫자들을 합하는 식
        for(int i = 0; i<input; i++){
                sum += a.charAt(i)-48; //48 or ASCII 코드 '0' 값을 빼준다 , 예를들면 ASCII코드 '7'은 55, '0'은 48
        }
        System.out.print(sum);
    }
}

