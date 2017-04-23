package joace;

import ionel.Exp;
import ionel.NuiVoieMama;

/**
 * Created by icondor on 22/04/2017.
 */
public class MihneaNuivoiemama {
    static String altul;
    int a;
    public static void main(String[] args) {

        String s = "mama";

       Exp obiect = new Exp();
        boolean gasit = false;
        try {
            gasit = obiect.AstartsWithSomething("attention", s);
        } catch (NuiVoieMama nuiVoieMama) {
            nuiVoieMama.printStackTrace();
        }

        System.out.println(gasit);

        System.out.println("aici ajunge oricum");


    }
}
