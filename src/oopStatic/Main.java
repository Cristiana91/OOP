package oopStatic;

public class Main {
    public static void main(String[] args) {

        User userMihai = new User();
        userMihai.setNume("Mihai");

        User userGabi = new User();
        userGabi.setNume("Gabi");

        System.out.println(userMihai.getNume());
        System.out.println(userGabi.getNume());

        Cerc cerc1 = new Cerc();
        Cerc cerc2 = new Cerc();
    }
}
