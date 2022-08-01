import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BackJoon2751_BufferedReader {
    public static void main(String[] args) throws IOException {

        //키보드 입력값을 받아온다
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        //문자열 연결을 위한 StringBuilder을 사용한다
        StringBuilder sb = new StringBuilder();

        //테스트 케이스의 수를 입력받아온다 ( 줄 단위로==>bf.readLine() 이용! )
        int N = Integer.parseInt(bf.readLine());

        //배열을 선언 및 초기화하고, 테스트케이스의 숫자만큼을 배열에 저장한다.
        int[] arrays = new int[N];

        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = Integer.parseInt(bf.readLine());
        }

        //그 배열에 저장된것을 오름차순으로 정렬한다.
        Arrays.sort(arrays);

        for(int value : arrays){
            sb.append(value).append('\n');
        }

//      이게 배열이니깐 이런식으로 쓸거면 for문을 돌려서 arrays[i]를 증가시키면서 출력시켜야함
//        for(int i =0; i<arrays.length; i++){
//            System.out.println(arrays[i]);
//    }
//        System.out.println(arrays) 로 출력할 경우에는 값이나오는게 아니라 주소의 값이 나온다!인덱스에 해당하는 값이 나오는게 아님!
        System.out.println(sb);
    }
}
