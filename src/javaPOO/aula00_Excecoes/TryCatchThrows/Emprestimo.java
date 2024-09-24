package javaPOO.aula00_Excecoes.TryCatchThrows;

import java.util.Scanner;

public class Emprestimo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("Valor do empréstimo: ");


        try {
            double valor = scan.nextDouble();

            validarValorEmprestimo(valor);
            System.out.println("Empréstimo concedido! R$" + valor);
        } catch (ValorInvalidoException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Você digitou um valor inválido.");
        }
    }


    public static void validarValorEmprestimo(double valor) throws ValorInvalidoException {
        if (valor < 100 || valor > 10000) {
            throw new ValorInvalidoException("Apenas valores entre R$100 e R$10.000 são permitidos.");
        }
    }
}

class ValorInvalidoException extends Exception {
    public ValorInvalidoException(String mensagem) {
        super(mensagem);
    }
}
