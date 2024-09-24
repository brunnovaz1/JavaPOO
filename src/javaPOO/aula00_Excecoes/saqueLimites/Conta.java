package javaPOO.aula00_Excecoes.saqueLimites;

public class Conta {
    private Integer numero;
    private String titular;
    private Double saldo;
    private Double limiteSaque;

    public Conta(Integer numero, String titular, Double saldo, Double limiteSaque) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(Double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }
    public void deposito(double valor) {
        saldo = saldo + valor;
    }
    public void saque(double valor) throws LimiteSaqueException, SaldoInsuficienteException {
        if(valor > saldo){
            throw new SaldoInsuficienteException("Erro: Saldo insuficiente para sacar.");
        }
        if(valor > getLimiteSaque()){
            throw new LimiteSaqueException("Erro: Saque acima do limite permitido!");
        }
            saldo = saldo-valor;



    }
}
