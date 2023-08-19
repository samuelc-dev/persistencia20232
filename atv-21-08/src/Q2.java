import java.io.*;

public class Q2 {
    public static void main(String[] args) throws IOException{
        String posi0 = args[0];
        String posi1 = args[1];

        InputStream is = new FileInputStream(posi0);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();

        while(s != null){
            if(s.toLowerCase().contains(posi1.toLowerCase())) System.out.println(s);
            s = br.readLine();
        }
        
        br.close();
    }
}
