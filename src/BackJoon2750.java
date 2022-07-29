import java.util.Scanner;

public class BackJoon2750 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);


//        //오름 차순 배열 할 숫자의 갯수를 입력값으로 받아온다.
        int num =sc.nextInt();

        //입력받은 숫자를 받아와 배열에 저장한다(갯수만큼)
        //num의 갯수 5를 입력하면 다섯개 만큼입력하면 그게 배열로 나열되어진다!
        int[] array = new int[num];

        for(int i =0; i<array.length;i++) {
            array[i]= sc.nextInt();
        }

        //       배열에 저장한 수를 오름 차순으로 정렬한다(반복문을 통해서!)
        //  선택정렬 비교되어 지는과정! 메모장이나 종이에 한번 써보기 순서대로!
        for(int i=0; i<array.length-1; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[i] > array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }

        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }

    }
}

//오름차순의 방법엔 선택정렬, Arrays.sort, 카운팅 정렬 3가지의 풀이 방법이 존재한다!
//이 방법들 모두 할 줄 알기!!!!!!!!나는 선택정렬 + Scanner를 이용한 풀이를 하였다!
