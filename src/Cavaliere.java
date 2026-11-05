import java.util.ArrayList;

public class Cavaliere implements Runnable{

    private String nome;
    private Thread dragodaUccidere;
    private ArrayList<Thread> draghiUccisi;
    private ArrayList<Cavaliere> allievi;
    private Cavaliere maestro;

    public Cavaliere(String nome, Thread dragodaUccidere) {
        this.nome = nome;
        this.dragodaUccidere= dragodaUccidere;
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

            System.out.println(nome + " ha ucciso " + d.getNome());
        }
    }

    @Override
    public void run() {
        for (int i = 0; (i < 10) && (!dragodaUccidere.isInterrupted()); i++) {
            try {
                Thread.sleep(5);
                dragodaUccidere.interrupt();
                draghiUccisi.add(dragodaUccidere);
                System.out.println("il cacciatore " + nome + " sta lanciando il dardo = " + i);
            } catch (InterruptedException e) {
                System.out.println("sleep error nel main: " + e);
            }

        }
    }
}