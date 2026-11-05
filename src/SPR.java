public class SPR extends Drago {

    public SPR(String nome, int forza) {
        super(nome, forza);
    }

    @Override
    public void usaPotere() {
        System.out.println(nome + " lancia rocce!");
    }
}