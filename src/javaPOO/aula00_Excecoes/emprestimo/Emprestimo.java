package javaPOO.aula00_Excecoes.emprestimo;

class Emprestimo {
    public static void SolicitarEmprestimo(double valor) throws ValorInvalidoException{
        if(valor < 100 || valor > 10000){
            throw new ValorInvalidoException("Valor do emprestimo deve ser entre $100 e $10000");
        }
        System.out.println("Empréstimo aprovado! R$" + valor);
    }
}
