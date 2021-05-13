public class Dutch_National_Flag_Algorithm
{
    public static void sort012(int[] arr)
    {
        //Write your code here
        int n = arr.length;
        // we Use three pointers here! 
        int i = 0; // starting pointer
        int j = 0; // mid pointer
        int k = n-1; // end pointer
        int temp = 0 ;// temp variable used in swaping the values
            while(j<=k)
            {
                switch(arr[j]) {
                    case 0:
                        {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        i++;
                        j++;
                        break;
                        }
                    case 1:
                        {
                            j++;
                            break;
                        }
                    case 2:
                        {
                            temp = arr[j];
                            arr[j] = arr[k];
                            arr[k] = temp;
                            k--;
                            break;
                            
                        }

                }
            }
    }
}