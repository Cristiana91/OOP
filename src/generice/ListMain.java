package generice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Gabi");
        list.add("Alex");
        list.add("Vlad");

        //list.remove(2);
        list.add(1, "Mihai");
        for (String nume : list){
            System.out.println(nume);
        }

        List<String> linkedList = new LinkedList<>();

        Node<String> firstNode = new Node<>();
        firstNode.setData("Gabi");
        //System.out.println(firstNode.getData());
        //System.out.println(firstNode.getNextNode());

        Node<String> secondNode = new Node<>();
        secondNode.setData("Mihai");
        firstNode.setNextNode(secondNode);

        Node<String> thirdNode = new Node<>();
        thirdNode.setData("ALex");
        secondNode.setNextNode(thirdNode);

        Node<String> elem = firstNode;
        while (elem.getNextNode() != null){
            String data = elem.getData();
            System.out.println(data);
            elem = elem.getNextNode();
        }
        System.out.println(elem.getData());
    }
}
