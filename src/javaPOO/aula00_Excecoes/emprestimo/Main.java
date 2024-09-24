package javaPOO.aula00_Excecoes.emprestimo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o valor do emprestimo: R$");
        double valor = scan.nextDouble();

        try{Emprestimo.SolicitarEmprestimo(valor);

        }catch(ValorInvalidoException e){
            System.out.println("Erro! "+ e.getMessage());
        }
    }
}
