// Crie um programa que vai receber, através do console, uma lista de atividades que vai ajudar o usuário a planejar 
// suas tarefas para o dia seguinte.

// Depois que o usuário informar, uma a uma, suas tarefas, as mesmas serão salvas em um arquivo de texto - cada tarefa 
// vai ocupar uma linha desse arquivo.

// Para receber cada tarefa do usuário, use o laço while. Enquanto o usuário não digitar um "x" no console, continue 
// pedindo que ele informe as atividades.

package LeituraEscritaEmArquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> prioridades = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            System.out.print(i + ": Digite sua tarefa prioritária: ");
            String tarefa = scanner.nextLine();
            prioridades.add(tarefa);
        }
        Path arquivo = Paths.get("/Users/raphaelferreira/workspace/CursoJava/Capítulo9/Prioridades.txt");
        Files.write(arquivo, prioridades);

        Path arquivo1 = Paths.get("/Users/raphaelferreira/workspace/CursoJava/Capítulo9/Prioridades.txt");
        List<String> linhas = Files.readAllLines(arquivo1);
        for (int i = 0; i < linhas.size(); i++) {
            String linha = linhas.get(i);
            System.out.println(linha);
        }
        
        scanner.close();
    }
}
