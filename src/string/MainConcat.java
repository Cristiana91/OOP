package string;

public class MainConcat {
    public static void main(String[] args) {

        String cuvant = "Gabi";
        String spatiu = " ";
        String verb = "merge";

        String propozitie = cuvant + "\n" + spatiu + verb;

        if (propozitie.contains("Gabi")){
            System.out.println("Il are pe Gabi.");
        }

        if (propozitie.toLowerCase().contains("gabi")){
            System.out.println("Il are pe Gabi.");
        }
        System.out.println(propozitie);
    } 
}
