package generice;

public class GenericBox<TYPE, Key> {

    private TYPE data;
    private Key keyData;

    public void add(TYPE dataToBeAdded){
        this.data = dataToBeAdded;
    }

    public void addKey(Key keyData){
        this.keyData = keyData;
    }

    public TYPE getData() {
        return data;
    }

    public Key getKeyData() {
        return keyData;
    }
}
