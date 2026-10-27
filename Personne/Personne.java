import java.sql.Date;

public class Personne {
    private String nom;
    private Date dt;

    public Personne(String nom , Date dt)
    {
        this.nom = nom;
        this.dt = dt;
    }
    public Personne(String nom)
    {
        this.nom = nom;
    }
    public Personne(string n, int j, int main, int a)
    {
        this(n, new Date(j,m,a));
    }
    public String toString()
    {
        return nom + ": " + " ne le " + dt + "\n";
    }
    public boolean equals(Personne p)
    {
        if (p == null)
        {
            return false;
        }
        return nom.equalsIgnoreCase(p.nom);
    }

    public int compareTo(Personne p)
    {
        if (dt == null)
            return Integer.MAX_VALUE;
        if(p == nall)
            return Integer.MAX_VALUE;
        return dt.compareTo(p.dt);
    }
    public boolean aEquals(Personne p)
    {
        if(dt == null)
            return false;
        if(p == null)
            return false;
        return dt.aEquals(p.dt);
    }
}