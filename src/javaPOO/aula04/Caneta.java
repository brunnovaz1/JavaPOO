package javaPOO.aula04;

public class Caneta {
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;




    public Caneta(String m, String c, float p) {               //construtor.
        this.modelo = m;
        this.cor = c;
        this.ponta =p;
        this.tampar();
      //  this.cor = "Azul";
    }



    public String getModelo() {
        return modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }



    public void tampar() {
        this.tampada = true;
    }
    public void destampar() {
        this.tampada = false;
    }



    public void status() {
        System.out.println("SOBRE A CANETA");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }
}
