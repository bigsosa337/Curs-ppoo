package asdasdasdasd;

public class Student  extends Persoana implements ICanEnrol, ICanSubmit{
    public Student(String id) {
        super(id);
    }

    public Student(String id, String nume) {
        super(id, nume);
    }

    @Override
    public void faceCeva(String ceva) {
        System.out.println("Un student trimite" + ceva);
    }

    @Override
    public void inregistreaza() {
        System.out.println("Un student inregistreaza o aplicatie");

    }

    @Override
    public void trimite() {
        System.out.println("Un student trimite o tema");

    }


    private  final  int anStudiu = 1;
    protected int varsta;
    float medie;
    static int nr = 0;

    public static int numarStud()
    {
        return Student.nr;
    }

    public Student(String id, String nume, int varsta, float medie) {
        super(id, nume);
        this.varsta = varsta;
        this.medie = medie;
        nr++;
    }
    public Student() {
        super();
        this.varsta = 0;
        this.medie = 0.0f;
        nr++;
    }

    public Student(Student s)
    {
        super(s.id, s.nume);
        this.varsta = s.varsta;
        this.nume = s.nume;
        nr++;
    }

    public int getAnStudiu() {
        return anStudiu;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public float getMedie() {
        return medie;
    }

    public void setMedie(float medie) {
        this.medie = medie;
    }

    public static int getNr() {
        return nr;
    }

    public static void setNr(int nr) {
        Student.nr = nr;
    }

    @Override
    public String toString() {
        return "Student{" +
                "anStudiu=" + anStudiu +
                ", varsta=" + varsta +
                ", medie=" + medie +
                ", id='" + id + '\'' +
                ", nume='" + nume + '\'' +
                '}';
    }
}
