package personalfacultate;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("Ionescu", "Gabriel", 27, 1);
        student.schimbaNume("Popescu");

        Profesor profesor = new Profesor("Popescu", "Ion", 30, "Engleza");

        Persoana persoana = new Persoana("Alex", "Vlad", 23);

        // polimorfism
        // afisarePersoana(persoana);
        // afisarePersoana(student);
        // afisarePersoana(profesor);

        Persoana[] persoane = new Persoana[5];
        persoane[0] = persoana;
        persoane[1] = profesor;
        persoane[2] = student;
        System.out.println();

        for (int i = 0; i < persoane.length; i++) {
            Persoana per = persoane[i];
            if (per != null) {
                afisarePersoana(per);
            }
        }
    }

    public static void afisarePersoana(Persoana persoana){
        String nume = persoana.getNume();
        String prenume = persoana.getPrenume();
        System.out.println(nume + " " + prenume);
    }
}
