import java.io.*;

public class Q3 {
    public static void main(String[] args) throws IOException{
        String posi0 = args[0];
        String posi1 = args[1];

        InputStream is = new FileInputStream(posi0);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();

        while(s != null) {
            System.out.println(s);
            s = br.readLine();
        }

        br.close();

        InputStream is1 = new FileInputStream(posi1);
        InputStreamReader isr1 = new InputStreamReader(is1);
        BufferedReader br1 = new BufferedReader(isr1);
        String s1 = br1.readLine();

        while(s1 != null) {
            System.out.println(s1);
            s1 = br1.readLine();
        }

        br1.close();

    }
}
