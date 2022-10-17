package asdasdasdasd;

public abstract class Persoana {


    protected String id;
    protected String nume;


    public Persoana(String id) {
        this.id = null;
        this.nume = null;
    }

    public Persoana(String id, String nume) {
        this.id = id;
        this.nume = nume;
    }

    public Persoana() {

    }

    public abstract void faceCeva(String ceva);
}
