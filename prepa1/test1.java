
public class test1 {
    public static void main(String[] args) 
    {
        int[] tab2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0 ; i < tab2.length ;i++)
        {
            System.out.println(tab2[i]);
        }
        
        // echanger(tab2, 0, 1);
        // for (int i = 0; i < tab2.length; i++) {
        //     System.out.println(tab2[i]);
        // }

        //teste de fonction copie
        int[] tab = {1,2,3,4,532,987,7,8,9,10};
        int[] result = copier(tab);
        System.out.println("copier de tab est :");
        for (int i = 0; i < 10; i++) {
            System.out.print(result[i] + "\t");
        }
        //teste de copie version de prof
        int[] tab3 = new int[10];
        copy(tab3,tab2, 0, 9);
        System.out.print("\ncopier de tab2 dans tab3 de prof est :\n");
        for (int i = 0; i < 10; i++) {
            System.out.print(tab3[i]+ "\t");
        }
    }
    public static void copy(int[] a,int[] aux, int deb, int fin)
    {
        for (int i = deb; i <= fin; i++)
        {
            a[i] = aux[i];
        }
    }

    public static int plusPetit(int a, int b)
    {
        if (a < b) return a;
        else return b;
    }  
    public static void echanger(int[] tab, int i, int j)
    {
        int temp;
        temp = tab[i];
        tab[i] = tab[j];
        tab[j] = temp;
    }
    
    public static int[] copier(int[] tab)
    {
        int[] copie = new int[tab.length];
        for (int i = 0; i < tab.length ; i++)
        {
            copie[i] = tab[i];
        }
        return copie;
    }
}
