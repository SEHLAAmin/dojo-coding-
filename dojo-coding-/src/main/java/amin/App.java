package amin;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    public static String TestLettreRomain(int nombre) {
        String nombrEnLettre=""; 
        if (nombre == 1 ) {
            nombrEnLettre = "I";

        }
        return nombrEnLettre;
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
