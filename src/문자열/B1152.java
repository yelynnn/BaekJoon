package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        //trim()은 문자열의 앞뒤에 있는 모든 공백 문자 제거
        String s = bf.readLine().trim();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
        }

        if (s.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(count + 1);
        }
    }
}
