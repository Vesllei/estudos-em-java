public /* final */ class Aluno extends Pessoa { // final impede que superclasse tenha derivados.

    private int matricula;
    private String curso;

    public /* final */ void pagarMensalidade() { // final impede que métodos sejam sobrepostos
        System.out.println("Pagando mensalidade de " + this.getNome());
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
