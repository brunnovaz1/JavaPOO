package javaPOO.aula10_Heranca;

import javaPOO.aula09_Ex_Livro.Pessoa;

public class Aluno extends Pessoas {
    private int mat;
    private String curso;


public void cancelarMat(){
    System.out.println("Matricula será cancelada!");
}

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
