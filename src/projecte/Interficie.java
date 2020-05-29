package projecte;

import java.util.Scanner;

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
<<<<<<< HEAD
        System.out.println("Ecolliu una opció");

        int resposta = 0;

        do {
            System.out.println("1. Carregar Dades");
            System.out.println("2. Mostrar Dades");
            System.out.println("3. Afegir Dades");
            System.out.println("4. Esborrar Dades");
            System.out.println("0. Sortir");
=======
        while (!ordre.equalsIgnoreCase("x")) {
            System.out.println("\033[0;1m" + "MENÚ DEL JOC " );
            System.out.println("1-Carregar Dades    [1]");
            System.out.println("2-Consultar         [2]");
            System.out.println("3-Afegir            [3]");
            System.out.println("4-Esborrar          [4]");
            System.out.println("0-Sortir            [0]");
            ordre = sc.next();
>>>>>>> 7985ff33d3c3612326afabbf3990bc43cd7880ed

            Scanner sc = new Scanner(System.in);
            resposta = Integer.valueOf(sc.nextInt());

            switch (resposta){
                case 1:
                    System.out.println("Carregant Dades");
                    break;
                case 2:
                    System.out.println("Mostrant Dades");
                    break;
                case 3:
                    System.out.println("Afegint Dades");
                    break;
                case 4:
                    System.out.println("Esborrant Dades");
                    break;
                default:
                    System.out.println("Escull una opció valida.");
            }
        }while (resposta != 0);
    }

    /**
     * Funció que encapsula un simple volcat d'informació per pantalla
     * @param missatge Missatge a mostrar per pantalla
     */
    public static void mostrarMissatge(String missatge){

    }



}
