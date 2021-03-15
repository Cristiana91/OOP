package generice;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainParcurgere {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Gabi");
        list.add("Alex");
        list.add("Vlad");
        //for clasic
        for (int i = 0; i < list.size(); i++){
            String nume = list.get(i);
            //System.out.println(nume);
            list.remove(nume);
            }
        System.out.println("------------------------------------");
        //for each
        for (String nume : list){
            if (nume.equals("Alex")){
                list.remove(nume);
            }else{
                System.out.println(nume);
            }
        }
        System.out.println("-----------------------------------");
        //iterator
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String nume = it.next();
            if (nume.equals("Alex")){
                //list.remove(nume);
                it.remove();
            }else {
                System.out.println(nume);
            }
        }


    }
}
