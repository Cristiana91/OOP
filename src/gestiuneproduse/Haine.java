package gestiuneproduse;

public class Haine extends Produs {

    private String marime;

    public Haine(String nume, double pret, String producator) {
        super(nume, pret, producator);
    }

    @Override
    public String getCategorie() {
        return "Haine";
    }

    public String getMarime() {
        return marime;
    }

    public void setMarime(String marime) {
        this.marime = marime;
    }

    @Override
    public String getNume() {
        return "Hasine " + super.getNume();
    }
}
