import java.util.ArrayList;

public class Lutador {

    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private String peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String nome, String nacionalidade, int idade, double altura, String peso,
            int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
        setCategoria(peso);
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        double categoriaDouble = Double.parseDouble(categoria);
        if (categoriaDouble < 52.2) {
            this.categoria = "Inválido";
        } else if (categoriaDouble <= 70.3) {
            this.categoria = "Leve";
        } else if (categoriaDouble <= 83.9) {
            this.categoria = "Médio";
        } else if (categoriaDouble <= 120.2) {
            this.categoria = "Pesado";
        } else
            this.categoria = "Inválido";

    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    // MÉTODOS

    public void apresentar() {
        System.out.println("Ficha Técnica:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Nacionalidade: " + nacionalidade);
        System.out.println("Vitórias: " + vitorias);
        System.out.println("Derrotas: " + derrotas);
        System.out.println("Empates: " + empates);
    }

    public void Status() {

    }

    public void ganharLuta() {

        this.setVitorias(getVitorias() + 1);

    }

    public void perderLuta() {

        this.setDerrotas(getDerrotas() + 1);

    }

    public void empatarLuta() {

        this.setEmpates(getEmpates() + 1);

    }

    ///////////////////////

    public ArrayList<Lutador> listaDeLutadores;

    public Lutador() {
        listaDeLutadores = new ArrayList<>();
    }

    public void adicionarLutador(Lutador lutador) {
        listaDeLutadores.add(lutador);
    }

    public void removerLutador(Lutador lutador) {
        listaDeLutadores.remove(lutador);
    }

}
