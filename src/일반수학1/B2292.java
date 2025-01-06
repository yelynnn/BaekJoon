package 일반수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(bf.readLine());
        int layer=1;
        int end=1;

        while (n>end){
            end+=6*layer;
            layer++;
        }
        System.out.println(layer);
    }
}
