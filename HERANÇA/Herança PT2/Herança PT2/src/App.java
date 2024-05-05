public class App {
    public static void main(String[] args) throws Exception {

        // Pessoa p1 = new Pessoa(); -> Classe abstrata nao pode ser instanciada

        Visitante v1 = new Visitante(); // Herança pobre/implementação - herda tudo de superclasse

        v1.setNome("Vés");
        v1.setIdade(27);
        v1.setSexo("M");

        System.out.println(v1.toString());

        Aluno a1 = new Aluno();   //Herança de diferença - tem tudo  de pessoa e tem especialização - Aluno = especialização de Pessoa. Pessoa = generalização de Aluno
        a1.setNome("Naruto");
        a1.setMatricula(999);
        a1.setCurso("Ninjustsu Aplicado");
        a1.setIdade(15);
        a1.setSexo("M");
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setMatricula(1212);
        b1.setNome("Mai Valentine");
        b1.setBolsa(400.50f);
        b1.setSexo("F");
        b1.pagarMensalidade();

    

    }
}
