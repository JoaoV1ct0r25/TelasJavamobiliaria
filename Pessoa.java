package sistemaimobiliario;

public class Pessoa {
    private String nome, cpf, nascimento, estadoCivil, endereco, tipoTrabalho;
    private double renda;

    public Pessoa(String nome, String cpf, String nascimento, double renda,
                  String estadoCivil, String endereco, String tipoTrabalho) {
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
        this.renda = renda;
        this.estadoCivil = estadoCivil;
        this.endereco = endereco;
        this.tipoTrabalho = tipoTrabalho;
    }

    public String getNome() {
        return nome;
    }

    public double getRenda() {
        return renda;
    }
}
