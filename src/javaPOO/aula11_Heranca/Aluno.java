package javaPOO.aula11_Heranca;                     //Aluno e uma especializacao de Pessoa
                                                    //Pessoa e uma generalizacao de Aluno
public class Aluno extends Pessoa{
    private int mat;
    private String curso;

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

    public void  pagarMensalidade() {
        System.out.println("Pagando mensalidade do aluno: " + this.getNome());




    }

}
