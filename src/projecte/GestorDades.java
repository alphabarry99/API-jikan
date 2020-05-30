package projecte;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
public class GestorDades {

    private DadesAPI dades;

    public GestorDades() {

        dades = new DadesAPI();
    }
    /**
     * Carrega des de l'API les dades dels complexes
     */
    public void carregarComplexes(){

        try {
            URL url = new URL("https://api.nasa.gov/neo/rest/v1/neo/browse?api_key=DEMO_KEY");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            JSONParser parser = new JSONParser();
            JSONObject jsonObject = (JSONObject) parser.parse(new InputStreamReader(connection.getInputStream()));
            JSONArray jsonArray = (JSONArray) jsonObject.get("near_earth_objects");
            for (int i = 0; i < jsonArray.size(); i++) {
                JSONObject asteroide = (JSONObject)jsonArray.get(i);
                JSONObject diametre = (JSONObject)asteroide.get("estimated_diameter");
                String nom = String.valueOf(asteroide.get("name"));
                String diam_km = String.valueOf(diametre.get("kilometers"));
                Asteroide ast = new Asteroide(nom, diam_km);
                dades.afegirAsteroide(ast);
            }
            connection.disconnect();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void mostrarComplexes()  {

        Interficie.mostrarMissatge(dades.getLlista());
    }

    /**
     * Desa les dades de l'API en un fitxer txt extern. Mètode de la UF3
     */
    public void desarDades(DadesAPI dades){

    }
    /**
     * Ordena el llista d'elements alfabéticament independenment de si el nom es troba en majúscules o minúscules. Mètode de la UF3
     */
    private void ordenarElements(){
    }

    /**
     * Afegeix un nou element a la llista. Es manté la ordenació alfabética
     */
    public void afegirElement(){
        //Crear un nou complex i afegir-lo a la llista
    }

    /**
     * Esborra un element a la llista. Si no es troba, es notificarà a l'usuari
     */
    public void esborrarElement(){
        //Es permetrà fer l'esborrat pel valor d'un atribut
    }

}
