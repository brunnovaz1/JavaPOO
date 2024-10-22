package javaPOO.Aula14_Projeto_Final;

public class Visualizacao {
    private Integrante espectador;
    private Video filme;

    public Visualizacao(Integrante espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotalAssistido(this.espectador.getTotalAssistido() +1);
        this.filme.setViews(this.filme.getViews() +1);
    }

    public void avaliar(){
    this.filme.setAvaliacao(3);
    }
    public void aaliar(int nota){
    this.filme.setAvaliacao(nota);
    }
    public void avaliar(int porcent){
    int tot = 0;
        if(porcent <= 20 ){
            tot = 1;
        }else if(porcent <= 40){
            tot = 2;
        }else if(porcent <= 60){
            tot = 3;
        }else if(porcent <= 80){
            tot = 4;
        }else{
            tot = 5;
        }
        this.filme.setAvaliacao(tot);
    }

    public Integrante getEspectador() {
        return espectador;
    }

    public void setEspectador(Integrante espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" +
                "espectador=" + espectador +
                ", filme=" + filme +
                '}';
    }

}
