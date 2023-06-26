public class PessoaJuridica extends Pessoa{

    private double cnpj;
    private int numeroDeFuncionarios;

    public PessoaJuridica(String nome, int idade, double cnpj, int numeroDeFuncionarios) {
        super(nome, idade);
        this.cnpj = cnpj;
        this.numeroDeFuncionarios = numeroDeFuncionarios;

    }

    @Override
    public void receberInformacoes() {

    }

    @Override
    public String toString() {
        return "PessoaJuridica {" +
                "cnpj= " + cnpj +
                ", numeroDeFuncionarios= " + numeroDeFuncionarios +
                '}';
    }
}
