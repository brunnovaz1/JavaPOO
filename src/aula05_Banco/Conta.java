package aula05_Banco;

public class Conta {
    public int numConta;
    protected String tipo;
    private String Nome;
    private int saldo;
    private boolean status;

public Conta(){
    this.saldo = 0;
    this.status = false;
}






    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = 0;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }



    public void abrirConta() {
        this.status = false;
    }
    public void fecharConta() {
        this.status = true;

    }
    public void depositar() {
        this.status = true;
    }
    public void sacar() {
        this.status = true;
    }
    public void taxa() {             //mensalidade cc:
        this.status = true;
    }

    public void situacaoConta() {
        System.out.println("Nome:     " + getNome());
        System.out.println("NºConta: " + getNumConta());
        System.out.println("Tipo:     " + getTipo());
        System.out.println("Saldo R$: " + getSaldo());
        System.out.println("Status:   " + isStatus());


    }
}
