import java.util.Arrays;

/**
 * Created by max on 09/03/17.
 */
public class Coda {
    private int[] cd;
    private int pointer;

    public Coda(int l) {
        cd = new int[l];
        pointer = cd.length-1;
    }

    public Coda() { this(0); }

    public boolean is_empty() { return cd.length == 0; }
    public void inserisci(int i) {
        int[] temp = new int[cd.length+1];
        temp[0] = i;
        System.arraycopy(cd, 0, temp, 1, cd.length);
        cd = temp;
    }
    public int estrai() throws Coda_Vuota_Exception {
        if(is_empty()) throw new Coda_Vuota_Exception();
        int res = cd[cd.length-1];
        cd = Arrays.copyOf(cd, cd.length-1);
        return res;
    }
}
