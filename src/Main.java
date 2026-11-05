public class Main {

    public static void main(String[] args) {

        Principessa p1 = new Principessa("Aurora");
        Principessa p2 = new Principessa("Biancaneve");

        Drago d1 = new SPF("Fiamma");
        Drago d2 = new SPG("Ghiacciolo");
        Drago d3 = new SPR("Roccia");

        Cavaliere c1 = new Cavaliere("Davide");
        Cavaliere c2 = new Cavaliere("San Giorgio");

        d1.imprigionaPrincipessa(p1);
        d2.imprigionaPrincipessa(p2);

        d1.usaPotere();
        d2.usaPotere();
        d3.usaPotere();

        c1.aggiungiAllievo(c2);

        c1.cacciaDrago(d1);
        c1.cacciaDrago(d2);
        c2.cacciaDrago(d3);
    }
}