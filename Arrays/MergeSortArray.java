import java.util.Arrays;

class MergeSortArray
{
    public int[] sorted(int[] a1, int[] a2)
    {
        int[] sortedResult = new int[a1.length + a2.length];
        Arrays.sort(a2);
        int a = 0, i = 0, j = 0;
        while(i < a1.length && j < a2.length)
        {
            if (a1[i] <= a2[j])
            {
                sortedResult[a++] = a1[i++];
            }
            else
            {
                sortedResult[a++] = a2[j++];
            }
        }
        while(i < a1.length)
        {
            sortedResult[a++] = a1[i++];
        }
        while(j < a2.length)
        {
            sortedResult[a++] = a2[j++];
        }
        return sortedResult;
    }
    public static void main(String...args)
    {
        MergeSortArray obj = new MergeSortArray();
        int[] arr1 = {2,3,4,7,10};
        int[] arr2 = {1,2,4,5,6,7,8,3,9,11,50};
        System.out.println(Arrays.toString(obj.sorted(arr1 ,arr2 )));
    }
}