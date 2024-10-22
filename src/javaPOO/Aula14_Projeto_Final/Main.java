package javaPOO.Aula14_Projeto_Final;

public class Main {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0]= new Video("Aula LICITAÇÃO");
        v[1]= new Video("Aula BANCO DADOS");
        v[2]= new Video("Aula JAVA");

        Integrante i[] = new Integrante[2];
        i[0] = new Integrante("Bruno", 41, "M", "brunnovaz");
        i[1] = new Integrante("Edu", 23, "M", "eduvaz");

        Visualizacao vis[] = new Visualizacao[2];
        vis[0] = new Visualizacao(i[0], v[2]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());

        vis[1] = new Visualizacao(i[0], v[0]);
        vis[1].avaliar(80);
        System.out.println(vis[1].toString());



      /*  System.out.println("\n - - - - - - - - VÍDEOS - - - - - - - - ");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("\n - - - - - - - - INTEGRANTES - - - - - - ");
        System.out.println(i[0].toString());
        System.out.println(i[1].toString());

       */
    }
}
