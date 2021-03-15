package gestiuneproduse;

public class Fruct extends Produs{

    private boolean bio; // = false

    public Fruct(String nume, double pret, String producator) {
        super(nume, pret, producator);
    }

    @Override
    public String getCategorie() {
        return "Fruct";
    }

    public boolean isBio() {
        return bio;
    }

    public void setBio(boolean bio) {
        this.bio = bio;
    }
}
