package javaPOO.aula12_Polimorfismo;

public class Cachorro extends Mamifero{
    @Override
    public void emitirSom() {
        System.out.println("Latiu!");    }

    @Override
    public void alimentar() {
        System.out.println("comeu ração");
    }
}
