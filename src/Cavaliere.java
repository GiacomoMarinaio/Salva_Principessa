import java.util.ArrayList;

public class Cavaliere {

    private String nome;
    private ArrayList<Drago> draghiUccisi;
    private ArrayList<Cavaliere> allievi;
    private Cavaliere maestro;

    public Cavaliere(String nome) {
        this.nome = nome;
        this.draghiUccisi = new ArrayList<>();
        this.allievi = new ArrayList<>();
        this.maestro = null;
    }

    public String getNome() {
        return nome;
    }

    public void aggiungiAllievo(Cavaliere c) {
        if (c != null && c != this && c.maestro == null) {
            allievi.add(c);
            c.maestro = this;
        }
    }

    public void cacciaDrago(Drago d) {
        if (d != null && d.isVivo()) {

            d.assegnaCavaliere(this);

            if (draghiUccisi.contains(d)) {
                return;
            }

            d.uccidi();
            draghiUccisi.add(d);

            System.out.println(nome + " ha ucciso " + d.getNome());
        }
    }
}