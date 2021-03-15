package generice;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();
        String gabi = "Gabi";
        lista.add(gabi);

        GenericBox<String, String> cutie = new GenericBox<>();
        GenericBox<Integer, String> cutieInteger = new GenericBox<>();

        cutie.add("Gabi");
        cutieInteger.add(2);
        cutieInteger.addKey("Gabi");

        int x = cutieInteger.getData();
        String nume = cutie.getData();

        GenericBox <Object, Object> nespecificatBox = new GenericBox<>();
    }
}
