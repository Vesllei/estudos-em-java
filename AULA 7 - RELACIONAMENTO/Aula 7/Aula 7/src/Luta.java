import java.util.Random;

public class Luta {

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    // public Luta(Lutador desafiado, Lutador desafiante, int rounds, boolean
    // aprovada) {
    // this.desafiado = desafiado;
    // this.desafiante = desafiante;
    // this.rounds = rounds;
    // this.aprovada = aprovada;
    // }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public void marcarLuta(Lutador lutador1, Lutador lutador2) {
        if (lutador1 != null && lutador2 != null) {
            if (lutador1.getCategoria().equals(lutador2.getCategoria()) && lutador1 != lutador2) {
                this.aprovada = true;
                this.desafiado = lutador1;
                this.desafiante = lutador2;
            } else {
                this.aprovada = false;
                this.desafiado = null;
                this.desafiante = null;
            }
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    

    public void lutar() {
        if (this.aprovada) {
            if (this.desafiado != null && this.desafiante != null) {
                this.desafiado.apresentar();
                this.desafiante.apresentar();

                Random random = new Random();
                int vencedor = random.nextInt(3);

                switch (vencedor) {
                    case 0:
                        System.out.println("EMPATOU!");
                        this.desafiado.empatarLuta();
                        this.desafiante.empatarLuta();
                        break;
                    case 1:
                        System.out.println("Vencedor: " + desafiado.getNome());
                        this.desafiado.ganharLuta();
                        this.desafiante.perderLuta();
                        break;
                    case 2:
                        System.out.println("Vencedor: " + desafiante.getNome());
                        this.desafiante.ganharLuta();
                        this.desafiado.perderLuta();
                        break;
                    default:
                        break;
                }
            } else {
                System.out.println("Erro: Um ou ambos os lutadores não foram definidos.");
            }
        } else {
            System.out.println("Luta não pode acontecer");
        }
    }

}
