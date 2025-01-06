package 심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        double sum=0.0;
        double totalScore=0.0;

        double[] gradeScores={0.0,1.0,1.5,2.0,2.5,3.0,3.5,4.0,4.5};
        String[] gradeNames={"F","D0","D+","C0","C+","B0","B+","A0","A+"};

        for(int i=0;i<20;i++){
            st=new StringTokenizer(bf.readLine());
            String subject=st.nextToken();
            double score=Double.parseDouble(st.nextToken());
            String grade= st.nextToken();


            if (grade.equals("P")) {
                score=0;
                continue;
            }

            totalScore+=score;

            for(int j=0;j<gradeNames.length;j++){
                if(grade.equals(gradeNames[j])){
                    sum+=(gradeScores[j]*score);
                    break;
                }
            }
        }
        //소수점 여섯 자리까지 출력
        System.out.printf("%.6f%n",sum/totalScore);
    }
}
