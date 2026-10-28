public class Date {
	private int month;
	private int day;
	private int year;
	
	//definir les constructeur
	public Date(int day, int month, int year)
	{
		if (!isvalid(day, month, year))
		{
			System.err.println("Invalid date");
			System.exit(0);
		}
		this.month = month;
		this.day = day;
		this.year = year;
	}
	public Date(int year)
	{
		this(1,1,year);
	}
	
	public boolean isvalid(int d,int m,int y)
	{
		if(d < 1 || d > 31) return false;
		if(m < 1 || m > 12) return false;
		if(y < 0) return false;
		return true;
	}
	public int getday()
	{
		return this.day;
	}
	public int getmonth()
	{
		return this.month;
	}
	public int getyear()
	{
		return this.year;
	}
	

	
	public boolean isAfter(Date that)
	{
		return compareTo(that) > 0;
	}
	public boolean isBefore(Date that)
	{
		return compareTo(that) < 0;
	}
	public int compareTo(Date mohamed)
	{
		if (this.year < mohamed.year) return -1;
		if (this.year > mohamed.year) return 1;
		if (this.month < mohamed.month) return -1;
		if (this.month > mohamed.month) return 1;
		if (this.day > mohamed.day) return 1;
		if (this.day < mohamed.day) return -1;
		return 0;
	}
	
	@Override	//dir a le compilateur que je veux utilser une methode qui est deja dans le parons
	//c'est ona un faute d'ecriture dans toString va me donner un erreur (kayt3amel m3a toString bli machi methode 3adiya bli raha methode li deja kayna par defaut)
	
	public String toString()
	{
		return this.day + "/" + this.month + "/" + this.year;
	}
	public boolean aEquals(Date dt)
	{
		if (dt == null)
			return false;
		return year == dt.year;
	}

    public static void main(String[] args) {
        Date d1 = new Date(28, 10, 2026);
        Date d2 = new Date(2026);

        System.out.println("Date 1 : " + d1);
        System.out.println("Date 2 : " + d2);

        if (d1.isAfter(d2)) {
            System.out.println(d1 + " est après " + d2);
        } else {
            System.out.println(d1 + " est avant ou égale à " + d2);
        }
	}
}
