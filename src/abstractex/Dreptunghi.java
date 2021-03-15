package abstractex;

public class Dreptunghi implements Desenabil, Construibil, FormaGeometrica {

    private double lat;
    private double lun;

    @Override
    public double calculeazaAria() {
        return lat * lun;
    }

    @Override
    public double calculeazaPerimetru() {
        return 2 * lat + 2 * lun;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLun() {
        return lun;
    }

    public void setLun(double lun) {
        this.lun = lun;
    }

    @Override
    public void deseneaza(String color) {
        System.out.println("Se deseneaza dreptunghiul cu culoarea " + color);
    }

    @Override
    public void construieste(String nume) {
        System.out.println("Se construieste dreptunghiul " + nume);
    }
}
