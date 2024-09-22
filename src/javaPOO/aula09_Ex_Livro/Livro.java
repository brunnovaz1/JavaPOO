package javaPOO.aula09_Ex_Livro;

public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;


    public String detalhes() {
        return "Livro - " +
                "Titulo: " + titulo  + "\n" +
                " Autor: " + autor  + "\n" +
                " Paginas: " + totPaginas +
                " - Pag. Atual: " + pagAtual +
                " - Aberto: " + aberto + "\n" +
                " Leitor: " + leitor.getNome() +
                " - Idade: " + leitor.getIdade() +
                " - Sexo: "+ leitor.getSexo();
    }

    public Livro(String titulo, int totPaginas, String autor, Pessoa leitor) {
        this.titulo = titulo;
        this.totPaginas = totPaginas;
        this.autor = autor;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        if(!this.aberto){
            System.out.println("----> O livro esta fechado! <----");
            return;
        }
        this.aberto = true;
        if (p > this.getTotPaginas()) {
            setPagAtual(0);
        }else{
            this.setPagAtual(p);
        }
    }

    @Override
    public void avancarPag() {
        if(!this.aberto){
            System.out.println("----> O livro esta fechado! <----");
            return;
        }
        if(getPagAtual() == getTotPaginas()){
            this.setPagAtual(0);
        }else{
            this.pagAtual++;
        }
    }

    @Override
    public void voltarPag() {
        if(!this.aberto){
            System.out.println("----> O livro esta fechado! <----");
            return;
        }
        if(pagAtual == 0){
            System.out.println("Voce já esta na pagina 0.");
        }else {
            this.pagAtual--;
        }
    }
}

