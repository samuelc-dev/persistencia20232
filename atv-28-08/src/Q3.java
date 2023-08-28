import java.io.*;

public class Q3 {
    public static void main(String[] args) throws IOException {
        /*
         * 3. Escreva uma aplicação Java para ler um arquivo texto com codificação
         * ISO-8859-1 e convertê-lo para UTF-8.
         * 
         * Os nomes dos arquivos (origem e destino) devem ser definidos via argumentos
         * de linha de comando (Dica: usar o String args[] do método main).
         */

        String origem = args[0];
        String destino = args[1];

        long startTime = System.currentTimeMillis();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(origem), "ISO-8859-1"));
                BufferedWriter brw = new BufferedWriter(
                        new OutputStreamWriter(new FileOutputStream(destino), "UTF-8"))) {
            String s;

            while ((s = br.readLine()) != null) {
                brw.write(s);
                brw.newLine();
                s = br.readLine();
            }

            long endTime = System.currentTimeMillis();
            long totalTime = endTime - startTime;

            System.out.println(totalTime);

            brw.close();
        } catch (IOException e) {
            System.err.println("Erro durante a cópia do arquivo: " + e.getMessage());
            e.printStackTrace(System.err);
        }
    }

}
