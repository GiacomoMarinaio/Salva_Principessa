import java.lang.reflect.Array;
import java.util.ArrayList;

public class Cavaliere {
    private String nome;
    private Cavaliere maestro;
    private ArrayList<Drago> draghiUccisi;

    public Cavaliere(String nome, Cavaliere maestro){
        this.nome = nome;
        this.maestro = maestro;
        this.draghiUccisi = new ArrayList<Drago>();
    }

    public void AggiungiDragoUcciso(Drago d){
        this.draghiUccisi.add(d);
    }

    public ArrayList<Drago> getDraghiUccisi(){
        return draghiUccisi;
    }
}
