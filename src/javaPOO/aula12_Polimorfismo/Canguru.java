package javaPOO.aula12_Polimorfismo;

public class Canguru extends Mamifero{

    @Override
    public void locomover() {
        System.out.println("Pulou!!");
    }

    @Override
    public void alimentar() {
        System.out.println("Comida canguru!");
    }
    public void usarBolsa() {
        System.out.println("usando bolsa");
    }
}
