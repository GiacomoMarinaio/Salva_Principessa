import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //StringBuilder storia = new StringBuilder();
        ArrayList<Thread> dragos = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            Thread t = new Thread(new SPF(String.valueOf(i)));
            dragos.add(t);
        }
        Thread giorgieziocity = new Thread(new Cavaliere("San Giorgio",dragos.get(1)));
        for(Thread t:dragos){
            t.start();
        }
        System.out.println("I draghi sono partiti per distruggere i villaggi");
        giorgieziocity.start();
        System.out.println(giorgieziocity.getName() + "");
    }
}