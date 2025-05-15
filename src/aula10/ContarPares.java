package aula10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ContarPares {
    public static void main(String[] args) {
        String ficheiroEntrada = "src\\aula10\\major.txt";
        String ficheiroSaida = "src\\aula10\\resultado.txt";
        String texto = lerFicheiro(ficheiroEntrada);

        String separadores = "[\\s\\.,:;'’‘“”?!\\-\\*{}=+&/()\\[\\]\"']+";

        String[] palavras = texto.split(separadores);

        List<String> palavrasValidas = new ArrayList<>();
        for (String palavra : palavras) {
            if (palavra.length() >= 3) {
                palavrasValidas.add(palavra);
            }
        }

        HashMap<String, HashMap<String, Integer>> pares = new HashMap<>();

        for (int i = 0; i < palavrasValidas.size() - 1; i++) {
            String primeira = palavrasValidas.get(i);
            String segunda = palavrasValidas.get(i + 1);

            pares.putIfAbsent(primeira, new HashMap<>());
            HashMap<String, Integer> mapaInterno = pares.get(primeira);
            mapaInterno.put(segunda, mapaInterno.getOrDefault(segunda, 0) + 1);
        }

        try (PrintWriter writer = new PrintWriter(ficheiroSaida)) {
            for (String chave : pares.keySet()) {
                writer.print(chave + "={");
                HashMap<String, Integer> mapaInterno = pares.get(chave);
                List<String> lista = new ArrayList<>();
                for (String seguinte : mapaInterno.keySet()) {
                    lista.add(seguinte + "=" + mapaInterno.get(seguinte));
                }
                writer.print(String.join(", ", lista));
                writer.println("}");
            }
        } catch (FileNotFoundException e) {
            System.err.println("Erro: Ficheiro não encontrado - " + ficheiroSaida);
        }
    }

    private static String lerFicheiro(String ficheiroEntrada) {
        StringBuilder conteudo = new StringBuilder();

        try (Scanner scanner = new Scanner(new File(ficheiroEntrada))) {
            while (scanner.hasNextLine()) {
                conteudo.append(scanner.nextLine()).append(" ");
            }
        } catch (FileNotFoundException e) {
            System.err.println("Erro: Ficheiro não encontrado - " + ficheiroEntrada);
        }

        return conteudo.toString().toLowerCase();
    }
}