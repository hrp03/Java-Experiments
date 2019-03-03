class SortFromOne
{
    public static void main(String args[])
    {
        int a[] = { 10, 2, 3, 6, 9, 4, 5, 1, 8, 7};

        int[] b = new int[a.length];

        for(int i = 0; i < a.length; i++)
        {
            int l = 10 - a[i]
            b[l] = a[i];
        }

        for(int i = 0; i < b.length; i++)
        {
            System.out.print(" " +b[i]);
        }
    }
    
}