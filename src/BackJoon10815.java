//문제 키워드 =>  이 수가 적혀있는 숫자 카드를 상근이가 가지고 있는지 아닌지를 구하는 프로그램을 작성하시오 => 이분탐색!

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BackJoon10815 {
    public static void main(String[] args) throws IOException {
        //키보드 입력값을 받아오기위한 생성자를 만들어준다.
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        //상근이의 카드 갯수의 입력값을 키보드로 받아온다
        int N = Integer.parseInt(bf.readLine());

        //받아오는 값들을 배열(inputN)에 저장한다.
        int[] inputN = new int[N];

        //반복문을 통해서 배열에 인덱스 0 부터 순차적으로 저장한다.
        st = new StringTokenizer(bf.readLine(), " ");
        for (int i = 0; i < inputN.length; i++) {
            inputN[i] = Integer.parseInt(st.nextToken());
        }

//        이분탐색할경우엔 배열이 무조건 오름차순 정렬이 되어있어야한다!
        Arrays.sort(inputN);

//        상근이의 카드와 비교되어질 카드의 갯수
        int M = Integer.parseInt(bf.readLine());

        int[] inputM = new int[M];

        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < inputM.length; i++) {
            inputM[i] = Integer.parseInt(st.nextToken());
        }

        for(int i =0; i<inputM.length; i++){
            System.out.print(binarySearch(inputN,inputM[i])+" ");
        }

    }

        public static int binarySearch(int[] inputN, int num){     //파라미터 하나는 찾아볼 배열의 이름 , 두번 쨰는 두번째 배열에서의 숫자에서의 값!
            int low=0;                                            //탐색범위의 가장 낮은 인덱스
            int high = inputN.length-1;                          //탐색범위의 가장 높은 인덱스스
//            int mid = (low+high) / 2 ;                                      //탐색범위에서의 중간 값!

//            //반복문을 통해 이진 탐색하여 값을 비교하며 찾는다!  정확한 횟수를 모르고 찾을 때까지 순환하므로  while 반복문을 사용한다
            while(low <= high){
                int mid = (low+high) / 2 ;
//                //key값이 중간값 보다 오른쪽에 있을때!
                if(inputN[mid] < num){
                    low= mid + 1;
                }
                //key값이 중간값 보다 왼쪽에 있을 때!
                else if (inputN[mid] > num) {
                    high = mid - 1 ;
                }
//                //key값과 중간값이 같을 때!
                else
                    return 1; //반복문 빠져 나가면서 1값을 반환한다
            }
//            //반복문을 돌리다가 결국엔 반복문 조건안에서 key값과 중간값이 같을 때를 찾지 못하였을 때 반복문 탈출 후에 반환값 0을 반환한다.
            return 0;
        }
}
