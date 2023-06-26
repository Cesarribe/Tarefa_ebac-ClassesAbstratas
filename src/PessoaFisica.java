public class PessoaFisica extends Pessoa {

    private String estadoCivil;
    private String escolaridade;

    public PessoaFisica(String nome, int idade, String estadoCivil, String escolaridade) {
        super(nome, idade);
       this.escolaridade = escolaridade;
       this.estadoCivil = estadoCivil;

    }

    @Override
    public void receberInformacoes() {

    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "estadoCivil= '" + estadoCivil + '\'' +
                ", escolaridade= '" + escolaridade + '\'' +
                '}';
    }
}
