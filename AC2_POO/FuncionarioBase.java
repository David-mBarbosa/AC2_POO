public abstract class FuncionarioBase {
    protected String nome;
    protected double salarioBase;

    public String getNome() {
        return nome;
    }

    public FuncionarioBase(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public abstract double calcularSalario();

    public double calcularSalario(double bonusAdicional){
        double salario = 0;
        salario = salario + bonusAdicional;
        return salario;
    }
    
}