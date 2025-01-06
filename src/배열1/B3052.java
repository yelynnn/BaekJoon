package 배열1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class B3052 {
    public static void main(String[] args) throws IOException {

        //중복된 값을 허용하지 않는 HashSet 사용
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> set=new HashSet<>();
        int[] num = new int[10];
        int[] sub = new int[10];

        for (int i = 0; i < 10; i++) {
            num[i] = Integer.parseInt(bf.readLine());
            sub[i] = num[i] % 42;
            set.add(sub[i]);
        }
        System.out.println(set.size());
    }
}
