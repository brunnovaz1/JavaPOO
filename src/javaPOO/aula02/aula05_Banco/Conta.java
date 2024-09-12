package javaPOO.aula02.aula05_Banco;

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

    public int getNumConta()
    {
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

    public void abrirConta(String tipo) {
        setTipo(tipo);
        setStatus(true);

        if(tipo.equals("cc")){
            this.saldo = 50;
        } else if(tipo.equals("cp")){
            saldo = 150;
        }else{
            setStatus(false);
            System.out.println("Tipo de Conta inválida!");
        }
    }
    public void fecharConta() {
    if(!isStatus()){
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("A conta não esta ativa!");
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - -");        return;
    }
    if(saldo == 0){
        setStatus(false);
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("Conta fechada com sucesso!");
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - -");
    }else{
         System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - -");
         System.out.println("ERRO! Para fechar a conta o saldo deve ser zero.");
         System.out.println("Saldo: R$" + getSaldo());
         System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - -");
        }
    }
    public void depositar(int dep) {
        if(!isStatus()){
            System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - -");
            System.out.println("A conta não esta ativa!");
            System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - -");

        }else {
            this.saldo = saldo + dep;
        }
    }
    public void sacar(int sac) {
        if(!isStatus()){
            System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - -");
            System.out.println("A conta não esta ativa!");
            System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - -");

        }else if (saldo < sac) {
            System.out.println("!!! SAQUE RECUSADO: R$" + sac + " - Saldo insuficiente!");
        } else {
            saldo = saldo - sac;
            System.out.println("!!! SAQUE REALIZADO: R$" + sac);
        }
    }
        public void taxa() {cc:
        setTipo(tipo);
        int tx;
        if(tipo.equals("cc")){
            tx = 12;
            if(saldo < tx) {
                System.out.println("Saldo insuficente para pagamento da taxa de manutenção. - R$" + getSaldo());
            } else {
                saldo = saldo - tx;
                System.out.println("Taxa de manutenção paga! - R$" + tx);
            }
        }else{
            tx = 20;
                if (saldo < tx) {
                    System.out.println("Saldo insuficente para pagamento da taxa de manutenção. - R$" + getSaldo());
                } else {
                    saldo = saldo - tx;
                    System.out.println("Taxa de manutenção paga! - R$" + tx);
                }
        }
    }

    public void situacaoConta() {
        System.out.println("Nome:     " + getNome());
        System.out.println("NºConta:  " + getNumConta());
        System.out.println("Tipo:     " + getTipo());
        System.out.println("Saldo R$: " + getSaldo());
        System.out.println("Status:   " + isStatus());


    }
}
