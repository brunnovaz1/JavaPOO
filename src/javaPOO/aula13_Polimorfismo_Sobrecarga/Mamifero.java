package javaPOO.aula13_Polimorfismo_Sobrecarga;

public class Mamifero extends Animal {
    protected String corPelo;

    @Override
    public void emitirSom() {
        System.out.println("Som do Mamífero");
    }
}
