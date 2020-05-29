package projecte;

public class Interficie {
    /**
     * Mostra per pantalla tots els usuaris que han utilitzat la nostra aplicació
     * @param llistat paràmetre que conté tots els usuaris que han consultat la nostra aplicació
     */
    public static void mostrarUsuaris(String[] llistat){

    }

    /**
     * Mostra informació que hagis recuperat de la teva API
     * @param dades Array d'string amb informació
     */
    public static void mostrarDades(String[] dades){

    }

    /**
     * Funció que mostra per pantalla les diferents opcions que formen el menú
     * que es rep com a paràmetre. La primera posició de l'array menú és el
     * títol del mateix mentre que la resta són les opcions. Aquesta variable
     * ja ve inicialitzada des del codi que en fa la crida.
     * @param menu Conté les diferents opcions que es mostraran per pantalla a
     * l'usuari.
     */
    public static void mostrarMenu(String[] menu){
        while (!ordre.equalsIgnoreCase("x")) {
            System.out.println("\033[0;1m" + "MENÚ DEL JOC " );
            System.out.println("1-Carregar Dades    [1]");
            System.out.println("2-Consultar         [2]");
            System.out.println("3-Afegir            [3]");
            System.out.println("4-Esborrar          [4]");
            System.out.println("0-Sortir            [0]");
            ordre = sc.next();

            System.out.println("_______________________________________________");
            System.out.println("");

    }

    /**
     * Funció que encapsula un simple volcat d'informació per pantalla
     * @param missatge Missatge a mostrar per pantalla
     */
    public static void mostrarMissatge(String missatge){

    }



}
