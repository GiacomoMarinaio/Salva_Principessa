public class SPF extends Drago implements Runnable {
    public SPF(String nome) {
        super(nome);
    }
    @Override
    public void run() {
        for (int i = 0; (i < 5) && !Thread.interrupted(); i++) {
            System.out.println(this.getNome()+
                    " sputa fuoco e si libra nell'aria! Gioia immensa, al battito "+(1+i));
        }
    }
}