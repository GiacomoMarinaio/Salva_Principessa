public class SPG extends Drago implements Runnable{

    public SPG(String nome) {
        super(nome);
    }

    @Override
    public String usaPotere() {
        return this.getNome() + "sta congelando il villaggio";
    }

    @Override
    public void run() {
        for(int i = 0; (i < 5) && !Thread.interrupted(); i++) {
            System.out.println(this.getNome() + "sputa ghiaccio nell'aria! Gioia immensa, al battito: " + (i + 1));
        }
    }
}