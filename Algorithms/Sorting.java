class Sorting
{
    void bubbleSort(int[] arr)
    {
        for (int i = 0; i < arr.length - 1; i++)
        {
            for (int j = 0; j < arr.length - i - 1 ; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.print("Traversal of Bubble Sort" + i + ": [ ");
            for (int j = 0; j < arr.length; j++)
            {
                System.out.print(arr[j] + ", ");
            }
            System.out.println("]");
        }
        System.out.println("Output of Bubble Sort: ");
        for (int i = 0; i < arr.length; ++i)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    void insertionSort(int[] arr)
    {
        for (int i = 1; i < arr.length; i++)
        int key = arr[i];
        {
            int j = i - 1;
            while ( j > 0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    void selectionSort(int[] arr)
    {

    }

    public static void main(String[] args)
    {
        Sorting sort = new Sorting();
        int[] array = {5,85,2,4,88,90,3,1,0};
        sort.bubbleSort(array);
        sort.insertionSort(array);
        sort.selectionSort(array);
    }
}