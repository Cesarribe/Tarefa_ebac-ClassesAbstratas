public class Main {
    public static void main(String[] args) {

        PessoaFisica primeira = new PessoaFisica("Julio", 33, "Casado","Superior");
        PessoaJuridica segunda = new PessoaJuridica("WebDesign", 2, 148, 5);

        System.out.println(primeira.toString());
        System.out.println(segunda.toString());


    }
}