import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[][] arr = new char[5][15]; // 배열 생성

        String str ="";
         for(int i=0; i<5; i++) {
             str = br.readLine();
            for(int j=0; j<str.length(); j++) {
                arr[i][j] = str.charAt(j);
            }
         }

        for(int i=0; i<15; i++){
            for(int j=0; j<5; j++){
                str += arr[j][i];
                if(arr[j][i] == (char)0) {
                    continue;
                }
                System.out.print(arr[j][i]);
            }
        }
    }

}