public class Gerente extends FuncionarioBase implements Beneficios{
    
    public Gerente(String nome, double salarioBase){
       super("", 0);
    }

    @Override
    public double calcularBonus(double percentual) {
        double bonusPercentual;
        bonusPercentual = getSalarioBase() * percentual;
        return bonusPercentual;
    }

    @Override
    public double calcularAuxilioMoradia(double valorFixado) {
        return valorFixado;
    }

    @Override
    public double calcularSalario() {
        double salario;
        salario = getSalarioBase() + calcularBonus(0);
        return salario;
    }
}
