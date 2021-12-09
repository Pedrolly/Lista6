package inatel;

public class Jogo {
    private String nome;
   private String empresa;
private String plataforma;



    public String getNome() {
        return nome;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Jogo() {
        this.nome = nome;
        this.empresa = empresa;
    }

}

