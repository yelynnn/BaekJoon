package 기하1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B9063 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int square=0;

        int n=Integer.parseInt(bf.readLine());
        int[][] point=new int[n][2];
        int min_x;
        int max_x;
        int min_y;
        int max_y;

        for(int i=0;i<n;i++){
            st=new StringTokenizer(bf.readLine());
            point[i][0]=Integer.parseInt(st.nextToken());
            point[i][1]=Integer.parseInt(st.nextToken());

        }
        min_x=point[0][0];
        max_x=point[0][0];
        min_y=point[0][1];
        max_y=point[0][1];

        for(int i=0;i<n;i++){

            min_x=Math.min(min_x,point[i][0]);
            max_x=Math.max(max_x,point[i][0]);
            min_y=Math.min(min_y,point[i][1]);
            max_y=Math.max(max_y,point[i][1]);
        }

        square=(max_x-min_x)*(max_y-min_y);
        System.out.println(square);
    }
}
