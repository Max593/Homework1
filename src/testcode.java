/**
 * Created by max on 09/03/17.
 */
public class testcode {
    public static void main(String[] args) {
        Coda c = new Coda();
        if(c.is_empty()) { System.out.println("coda inizialmente vuota"); }
        try {
            c.inserisci(7);
            c.inserisci(9);
            System.out.println(c.estrai());
            c.estrai();
            c.estrai();
        }
        catch(Coda_Vuota_Exception e) {
            System.out.println("eccezione catturata!");
        }
    }
}
