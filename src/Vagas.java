import java.util.ArrayList;
import java.util.List;

public class Vagas {
    private static int Gerador_CODIGO=10025;
    private int ID;
    private String cargo;
    private String descricao;
    private double salario;

    protected List<Candidato> candidatosNaVaga = new ArrayList<>();

    public Vagas( String cargo, double salario) {
        this.ID = Gerador_CODIGO++;
        this.cargo = cargo;
        this.descricao = descricao;
        this.salario = salario;
    }

    public List<Candidato> exibirCandidatosNaVaga(){
        return candidatosNaVaga;
    }

    public Vagas(){}

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitulo() {
        return cargo;
    }

    public void setTitulo(String titulo) {
        this.cargo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public List<Candidato> getCandidatosNaVaga() {
        return candidatosNaVaga;
    }

    @Override
    public String toString() {
        return
                "\n#"+ID + ", "+cargo + ", R$ "+ salario;
    }

}
