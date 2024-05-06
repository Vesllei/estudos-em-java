public class App {
    public static void main(String[] args) throws Exception {

        Mamifero m = new Mamifero();
        Passaro p = new Passaro();
        Peixe px = new Peixe();
        Reptil r = new Reptil();

        m.setPeso(35.3f);
        m.setCorPelo("Azul");
        m.alimentar();
        m.locomover();
        m.som();

        p.locomover();
        px.som();
    }
}
