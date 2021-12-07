package inatel;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class CSV {
    public static void gerarCSVFuncSemFilhos(Path arquivo) {

        List<Jogo> func = leCsv(arquivo);

        gerarCsvNovo("func_filtrado.csv", func);
    }

    List<Jogo> listaJogos = new ArrayList<>();
try

    {
        Reader reader = Files.newBufferedReader(csvFilePath);
        CsvToBean<Jogo> csvToBean = new CsvToBeanBuilder(reader) 8. withType(Jogo.class) 9.
        withIgnoreLeadingWhiteSpace(true) 10. build();
        listaJogos = csvToBean.parse();
    }
catch(IOException e){
        e.printStackTrace();
    }
return listaJogos;
}
}