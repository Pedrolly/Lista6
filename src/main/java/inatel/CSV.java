package inatel;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import modelos.plataformas;
import modelos.publicadoras;
public class CSV<listaJogos> {
    public static List<modelos.jogo> readGameCsv(Path csvFilePath){

        List<modelos.jogo> lista = new ArrayList<>();

        try {
            Reader reader = Files.newBufferedReader(csvFilePath);
            CsvToBean<modelos.jogo> csvToBean = new CsvToBeanBuilder(reader)
                    .withType(modelos.jogo.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

            gameList = csvToBean.parse();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lista;
    }

}

