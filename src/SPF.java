public class SPF extends Drago implements Runnable{
    public SPF(String nome) {
        super(nome);
    }

    @Override
    public String usaPotere() {
        return this.getNome() + "sta dando fuoco al villaggio";
    }


    @Override
    public void run() {
        for(int i = 0; (i < 5) && !Thread.interrupted(); i++) {
            System.out.println(this.getNome() + "sputa fuoco nell'aria! Gioia immensa, al battito: " + (i + 1));
        }
    }
}
