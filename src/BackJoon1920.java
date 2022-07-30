import java.util.Arrays;
import java.util.Scanner;

import static java.util.Collections.binarySearch;

public class BackJoon1920 {
    public static void main(String[] args){

        //키보드 입력값을 받기 위한 생성자 생성
        Scanner sc = new Scanner(System.in);

        //첫째 줄 자연수 N 키보드 입력값 받기
        int inputN = sc.nextInt();
        //inputN 개 만큼의 정수를 배열을 생성 및 초기화한다!(정수 A의 배열)
        int[] array1 = new int[inputN];
        //반복문을 통한 인덱스 순으로 arr1 배열에 숫자 저장
        for(int i =0; i<array1.length; i++){
            array1[i] = sc.nextInt();
        }

        //이분탐색에서 반드시 배열은 반드시 정렬 되어있어야한다! 매우중요한부분!!!!!!!찾아야하는 배열만 정렬 하면 된다.
        Arrays.sort(array1);

        //자연수 M값을 키보드 값 입력받기
        int inputM = sc.nextInt();

        // M의 숫자들을 배열
        int[] array2 = new int[inputM];

        //반복문을 통한 M의 숫자들을 array2 배열에 저장한다!순차적으로!
        for(int i=0;  i<array2.length; i++){
            array2[i] = sc.nextInt();
        }

        //출력하기 (key값이 array1에 포함되어 있으면 1을 출력하고 그렇지 않으면 0 을 출력한다 개행하면서!)
        for(int i=0; i<array2.length; i++) {
            System.out.println(binarySearch(array1, array2[i]));
        }
    }

        //이진 탐색 함수 정의하기
        public static int binarySearch(int[] array1, int num){     //파라미터 하나는 찾아볼 배열의 이름 , 두번 쨰는 두번째 배열에서의 숫자에서의 값!
            int low=0;                                          //탐색범위의 가장 낮은 인덱스
            int high = array1.length-1;                          //탐색범위의 가장 높은 인덱스스
//            int mid = (low+high) / 2 ;                                      //탐색범위에서의 중간 값!

            //반복문을 통해 이진 탐색하여 값을 비교하며 찾는다!  정확한 횟수를 모르고 찾을 때까지 순환하므로  while 반복문을 사용한다
            while(low <= high){
                int mid = (low+high) / 2 ;
                //key값이 중간값 보다 오른쪽에 있을때!
                if(array1[mid] < num){
                    low= mid + 1;
                }
                //key값이 중간값 보다 왼쪽에 있을 때!
                else if (array1[mid] > num) {
                    high = mid - 1 ;
                }
                //key값과 중간값이 같을 때!
                else
                    return 1; //반복문 빠져 나가면서 1값을 반환한다
            }
            //반복문을 돌리다가 결국엔 반복문 조건안에서 key값과 중간값이 같을 때를 찾지 못하였을 때 반복문 탈출 후에 반환값 0을 반환한다.
            return 0;
        }
}


//세가지 방법이 있다.
//1. Scanner 2. BufferedReader 3. BufferedReader + Arrays.binarySerach()
//시간은 (짧은순 ) --> 3 , 2, 1
//이분탐색문제 풀이과정!--> 1. 중간 인덱스를 구한다! 2. 중간값과 key값(우리가 리스트에서 찾으려는 값)을 비교한다. 3.비교값에 따라 범위를 왼쪽,오른쪽 혹은 값이 같은경우는 해당 인덱스를 반환한다.
//우선은 Scanner를 이용한 풀이!