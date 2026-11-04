public class Principessa {
    private String nome;
    private boolean imprigionata;

    public Principessa(String nome) {
        this.nome = nome;
        this.imprigionata = false;
    }

    public String getNome() {
        return nome;
    }

    public boolean isImprigionata() {
        return imprigionata;
    }

    public void setImprigionata(boolean imprigionata) {
        this.imprigionata = imprigionata;
    }
}