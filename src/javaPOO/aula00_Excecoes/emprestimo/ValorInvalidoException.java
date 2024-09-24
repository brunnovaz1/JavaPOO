package javaPOO.aula00_Excecoes.emprestimo;

public class ValorInvalidoException extends Exception{
    public ValorInvalidoException(String message){
        super(message);
    }
}
