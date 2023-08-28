import java.io.*;

public class Exemplo01 {
    public static void main(String[] args) throws IOException{
        // if(args.length > 0)
        //     System.out.println("Ola " + args[0]);
        // else
        //     System.out.println("Hello world, putinha");
        InputStream is = new FileInputStream(args[0]);
        int b;
        int i = 1;

        while((b = is.read()) != -1){
            System.out.println(i++ + " " + b + " " + Integer.toHexString(b));
        }

        is.close();
    }
}

/*
 * Alguns comandos ensinados em sala
 * 1 - 'file nomeDOArquivo' vai retornar o tipo de caractere presente no arquivo.
 * 2 - 'ls -l nomeDooArquivo' vai retornar algumas informações
 * do arquivo como o tamanho e a data que foi criado.
 * 3 - 'cat teste.txt > teste2.txt' todo a saído do arquivo teste.txt irá para o
 * arquivo teste2.txt
 */
