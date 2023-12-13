package com.mycompany.projetinholivro;

public class ProjetinhoLivro {

    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[2];
        
        p[0] = new Pessoa("Renato", 25, "M");
        p[1] = new Pessoa("Carol", 20, "F");
        
        l[0]= new Livro("X-Men Evolution", "Livro do Renatao", 500, 0, false, p[0] );
        l[1] = new Livro("Avatar", "Made By Renatao", 250, 0,false, p[1]);
        
        l[0].abrir();
        l[0].folhear(100);
        l[0].avancarPag();
        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());
        

    }
}
