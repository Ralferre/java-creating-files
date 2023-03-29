// crie um programa que faça a leitura do arquivo, coloque os nomes em ordem alfabética e, por fim, salve os nomes já 
// ordenados em um arquivo diferente.

package ExercicioOrdenacao;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        
        List<String> linesFromFile = readFile("/Users/raphaelferreira/workspace/CursoJava/Capítulo9/Lista Titulares.txt");
        printList(linesFromFile);

        printText("Ordered List below: ");
        orderFootballTeam(linesFromFile);
        printList(linesFromFile);
        creatNewFileOrdered(linesFromFile, "/Users/raphaelferreira/workspace/CursoJava/Capítulo9/Lista Ordenada Titulares.txt");
        
        
    }

    public static List<String> readFile(String pathFile) throws IOException {
        Path fileToRead = Paths.get(pathFile);
        List<String> linesFromFile = Files.readAllLines(fileToRead);
        return linesFromFile;
    }

    //{ W, M, G, M, J }
    //função compareTo: retorna 1 se primeira String segue a segunda String
    //                  retorna 0 se ambas as strings são iguais
    //                  retorna -1 se primeira String precede a segunda String
    public static List<String> orderFootballTeam(List<String> footballTeam) {
        for (int i = 1; i < footballTeam.size(); i++) {
            String playerBasePosition = footballTeam.get(i);
            int indexBasePosition = i;
            while (indexBasePosition > 0) {
                int indexPreviousPosition = indexBasePosition - 1;
                String playerPreviousPosition = footballTeam.get(indexPreviousPosition);
                if (isAfterThan(playerPreviousPosition, playerBasePosition)) {
                    footballTeam.set(indexPreviousPosition, playerBasePosition);
                    footballTeam.set(indexBasePosition, playerPreviousPosition);
                    indexBasePosition --;
                } else {
                    break;
                }
            }
        }

        return footballTeam;
    }

    public static boolean isAfterThan(String player1, String player2) {
        boolean isAfter;
        if (player1.compareTo(player2) < 0) {
            isAfter = false;
        } else {
            isAfter = true;
        }     
        return isAfter;
        
    }

    public static void creatNewFileOrdered(List<String> orderedTeam, String pathNewFile) throws IOException {
        Path file = Paths.get(pathNewFile);
        Files.write(file, orderedTeam);
        printText("Created a new file ordered in the same path which it read.");
    }

    public static void printList(List<String> footballTeam) {
        for (int i = 0; i < footballTeam.size(); i++) {
            String linha = footballTeam.get(i);
            System.out.println(linha);
        }
    }

    public static void printText(String text) {
        System.out.println(text);
    }
}
