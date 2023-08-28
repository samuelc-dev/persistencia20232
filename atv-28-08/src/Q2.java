import java.io.*;

public class Q2 {
    public static void main(String[] args) throws IOException {
        /*
         * 2. Escreva uma aplicação Java para fazer exatamente o que foi pedido na
         * Questão 1, mas com uma única diferença:
         * 
         * A leitura e gravação devem ser realizadas em blocos de bytes (buffer) e não
         * byte a byte.
         * 
         * Dica: usar os métodos read(byte[] b) e write(byte[] b) de FileInputStream e
         * FileOutputStream, respectivamente. Testar a cópia com arquivos grandes. Usar
         * blocos de 8192 bytes. Exemplo:
         * 
         * ...
         * byte[] buffer = new byte[8192];
         * fis.read(buffer);
         * ...
         * Comparar o tempo de cópia de arquivos grandes usando a Questão 1 e a Questão
         * 2.
         */

        String origem = args[0];
        String destino = args[1];

        long startTime = System.currentTimeMillis();

        InputStream is = new FileInputStream(origem);
        InputStreamReader isr = new InputStreamReader(is, "UTF-8");
        try (BufferedReader br = new BufferedReader(isr)) {
            OutputStream os = new FileOutputStream(destino, true);

            byte[] buffer = new byte[8192]; // Tamanho do buffer para cópia
            int bytesRead;

            while ((bytesRead = is.read(buffer)) != -1) {
                os.write(buffer, 0, bytesRead);
            }

            long endTime = System.currentTimeMillis();
            long totalTime = endTime - startTime;

            System.out.println(totalTime);

            os.close();
        } catch (IOException e) {
            System.err.println("Erro durante a cópia do arquivo: " + e.getMessage());
            e.printStackTrace(System.err);
        }
    }
}
