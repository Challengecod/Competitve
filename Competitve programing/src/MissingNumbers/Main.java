package MissingNumbers;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = in.nextInt();
        int n2 = n;
        int sum = 0;
        int subSum = n;
        int answer = 0;
        for (int i = 0; i < n - 1; i++) {
            int x = in.nextInt();
            sum += x;
            n2--;
            subSum += n2;
            answer = subSum - sum;
        }
        System.out.println(answer);
    }
}