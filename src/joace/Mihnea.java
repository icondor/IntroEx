package joace;

import ionel.Exp;

/**
 * Created by icondor on 22/04/2017.
 */
public class Mihnea {
    static String altul;
    int a;
    public static void main(String[] args)  {

        String myString = "attention: this is mihnea";

        Exp e = new Exp();
        boolean b = false;
        try {
            b = e.startsWithSomething("attention", altul);
        } catch (Exception e1) {
            e1.printStackTrace();
        }


//        Exp o = new Exp();
//        boolean c = o.startsWithSomething("attention", altul);
//
//        System.out.println("am gasit:"+c);



    }
}
