public class Main {
    public static void main(String[] args) {
   
        Funcionario Joao = new Funcionario("Joao", 3000);
        Gerente Maria = new Gerente("Maria", 5000);
        Diretor Carlos = new Diretor("Carlos", 10000);

        Departamento Tecnologia = new Departamento("TECNOLOGIA");
        
        Tecnologia.adicionarFuncionario(Joao);
        Tecnologia.adicionarFuncionario(Maria);
        Tecnologia.adicionarFuncionario(Carlos);

        Tecnologia.imprimirSalariosFuncionarios();
    }
}
