package colectie;

import java.util.ArrayList;

public class MainArrayList {
    public static void main(String[] args) {

        ArrayList<Produs> lista = new ArrayList<>();
        Produs mere = new Produs();
        mere.setNume("Mere");
        lista.add(mere);

        Produs pere = new Produs();
        pere.setNume("Pere");
        lista.add(pere);

        Produs ananas = new Produs();
        ananas.setNume("Ananas");
        lista.add(ananas);

        lista.remove(pere);

        for (int i = 0; i < lista.size(); i++) {
            Produs prodDinLista = lista.get(i);
            System.out.println(prodDinLista.getNume());
        }
    }
}
