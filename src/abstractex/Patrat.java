package abstractex;

public class Patrat implements FormaGeometrica {

    private double lun;

    @Override
    public double calculeazaAria() {
        return lun * lun;
    }

    @Override
    public double calculeazaPerimetru() {
        return 4 * lun;
    }

    public double getLun() {
        return lun;
    }

    public void setLun(double lun) {
        this.lun = lun;
    }
}
