package 심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

        String s=bf.readLine();

        String [] arr=new String[]{"c=","c-","dz=","d-","lj","nj","s=","z="};

        for(int i=0;i< arr.length;i++){
            //문자열 s에서 arr[i]와 일치하는 모든 부분을 !로 대체
            s=s.replaceAll(arr[i],"!");
        }
        //문자열 s를 개별 문자로 나누어 newArr 배열에 저장
        String [] newArr=s.split("");

        System.out.println(newArr.length);
    }
}
