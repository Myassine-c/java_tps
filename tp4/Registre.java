import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.function.Function;


public final class Registre extends LinkedList<Employer>
{
    public Registre(File f) throws FileNotFoundException
    {
        Scanner fichier = new Scanner(File f);
        while (fichier.hasNext()) {
            String c = fichier.nextString();
            double S = fichier.nextDouble();
            this.add(new Employe(c,S));
        }


    }
    @Override 
    public boolean add(Employe e)
    {
        return super.add(e);
    }
    @Override 
    public boolean reverse(String code)
    {
        for(Employe x: this)
        {
            if(x.getCode().equals(code))
                return super.remove(x);
        }
        return false;
    }

    public Registre clone()
    {
        Registre r = (Registre)super.clone();
        for(int i = 0; i < size(); i++) r.set(i, r.get(i), clone());
        return r;
    }
    
}