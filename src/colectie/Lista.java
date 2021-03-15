package colectie;

public class Lista {

    private Produs[] produse = new Produs[20];
    private int index = 0;


    public void addProdus(Produs produs){
        produse[index] = produs;
        index++;
    }

    public void removeProdus(Produs deleteProdus){
        int foundProdus = 0;
        for (int i = 0; i < produse.length; i++) {
            Produs prod = produse[i];
            if (prod != null) {
                if (prod.equals(deleteProdus)) {
                    foundProdus = i;
                }
            }
        }
        for (int i = foundProdus; i < produse.length - 1; i++){
            produse[i] = produse[i + 1];
        }
        index--;
    }

    public Produs get(int index){
        return produse[index];
    }

    public Produs[] getProduse() {
        return produse;
    }

    public void setProduse(Produs[] produse) {
        this.produse = produse;
    }

    public int getSize() {
        return index;
    }

}
