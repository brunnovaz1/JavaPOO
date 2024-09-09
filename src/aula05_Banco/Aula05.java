package aula05_Banco;

public class Aula05 {
    public static void main(String[] args) {

        Conta conta01 = new Conta();
        Conta conta02 = new Conta();


        //conta01.numConta = 00001; primeiro teste
        conta01.tipo = "corrente";

        conta01.setNumConta(10001);
        conta01.setTipo("cc");
        conta01.setNome("Bruno Vaz");
        conta01.setSaldo(1000);
        conta01.setStatus(false);

        conta01.situacaoConta();
        conta02.situacaoConta();
    }
}
