package inatel;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

import inatel.Pessoa;

public class CSV {
    public static void gerarCSVFuncSemFilhos(Path arquivo) {

        List<Pessoa> func = leCsv(arquivo);

        gerarCsvNovo("func_filtrado.csv", func);
    }

    List<Pessoa> listaPessoas = new ArrayList<>();
try

    {
        Reader reader = Files.newBufferedReader(csvFilePath);
        CsvToBean<Pessoa> csvToBean = new CsvToBeanBuilder(reader) 8. withType(Pessoa.class) 9.
        withIgnoreLeadingWhiteSpace(true) 10. build();
        listaPessoas = csvToBean.parse();
    }
catch(IOException e){
        e.printStackTrace();
    }
return listaPessoas;
}
}