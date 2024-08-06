
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Candidato {
    private static int Gerador_ID=001;
    private int id;
    private String nome;
    private int idade;

    private List<Vagas> candidaturas = new ArrayList<>();


    public Candidato(String nome, int idade) {
        this.id=Gerador_ID++;
        this.nome = nome;
        this.idade = idade;
    }


    public void aplicarParaVaga(int id, List<Vagas> listaDeVagas){
        if(!listaDeVagas.isEmpty()){
            for(Vagas v:listaDeVagas){
                if(v.getID()==id){
                    this.candidaturas.add(v);
                    v.candidatosNaVaga.add(this);
                }
            }
        } else {
            throw new RuntimeException("Não há vagas disponiveis");
        }

    }
    public void aplicarParaVaga(Vagas vaga){
        candidaturas.add(vaga);
        vaga.candidatosNaVaga.add(this);
    }

    public void exibirCandidaturas(){
        System.out.println(candidaturas);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public List<Vagas> getCandidaturas() {
        return candidaturas;
    }

    public void setCandidaturas(List<Vagas> candidaturas) {
        this.candidaturas = candidaturas;
    }

    @Override
    public String toString() {
        return "#"+id + ", "+nome + ", "+idade;
    }
}
