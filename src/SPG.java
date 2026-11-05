public class SPG extends Drago {

    public SPG(String nome, int forza) {
        super(nome, forza);
    }

    @Override
    public void usaPotere() {
        System.out.println(nome + " sputa ghiaccio!");
    }
}