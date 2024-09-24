package javaPOO.aula11_Heranca;

public class Bolsista extends Aluno{
    private float bolsa;


    public void renovarBolsa(){
        System.out.println("Renovando bolsa de: " + this.getNome());
    }

    @Override
    public void pagarMensalidade() {
        super.pagarMensalidade();
        System.out.println(this.getNome() + " é bolsista! Pagamento com desconto.");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
