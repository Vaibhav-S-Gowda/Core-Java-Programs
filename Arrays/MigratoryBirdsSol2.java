public class MigratoryBirdsSol2
{
    static int birds(int[] arr)
    {
        int[] numOfBirds = new int[6]; //Length is 6 because the type of birds will always be five
        for(int i = 0; i < arr.length; i++) // Loops is to find the frequency of occurrences
        {
            numOfBirds[arr[i]]++;
        }
        int maxIndex = 0,max = -1;
        for(int i = 1; i < numOfBirds.length; i++)
        {
            if(numOfBirds[i]>max)
            {
                max = numOfBirds[i];
                maxIndex = i;   
            }
        }
        return maxIndex;
    }
    public static void main(String...args)
    {
        int[] array = {1,4,3,1,4,2,4,2,4,5,2,4};
        System.out.println(birds(array));
    }
}