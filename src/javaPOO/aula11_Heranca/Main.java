package javaPOO.aula11_Heranca;

public class Main {
    public static void main(String[] args) {


        //  Pessoa p1 = new Pessoa();              uma classe abstrata nao pode ser instanciada

        Visitante v1 = new Visitante();
        v1.setNome("Edu");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());

        Aluno a1 = new Aluno();
        a1.setMat(12345);
        a1.setCurso("Java");
        a1.setNome("bruno Vaz");
        a1.setIdade(41);
        a1.setSexo("M");
        a1.pagarMensalidade();
        System.out.println(a1.toString());


        Bolsista b1 = new Bolsista();
        b1.setNome("Bruno S.");
        b1.setMat(321456);
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();

    }
}
