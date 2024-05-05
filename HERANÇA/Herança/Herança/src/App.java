public class App {
    public static void main(String[] args) throws Exception {
        
        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();
        Professor prof = new Professor();
        Funcionario func = new Funcionario();

        aluno.setNome("Vés");
        System.out.println(aluno.getNome());
       

    }
}
