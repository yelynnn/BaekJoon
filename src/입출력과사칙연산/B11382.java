package 입출력과사칙연산;

import java.util.Scanner;

public class B11382 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        //범위가 크기 때문에 int가 아닌 long을 써야함

        long A=scanner.nextLong();
        long B=scanner.nextLong();
        long C=scanner.nextLong();
        System.out.println(A+B+C);
    }
}
