import java.util.Scanner;

public class BackJoon4344{
    public static void main(String[] args) {
        //BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int testcase = sc.nextInt();
        for(int k=0; k<testcase; k++) {

            int num = sc.nextInt();

            int[] score = new int[num];

            int sum=0;
            int count=0;
            double percent=0 ,avg =0;

            for (int i = 0; i < num; i++) {
                score[i] = sc.nextInt();
                sum += score[i];
            }
            avg = sum / score.length;
            for (int i = 0; i < num; i++) {
                if (avg < score[i]) {
                    count++;
                }
            }
            percent = (double)count / score.length * 100;
            System.out.println(String.format("%.3f",percent)+"%");
        }
    }
}