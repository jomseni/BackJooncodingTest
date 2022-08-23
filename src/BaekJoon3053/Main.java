package BaekJoon3053;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    final static double PI = Math.PI;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double r = Double.parseDouble(br.readLine());

        System.out.printf("%.6f\n", r * r * PI);
        System.out.printf("%.6f\n",r * r * 2);
    }
}
