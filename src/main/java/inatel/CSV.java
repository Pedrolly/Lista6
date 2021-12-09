package inatel;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CSV<listaJogos> {
    public static void gerarCSVFuncSemFilhos(Path arquivo) {

        List<Jogo> func = leCsv(arquivo);

        gerarCsvNovo("func_filtrado.csv", func);
    }

    private static void gerarCsvNovo(String nomeArquivo,
                                     List<Jogo> func) {

        String cabecalho = "ID,Filhos,Salario\n";

        Path arquivoFinal = Paths.get(nomeArquivo);

        try {
            Files.writeString(arquivoFinal, cabecalho);

            StringBuilder builder = new StringBuilder();

            func.stream().
                    filter((f) -> f.getPlataforma()!= "ps4").
                    forEach((f) -> {
                        builder.append(f.getNome() + ",");
                                builder.append().append(gerarCSVFuncSemFilhos(arquivoFinal));
                                builder.append();
                    });

            Files.writeString(arquivoFinal, builder.toString(),


        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static List<Jogo> leCsv(Path arquivo){

        List<Jogo> funcionarios = new ArrayList<>();

        try {
            List<String> linhas = Files.readAllLines(arquivo);
            linhas.remove(0);

            linhas.forEach((linha) -> {

                String[] linhaSplit = linha.split(",");

                Jogo func = new Jogo();
                        (Integer.parseInt(linhaSplit[0]),
                                Integer.parseInt(linhaSplit[3]),
                                Double.parseDouble(linhaSplit[4]));
                funcionarios.add(func);

            });


        } catch (IOException e) {
            e.printStackTrace();
        }

        return funcionarios;

    }

}

