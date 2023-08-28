import java.io.*;

public class Q4 {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            StringBuilder text = new StringBuilder();

            System.out.println("Digite 'FIM' para encerrar!");
            System.out.println("Digite um texto ou palavras:");

            String linha;
            while (!(linha = reader.readLine()).toLowerCase().equals("fim")) {
                text.append(linha).append(System.lineSeparator());
            }

            System.out.print("Digite o nome do arquivo: ");
            String nomeArquivo = reader.readLine();

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
                writer.write(text.toString());

                System.out.println("Gravado com sucesso!");

            } catch (IOException e) {
                System.err.println("Houve algum erro na gravação do arquivo: " + e.getMessage());
                e.printStackTrace(System.err);
            }

        } catch (IOException e) {
            System.err.println("Houve algum erro durante a leitura de entrada: " + e.getMessage());
            e.printStackTrace(System.err);
        }
    }
}
