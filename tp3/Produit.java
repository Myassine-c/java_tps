
import java.util.Objects;

public class Produit implements Comparable<Produit> {

    private String code;
    private Date dt;

    // Constructeur avec paramètres
    public Produit(String code, Date dt) {
        this.code = code;
        this.dt = dt;
    }

    // Constructeur sans paramètres
    public Produit() {
    }

    // Getter
    public Date getDt() {
        return dt;
    }

    public String getCode() {
        return code;
    }

    // equals
    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Produit other = (Produit) obj;

        return Objects.equals(this.code, other.code);
    }

    // toString
    @Override
    public String toString() {
        return "Produit [code=" + code + ", date=" + dt + "]";
    }

    // Comparer les produits selon leurs codes
    @Override
    public int compareTo(Produit other) {
        return this.code.compareTo(other.code);
    }

    // Vérifier si un produit est plus ancien
    public boolean plusAncien(Produit other) {
        return this.dt.isBefore(other.dt);
    }
}
