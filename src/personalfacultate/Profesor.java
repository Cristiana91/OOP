package personalfacultate;

public class Profesor extends Persoana{

    private String specializare;

    public Profesor(String nume, String prenume, int varsta, String specializare) {
        super(nume, prenume, varsta);
        this.specializare = specializare;
    }

    public String getSpecializare() {
                return specializare;
    }

    public void setSpecializare(String specializare) {
        this.specializare = specializare;
    }
}
