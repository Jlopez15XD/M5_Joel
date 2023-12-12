public class Main {
    public static void main(String[] args) throws Exception {
        int i;
        String [] cotxe = {"mercedes","BMW"};
        
        // crideu la vostra funció amb el vostre nom
        imp_NomAlumne("alumne principal");

        for(i=0; i < cotxe.length ; i++){
            System.out.println(cotxe[i]);
        }
        imp_nom2();
    }
    
    /*
     * He de crear la vostra pròpia funció ex: imp_Pep(String alumne){...}
     * Entrada: un String amb el vostre nom
     * Sortida: impressió del vostre nom pel terminal
     */
    public static void imp_NomAlumne(String alumne){
        alumne = "Joel";
        System.out.println("Els cotxes preferits de l'alumne " + alumne);
    }
    public static void imp_nom2 (){
        String alumne = "Joel";
        System.out.println(alumne);
        System.out.println(alumne);
    }
}

    





