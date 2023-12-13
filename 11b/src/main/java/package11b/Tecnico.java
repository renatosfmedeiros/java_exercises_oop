package package11b;
public class Tecnico extends Aluno {
    
    private boolean registroProfissional;
    
    public void praticar() {
        System.out.println(this.getNome() + " praticando com sucesso");
    }

    public boolean getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(boolean registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
}
