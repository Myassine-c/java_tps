import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.function.Function;



public class Employe {
    private String code;
    private double salaire;

    public String getCode(){return code;}
    public double getSalaire(){return salaire;}
    
    public Employe(String code,double salaire)
    {
        this.code = code;
        this.salaire = salaire;
    }
    
}
