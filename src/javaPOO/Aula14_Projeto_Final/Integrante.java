package javaPOO.Aula14_Projeto_Final;

public class Integrante extends Pessoa{
    private String login;
    private int TotalAssistido;

    public Integrante(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.TotalAssistido = 0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotalAssistido() {
        return TotalAssistido;
    }

    public void setTotalAssistido(int totalAssistido) {
        TotalAssistido = totalAssistido;
    }

    @Override
    public String toString() {
        return "Integrante{" +
                super.toString() +
                "\nlogin='" + login + '\'' +
                ", TotalAssistido=" + TotalAssistido +
                '}';
    }
}
