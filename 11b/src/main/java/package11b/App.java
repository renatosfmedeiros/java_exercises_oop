package package11b;
public class App {

    public static void main(String[] args) {
        
       /* 
        Pessoa p1 = new Pessoa();
       */
       
       /*
       Visitante v1 = new Visitante();
       v1.setNome("Juvenal");
       v1.setIdade(22);
       v1.setSexo("M");
       System.out.println(v1.toString());
       */
       
        
       Aluno a1 = new Aluno();
       a1.setNome("Cláudio");
       a1.setMatricula(1111);
       a1.setCurso("Informática");
       a1.setIdade(16);
       a1.setSexo("M");
       a1.PagarMensalidade();
       
       
       Bolsista b1 = new Bolsista();
       b1.setMatricula(1112);
       b1.setNome("Jubileu");
       b1.setBolsa(12.5f);
       b1.setSexo("M");
       b1.PagarMensalidade();
       
       Professor p1 = new Professor();
       p1.setNome("Niltao");
       p1.setSexo("M");
       p1.receberAumento();
       
       Tecnico t1 = new Tecnico();
       
       t1.setNome("Chandler");
       t1.setSexo("M");
       t1.praticar();
       
    }
}
