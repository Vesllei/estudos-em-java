import java.util.ArrayList;

public class App {

     public static ArrayList<Lutador> listaDeLutadores = new ArrayList<>();
       
    public static void main(String[] args) throws Exception {
        Lutador l1 = new Lutador("Pretty Boy", "França", 31, 1.75, 68.9f, 11, 3, 1);
        listaDeLutadores.add(l1);

        Lutador l2 = new Lutador("Mago Negro", "Japão", 25, 1.94, 77.4f, 10, 2, 0);
        listaDeLutadores.add(l2);

        Lutador l3 = new Lutador("Hinata Shoyou", "Japão", 15, 1.63, 65.0f, 4, 0, 1);
        listaDeLutadores.add(l3);

        Lutador l4 = new Lutador("Bruce Lee", "China", 38, 1.79, 89.7f, 18, 0, 1);
        listaDeLutadores.add(l4);

        // l1.apresentar();
        // System.out.println("");
        // l2.apresentar();
        // System.out.println(" ");
        // l3.apresentar();
        // System.out.println("");
        // l4.apresentar();
        // l3.ganharLuta();
        // System.out.println("");
        // l3.apresentar();

        Luta luta1 = new Luta();
        luta1.marcarLuta(l1, l1);
        luta1.lutar();

        // l1.apresentar();
        // System.out.println("");
        // l3.apresentar();

    }
}