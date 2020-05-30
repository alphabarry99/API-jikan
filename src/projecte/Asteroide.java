package projecte;

public class Asteroide {

    public String nom;
    public String diam_km;

    public Asteroide(String nom, String diam_km) {
        this.nom = nom;
        this.diam_km = diam_km;
    }


    @Override
    public String toString() {
        return "Asteroide{" +
                "nom =" + nom +
                ", diàmetres en km = " + diam_km +
                '}';
    }
}