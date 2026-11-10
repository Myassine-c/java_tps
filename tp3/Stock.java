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
            if (x.estAncien(m))
                m = x;
        }
        public Stock sontPerimes(Date d){
            Produit ref = new Produit("",d);
            if (isEmpty())
                return null;
                        
        }
    }

    
}