public abstract class Drago {
    protected String nome;
    protected Principessa principessa;
    protected Cavaliere cacciatore;
    protected boolean vivo;

    public Drago(String nome) {
        this.nome = nome;
        this.principessa = null;
        this.cacciatore = null;
        this.vivo = true;
    }

    public String getNome() {
        return nome;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void imprigionaPrincipessa(Principessa p) {
        if (principessa == null && p != null && !p.isImprigionata()) {
            principessa = p;
            p.setImprigionata(true);
        }
    }

    public void assegnaCavaliere(Cavaliere c) {
        if (cacciatore == null) {
            cacciatore = c;
        }
    }

    public abstract void usaPotere();

    public void uccidi() {
        vivo = false;

        if (principessa != null) {
            principessa.setImprigionata(false);
            principessa = null;
        }
    }
}