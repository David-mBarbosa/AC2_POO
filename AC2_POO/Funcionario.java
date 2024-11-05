public class Funcionario extends FuncionarioBase{
    public Funcionario(String nome, double salarioBase){
        super("", 0);
    }

    @Override
    public double calcularSalario() {
        double salario = getSalarioBase();
        return salario;
    }
}
