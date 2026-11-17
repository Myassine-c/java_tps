import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.function.Function;



public class Employe implements Comparable<Employe>, Cloneable{
    private String code;
    private Double salaire;

    public String getCode(){return code;}
    public double getSalaire(){return salaire;}
    
    public Employe(String code,double salaire)
    {
        this.code = code;
        this.salaire = salaire;
    }
    @Override 
    public Employe clone()
    {
        try {
            return (Employe) super.clone();
        } catch (CloneNotSupportedException ex)
        {
            throw new AssertionError(ex);
        }
    }
    @Override 
    public int compareTo(Employe e)
    {
        return this.salaire.compareTo(e.salaire);
    }
}