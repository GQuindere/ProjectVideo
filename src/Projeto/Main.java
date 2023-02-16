package Projeto;

public class Main {
    public static void main(String[] args) {
        Video v[] = new Video[4];
        v[0] = new Video("Aula 01 de Poo");
        v[1] = new Video("Aula 12 de C#");
        v[2] = new Video("Café com conhecimento");
        v[3] = new Video("Refinamento");

        Usuario u[] = new Usuario[3];
        u[0] = new Usuario("Gabriel", 21, "Masculino", "gquindere");
        u[1] = new Usuario("Lailton", 23, "Masculino", "lbento");
        u[2] = new Usuario("Alef", 26, "Masculino", "amendes");

        Visualizacao vis[] = new Visualizacao[5];

        vis[0] = new Visualizacao(u[0], v[2]);
        vis[0].avaliar();
        System.out.println(vis[0].toString()); //Assiste Poo

        vis[1] = new Visualizacao(u[0], v[1]);
        vis[1].avaliar(87.0f);
        System.out.println(vis[1].toString()); //Assiste C#

//        System.out.println("Videos\n---------------------------------------");
//        System.out.println(v[0].toString());
//        System.out.println(v[1].toString());
//        System.out.println(v[2].toString());
//        System.out.println(v[3].toString());
//        System.out.println("\nUsuarios\n---------------------------------------");
//        System.out.println(u[0].toString());
//        System.out.println(u[1].toString());
//        System.out.println(u[2].toString());
    }
}
