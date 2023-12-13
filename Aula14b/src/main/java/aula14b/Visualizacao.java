package aula14b;
public class Visualizacao {
    private Gafanhoto espectator;
    private Video filme;

    public Visualizacao(Gafanhoto espectator, Video filme) {
        this.espectator = espectator;
        this.filme = filme;
        //this.espectador.setTotAssistido(this.espectador.getTotAssistido()+1);
        this.filme.setViews(this.filme.getViews()+1);
        
    }
    
    public void avaliar(){
        this.filme.setAvaliacao(5);
        
    }

    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
        
    }
    public void avaliar(float porc){
        int tot = 0;
        if (porc <=20){
        tot = 3;
        } else if (porc <=50){
            tot = 5;
        } else if (porc <=90){
            tot = 8;
        } else {
            tot = 10;
        }
        
    }
   // this.filme.setAvaliacao(tot);
    
    public Gafanhoto getEspectator() {
        return espectator;
    }

    public void setEspectator(Gafanhoto espectator) {
        this.espectator = espectator;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectator=" + espectator + ", filme=" + filme + '}';
    }
    
    
    
    
    
    
    
    
    
    
}
