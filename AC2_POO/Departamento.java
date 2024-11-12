import java.util.ArrayList;

public class Departamento {
    private String nome;
    double soma;
    
    public Departamento(String nome) {
        this.nome = nome;
    }

    private ArrayList<FuncionarioBase> ListadeFuncionários = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<FuncionarioBase> getListadeFuncionários() {
        return ListadeFuncionários;
    }

    public void setListadeFuncionários(ArrayList<FuncionarioBase> listadeFuncionários) {
        ListadeFuncionários = listadeFuncionários;
    }

    public void adicionarFuncionario(FuncionarioBase funcionario) {
        ListadeFuncionários.add(funcionario);
    }


    public void removerFuncionario(FuncionarioBase funcionario) {
        ListadeFuncionários.remove(funcionario);
    }

    public void calcularFolhaPagamento(){
        for (FuncionarioBase funcionarioBase : ListadeFuncionários) {
            soma += funcionarioBase.calcularSalario();
        }
    }

    public void imprimirSalariosFuncionarios(){
        for (FuncionarioBase funcionarioBase : ListadeFuncionários) {
            System.out.println(funcionarioBase.getNome() + funcionarioBase.calcularSalario());
        }
    }

}