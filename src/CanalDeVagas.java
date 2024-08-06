
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CanalDeVagas {
    private List<Candidato> listaDeCandidatos;
    private List<Vagas> listaDeVagas;

    public CanalDeVagas() {
        this.listaDeCandidatos = new ArrayList<>();
        this.listaDeVagas = new ArrayList<>();
    }
    public void cadastrarCandidato(String nome, int idade){
        listaDeCandidatos.add(new Candidato(nome,idade));
    }

    public void criarVaga(String cargo, double salario){
        listaDeVagas.add(new Vagas(cargo,salario));
//        System.out.println("Vaga adicionada");
    }

    public List<Vagas> getListaDeVagas() {
        return listaDeVagas;
    }

    public List<Candidato> getListaDeCandidatos() {
        return listaDeCandidatos;
    }

    public static void main(String[] args) {

        CanalDeVagas canalDeVagas = new CanalDeVagas();


        canalDeVagas.cadastrarCandidato("Joao Silva",35);
        canalDeVagas.cadastrarCandidato("Anderson Martins",23);
        canalDeVagas.cadastrarCandidato("Ilana Costa",25);

        canalDeVagas.cadastrarCandidato("Italo Sales",20);

        System.out.println(canalDeVagas.listaDeCandidatos);

        canalDeVagas.criarVaga("Analista de TI",3000);
        canalDeVagas.criarVaga("Operador de Telemarketing",1);
        canalDeVagas.criarVaga("Assistente Geral",1600);
        canalDeVagas.criarVaga("TESTE",3500);

        canalDeVagas.listaDeCandidatos.get(1).aplicarParaVaga(10028,canalDeVagas.getListaDeVagas());
        canalDeVagas.listaDeCandidatos.get(1).aplicarParaVaga(10025,canalDeVagas.getListaDeVagas());
        canalDeVagas.listaDeCandidatos.get(1).aplicarParaVaga(10027,canalDeVagas.getListaDeVagas());

        System.out.println(canalDeVagas.listaDeVagas);

//        System.out.println(canalDeVagas.listaDeVagas.get(3).candidatosNaVaga);
//
//        System.out.println("\nExibindo lista de vagas do candidato "+ canalDeVagas.listaDeCandidatos.get(1).getNome()+"\n"+canalDeVagas.listaDeCandidatos.get(1).getCandidaturas());
    }
}
