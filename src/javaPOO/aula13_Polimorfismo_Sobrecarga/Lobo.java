package javaPOO.aula13_Polimorfismo_Sobrecarga;

import javaPOO.aula12_Polimorfismo.Mamifero;

public class Lobo extends Mamifero {
    @Override
    public void emitirSom() {
        System.out.println("Uivou!!! ");
    }
}
