public class SPG extends Drago {

    public SPG(String nome) {
        super(nome);
    }

    @Override
    public void usaPotere() {
        System.out.println(nome + " sputa ghiaccio!");
    }
}