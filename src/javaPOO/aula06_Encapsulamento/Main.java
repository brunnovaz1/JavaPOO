package javaPOO.aula06_Encapsulamento;

public class Main {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
            c.ligar();
            c.maisVolume();
            c.play();
            c.abrirMenu();
        //    c.volume = 80;     erro por acesso privado

    }
}
