public class NewSort {
    public static void sel_sort(int arr[])
    {
        for(int i=0;i<(arr.length-1);i++)
            {
                int w=i;
                for(int j=i+1;j<(arr.length);j++)
                    if(arr[j]<arr[w])
                        w=j;
                    int sw=arr[w];
                    arr[w]=arr[i];
                    arr[i]=sw;
            }
        
    }

    public static void main(String[] args) 
    {
        int[] arr=new int[]{23,56,12,9,77,56,34,5,45,34};
        sel_sort(arr);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");

    }

}


//MERGED