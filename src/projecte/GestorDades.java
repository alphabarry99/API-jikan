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
            URL url = new URL("https://do.diba.cat/api/dataset/puntesports/pag-ini/1/pag-fi/100/format/json");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            JSONParser parser = new JSONParser();
            JSONObject jsonObject = (JSONObject) parser.parse(new InputStreamReader(connection.getInputStream()));
            JSONArray jsonArray = (JSONArray) jsonObject.get("elements");
            for (int i = 0; i < jsonArray.size(); i++) {
                JSONObject complexEsportiu = (JSONObject) jsonArray.get(i);
                JSONObject dadesAdreca = (JSONObject) complexEsportiu.get("grup_adreca");
                String nom = String.valueOf(complexEsportiu.get("adreca_nom"));
                String municipi = String.valueOf(dadesAdreca.get("municipi_nom"));
                ComplexEsportiu ce = new ComplexEsportiu(nom, municipi);
                dades.afegirComplex(ce);
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
