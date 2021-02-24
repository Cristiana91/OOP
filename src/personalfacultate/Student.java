package personalfacultate;

public class Student extends Persoana{

    private int anCurent;

    public Student(String nume, String prenume, int varsta, int anCurent){
        super(nume, prenume, varsta);
        this.anCurent = anCurent;
        System.out.println("Studentul s-a creat");
    }

    public void schimbaNume(String numeNou){
        super.setNume(numeNou);
    }

    public void setAnCurent(int anCurent) {
        this.anCurent = anCurent;
    }

    public int getAnCurent() {
        return anCurent;
    }
}
