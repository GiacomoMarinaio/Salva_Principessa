public class SPF extends Drago{
    public SPF(String nome, int forza) {
        super(nome, forza);
    }

    @Override
    public void usaPotere() {
        System.out.println(nome + " sputa fuoco!");
    }
}
