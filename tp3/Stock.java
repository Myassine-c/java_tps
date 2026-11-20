import java.util.LinkedList;
public class Stock extends LinkedList<Produit>{

    @Override
    public boolean add(Produit e)
    {
        int i = indexOf(e);
        if (i == -1)
            return super.add(e);
        return true;
    }
    public Produit lePlusAncien()
    {
        if (isEmpty())
            return null;
        Produit m = get(0);
        for (Produit x:this)
        {
            if (x.plusAncien(m))
                m = x;
        }
        return m;
    }
    public Stock sontPerimes(Date d){
        if (isEmpty())
            return null;
        Stock perimes = new Stock();
        Produit ref = new Produit("",d);
        for (Produit p : this)
        {
            if (p.plusAncien(ref))
                perimes.add(p);
        }
        return perimes;
    }
}