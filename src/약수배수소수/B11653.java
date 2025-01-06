package 약수배수소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());

        if (n == 1) {
            return;
        }
        else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                while (n % i == 0) {
                    System.out.println(i);
                    n = n / i;
                }
            }
        }
        if(n>1){
            System.out.println(n);
        }
    }
}
