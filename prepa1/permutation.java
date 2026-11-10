public void swap(String str, int l,int r)
{
    char temp;
    temp = l;
    l = r;
    r = temp;
}
private void permutation(String str, int l, int r)
{
    if (l == r)
    {
        System.out.println(str);
    }
    else
    {
        for(int i = l; i<=r ;i++)
        {
            str = swap(str, l, i); 
            permutation(str, l + 1, i);
            str = swap(str, l, i);
        }
    }
}