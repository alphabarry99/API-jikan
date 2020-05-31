package projecte;

public class Asteroide {

    public String nom;
    public String min_diam_km;

    public Asteroide(String nom, String min_diam_km) {
        this.nom = nom;
        this.min_diam_km = min_diam_km;
    }


    @Override
    public String toString() {
        return "Asteroide{" +
                "nom =" + nom +
                ", diàmetres en km = " + min_diam_km +
                '}';
    }
}