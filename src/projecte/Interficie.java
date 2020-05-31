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
    public static void mostrarMenu(){
        String separador = "---------------------" + "\n";


        int resposta = 0;

        do {
            System.out.println("\n"+"Menú Principal:");
            System.out.println(separador);

            System.out.println("1. Carregar Dades");
            System.out.println("2. Mostrar Dades");
            System.out.println("3. Afegir Dades");
            System.out.println("4. Esborrar Dades");
            System.out.println("0. Sortir");
            System.out.print("Què voldria fer? ");
            Scanner sc = new Scanner(System.in);
            resposta = Integer.valueOf(sc.nextInt());

            GestorDades g = new GestorDades();

            switch (resposta){
                case 1:
                    System.out.println("Carregant Dades");
                    System.out.println(separador);
                    g.carregarAsteroides();
                    break;
                case 2:
                    System.out.println("Mostrant Dades");
                    System.out.println(separador);
                    Interficie.consultar();
                    break;
                case 3:
                    System.out.println("Afegint Dades");
                    System.out.println(separador);
                    break;
                case 4:
                    System.out.println("Esborrant Dades");
                    System.out.println(separador);
                    break;
                case 0:
                    System.out.println("Bye Bye");
                    break;
                default:
                    System.out.println("Escull una opció valida.");
                    System.out.println(separador);
            }
        }while (resposta != 0);
    }



    public static void consultar(){
        int resposta = 0;
        do{
            System.out.println("1. Consulta 1");
            System.out.println("2. Consulta 2");
            System.out.println("3. Consulta 3");
            System.out.println("0. Sortir");
            System.out.print("Què voldria fer? ");
            Scanner sc = new Scanner(System.in);
            resposta = Integer.valueOf(sc.nextInt());
            switch (resposta){
                case 1:
                    /*DadesAPI.getLlista();*/
                    break;
                case 2:
                    //gestorDades.consultar2();
                    break;
                case 3:
                    break;
                case 0:
                    System.out.println("Bye Bye!" + "\n");
                    break;
            }
        }while (resposta != 0 );
    }

    /**
     * Funció que encapsula un simple volcat d'informació per pantalla
     * @param missatge Missatge a mostrar per pantalla
     */
    public static void mostrarMissatge(String missatge){

    }
}
