
package projecte;

import java.util.ArrayList;

public class DadesAPI {

    private ArrayList<Asteroide> l;

    public DadesAPI() {
        l = new ArrayList<>();
    }

    public ArrayList<Asteroide> getL1() {
        return l;
    }

    public void afegirAsteroide(Asteroide ast) {
        l.add(ast);
    }
    public void esborrarAsteroide(Asteroide ast) {
        l.remove(ast);
    }

    public String getLlista() {
        StringBuilder sb = new StringBuilder();
        for (Asteroide ast : l) {
            sb.append(ast);
            sb.append("\n");
        }
        return sb.toString();
    }
}