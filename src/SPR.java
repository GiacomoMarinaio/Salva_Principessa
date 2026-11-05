public class SPR extends Drago implements Runnable{

    public SPR(String nome) {
        super(nome);
    }

    @Override
    public String usaPotere() {
        return this.getNome() + "sta lanciando massi al villaggio";
    }

    @Override
    public void run() {
        for(int i = 0; (i < 5) && !Thread.interrupted(); i++) {
            System.out.println(this.getNome() + "sputa massi nell'aria! Gioia immensa, al battito: " + (i + 1));
        }
    }
}