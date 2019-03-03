class MergeSort()
{
    public static void main(String args[])
    {
        int a[] = { 10, 2, 3, 6, 9, 4, 5, 1, 8, 7};
    }
    
    private void sort(int array[], int a, int b)
    {
        if(a < b)
        {
            int m = a + (b-a)/2;
            sort(array, a, m);
            sort(array, m+1, b);
            mergealgo(array,a,m,b);
        }
    }

    private void mergealgo(int array[], int a, int m, int b)
    {
        int i, j, k;
        
        int h1 = m - a + 1;
        int h2 = b - a;
        
        int left[h1];
        int right[h2];
        
        for(int i = 0; i < h1; i++)
        {
            left[i] = array[a + 1];
        }
        
        
        for(int i = 0; i < h2; i++)
        {
            right[i] = array[m + 1 + i];
        }
        
        i = 0; j = 0; k = a;
        
        while(i < h1 && j < h2)
        {
            if(left[i) <= right[j])
            {
                array[k] = left[i]; i++;
            }
            else
            {
                array[k] = right[j];
                j++;
            }
        }
        
        while(i < h1)
        {
            array[k] = left[i];
            i++;k++;
        }
        
        while(j < h2)
        {
            array[k] = right[j];
            j++;k++;
        }
    }
}