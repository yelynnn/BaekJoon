package 배열1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(bf.readLine());
        double[] score=new double[n];
        double[] subject=new double[n];
        double sum=0;
        double max=0;

        st=new StringTokenizer(bf.readLine());
        for(int i=0;i<n;i++){
            score[i]=Integer.parseInt(st.nextToken());
        }

        for(int i=0;i<n;i++){
            max=Math.max(max,score[i]);
        }

        for(int i=0;i<n;i++){
            subject[i]=(score[i]/max)*100;
            sum+=subject[i];
        }

        System.out.println(sum/n);
    }
}
