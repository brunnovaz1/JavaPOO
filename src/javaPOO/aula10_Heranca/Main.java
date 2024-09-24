package javaPOO.aula10_Heranca;

import javaPOO.aula09_Ex_Livro.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoas p1 = new Pessoas();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();


        p1.setNome("Bruno");
        p1.setSexo("M");
        p2.setNome("Maria");
        p2.setSexo("F");
        p2.setCurso("Culinaria");
        p3.setNome("Eduardo");
        p3.setIdade(22);
        p3.setSalario(1000);
        p4.setNome("Francisco");
        p4.setSetor("Vendas");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());


    }
}
