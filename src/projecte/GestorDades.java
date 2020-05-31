package projecte;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
public class GestorDades {

    static DadesAPI dades;

    public GestorDades() {

        dades = new DadesAPI();
    }
    /**
     * Carrega des de l'API les dades dels asteroides de la Nasa
     */
    public static void carregarAsteroides(){

        try {
            URL url = new URL("https://api.nasa.gov/neo/rest/v1/neo/browse?api_key=DEMO_KEY");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            JSONParser parser = new JSONParser();
            JSONObject jsonObject = (JSONObject) parser.parse(new InputStreamReader(connection.getInputStream()));
            JSONArray jsonArray = (JSONArray) jsonObject.get("near_earth_objects");
            for (int i = 0; i < jsonArray.size(); i++) {
                JSONObject asteroide = (JSONObject)jsonArray.get(i);
                JSONObject diametre = (JSONObject) asteroide.get("estimated_diameter");
                JSONObject diam_km = (JSONObject) diametre.get("kilometers");
                String nom = String.valueOf(asteroide.get("name"));
                String min_diam_km = String.valueOf(diam_km.get("estimated_diameter_min"));
                String max_diam_km = String.valueOf(diam_km.get("estimated_diameter_max"));
                System.out.println("Nom: " + nom);
                System.out.println("Diàmetre mínim en KM: : " + min_diam_km);
                System.out.println("Diàmetre màxim en KM: : " + max_diam_km + "\n");
                Asteroide ast = new Asteroide(nom, min_diam_km, max_diam_km);
                /*dades.afegirAsteroide(ast);*/

            }
            connection.disconnect();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void mostrarAsteroides()  {

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
