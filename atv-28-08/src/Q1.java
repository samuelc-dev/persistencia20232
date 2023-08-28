import java.io.*;

public class Q1 {
    public static void main(String[] args) throws IOException {

        String origem = args[0];
        String destino = args[1];

        long startTime = System.currentTimeMillis();

        InputStream is = new FileInputStream(origem);
        InputStreamReader isr = new InputStreamReader(is, "UTF-8");

        try (BufferedReader br = new BufferedReader(isr)) {
            String s = br.readLine();
            OutputStream os = new FileOutputStream(destino, true);
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter brw = new BufferedWriter(osw);
            while (s != null) {
                brw.write(s);
                brw.newLine();
                s = br.readLine();
            }

            long endTime = System.currentTimeMillis();
            long totalTime = endTime - startTime;

            System.out.println(totalTime);

            brw.close();
        } catch (IOException e) {
            System.err.println("Erro ao copiar o arquivo: " + e.getMessage());
            e.printStackTrace(System.err);
        }
    }
}
