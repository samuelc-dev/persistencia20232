import java.io.*;

public class Q1{
    public static void main(String[] args) throws IOException{
        String posi0 = args[0];
        InputStream is = new FileInputStream(posi0);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        int cont = 0;

        while(cont < 10) {
            System.out.println(s);
            s = br.readLine();
            cont++;
        }

        br.close();

    }
}