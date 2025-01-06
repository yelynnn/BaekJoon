package 기하1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B15894 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

        long n=Integer.parseInt(bf.readLine());
        System.out.println(4*n);
    }
}
