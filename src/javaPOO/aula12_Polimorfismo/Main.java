package javaPOO.aula12_Polimorfismo;

public class Main {
    public static void main(String[] args) {


        Mamifero m = new Mamifero();
        Ave a = new Ave();
        Peixe p = new Peixe();
        Reptil r = new Reptil();
        Canguru c = new Canguru();
        Cachorro dog = new Cachorro();

        m.setCorPelo("branca");
        System.out.println("cor pelo: " + m.getCorPelo());
        m.alimentar();
        m.locomover();
        m.emitirSom();

        a.fazerNinho();

        c.locomover();
        c.alimentar();
        c.usarBolsa();

        dog.alimentar();
        dog.emitirSom();
    }

}


//Polimorfismo de Sobreposição: Mesma assinatura e Classes diferentes
//Polimorfismo de Sobrecarga: Assinaturas diferentes e mesma Classe
