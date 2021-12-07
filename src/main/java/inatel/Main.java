package inatel;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class Main {
    Path arquivo = Paths.get("funcionarios.csv");

        CSVUtils.gerarCSVFuncSemFilhos(arquivo);
}
