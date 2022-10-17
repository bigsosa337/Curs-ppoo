package asdasdasdasd;

public class Angajat extends  Persoana implements ICanEnrol,ICanSubmit{

    @Override
    public void faceCeva(String ceva) {
        System.out.println("Un angajat trimite" + ceva);
    }

    @Override
    public void inregistreaza() {
        System.out.println("Un angajat inregistreaza o aplicatie");
    }

    @Override
    public void trimite() {
        System.out.println("Un angajat trimite o solicitare");
    }

    public enum Categorie {PARTTIME, FULLTIME}


    private  String prenume;
    private Categorie categ;

    public Angajat(String id, String nume, String prenume, Categorie categ) {
        super(id, nume);
        this.prenume = prenume;
        this.categ = categ;
    }


    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public Categorie getCateg() {
        return categ;
    }

    public void setCateg(Categorie categ) {
        this.categ = categ;
    }

    @Override
    public String toString() {
        return "Angajat{" +
                "prenume='" + prenume + '\'' +
                ", categ=" + categ +
                ", id='" + id + '\'' +
                ", nume='" + nume + '\'' +
                '}';
    }
}
