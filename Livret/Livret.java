public class Livret {
	private int dim,der = -1;
	private Personne[] cont;
	
	public Livret(int dim)
	{
		this.dim = dim;
		cont = new Personne[dim];
		
	}
	public boolean plein()
	{
		return der = dim - 1; 
	}
	public void ajouter(Personne p)
	{
		assert !plein();
		der++;
		cont[der] = p;
	}
	public int localiser(String nom)
	{
		Personne p= new Personne(nom);
		for (int i = 0; i <= der ;i++)
		{
			if(p.equals(cont[i]))
			{
				return i;
			}
		}
		return -1;
	}
	public Livret mAnnee(int annee)
	{
		Date dt = new Date(annee);
		Personne p = new Personne("",dt);
		Livret lv = new Livret(dim);
		for (int i = 0; i <= der ; i++)
		{
			if (cont[i].equals(p))
				lv.ajouter(cont[i]);
		}
		return lv;
	}
}

