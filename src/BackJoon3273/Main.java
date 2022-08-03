package BackJoon3273;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static int[] arrays;
    public static int X;
    public static int key;
    public static void main(String[] args) throws IOException {

        //키보드의 입력값으로 수열의 크기 구하기
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        //입력값이 개행없이 가로로 한줄 이며, BufferedReader로 키보드 값 받을 때 사용!
        StringTokenizer st;
        //수열의 크기가 될 숫자를 input 변수에 대입한다
        int input = Integer.parseInt(bf.readLine());

        //input값의 크기에 맞는 배열을 생성
        arrays = new int[input];

        //반복문을 통해서 배열에 입력값을 인덱스 0부터 넣어준다
        //숫자 하나하나 각각을 토큰이라고 생각함!!!!!
        st = new StringTokenizer(bf.readLine(), " ");

        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = Integer.parseInt(st.nextToken());
        }

        //자연수 X의 값을 받기
        X = Integer.parseInt(bf.readLine());

        ///////////////////여기까지가 입력받기//////////////////////////

        ////////////////////문제풀이 알고리즘////////////////////////////
        ////10만이상이면 n^2(이 중 for문)는 시간 복잡도에 걸림////
        // 정렬 시키고 첫 값, 끝 값 이용 가능 할 것으로 보여 이분 탐색으로 풀어볼 것이다!//


        //이분 탐색을 이용할 것 이므로 오름차순정렬해준다
        Arrays.sort(arrays);

        System.out.println(Arrays.toString(arrays));

        int count = 0;

        //반복문을 통한 이분탐색 후 출력
        for(int i = 0; i < arrays.length; i++){

            if(binarySearch(arrays[i]) > 0){
                count++;
            }
        }
        System.out.print(count/2);

    }


    //이분 탐색을 위한 메서드 정의!
    public static int binarySearch(int array2){
        int low = 0;
        int high = arrays.length - 1;
//        9 = 1 + num
        key = X - array2;
        while(low <= high) {
            int mid = (low+high) / 2 ;

            if(arrays[mid] == key){
                return 1;
            }
            else if(arrays[mid] < key){
                low = mid + 1;
            }
            else
                high = mid - 1;
        }
        return -1;
    }
}
