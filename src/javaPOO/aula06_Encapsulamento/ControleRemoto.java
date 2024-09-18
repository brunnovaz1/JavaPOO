package javaPOO.aula06_Encapsulamento;

public class ControleRemoto implements Controlador{
    //atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    //metodos especiais
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    //metodos abstratos - @Override: sobreescrever, desconsidera o anterior(nada no caso) e vale esse código.

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println(" ==-- MENU --== ");
        System.out.println("Esta ligado? " + this.isLigado());
        System.out.println("Esta tocando? " + this.isTocando());
        System.out.println("Volume: " + this.getVolume());
        for(int i = 0; i <= this.getVolume(); i += 10){
            System.out.print("|");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if(isLigado()) {
            this.setVolume(this.getVolume()+5);
        }else{
            System.out.println("TV Desligada!");
        }
    }

    @Override
    public void menosVolume() {
        if(isLigado()) {
            this.setVolume(this.getVolume()-5);
        }
    }

    @Override
    public void ligarMudo() {
        if(this.isLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.isLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(isLigado() && !isTocando()) {
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(isLigado() && isTocando()) {
            this.setTocando(false);
        }
    }
}
