public class SPR extends Drago {

    public SPR(String nome) {
        super(nome);
    }

    @Override
    public void usaPotere() {
        System.out.println(nome + " lancia rocce!");
    }
}