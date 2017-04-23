package ionel;

/**
 * Created by icondor on 22/04/2017.
 */
public class Exp {

    private String defaultKey;


//    protected Exp() {
//
//        defaultKey="news alert";
//    }
//    public Exp(String defaultKey) {
//       this.defaultKey=defaultKey;
//    }

    public static void main(String[] args) {


        String sentence="this is great, what do you think?";
        String s = "attention: this is a great opportunity";

        Exp e = new Exp();
       // boolean result = e.startsWithSomething("attention",s);
        //System.out.println(result);
    }


    /*
    *vvggb xgs dsdgdhfh xch
    *dgdfgsd fhfdghsdg  xdghdfg adsfjdsfsdhd
    *sdhfdfhsd

     */

    public boolean startsWithSomething(String something, String sentence) throws Exception
    {
        boolean found=false;

        if(sentence==null)
            throw new Exception("nu-i voie ma null");

        if(sentence.startsWith(something))
            found=true;
        return found;
    }

    public boolean AstartsWithSomething(String something, String sentence) throws NuiVoieMama

    {
        boolean found=false;

        if(sentence.equals("mama"))
            throw new NuiVoieMama();

        if(sentence.startsWith(something))
            found=true;
        return found;
    }

    public boolean endsWith(String something, String sentence)
    {
        boolean found=false;
        if(sentence.endsWith(something))
            found=true;
        return found;
    }


}
