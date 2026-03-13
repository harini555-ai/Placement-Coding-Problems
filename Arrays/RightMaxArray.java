package Arrays;
import java.util.Arrays;
public class RightMaxArray {
    static int[] checkmax(int[] arr)
    {
        int rev[]=new int[arr.length];
        
        for(int i=0;i<arr.length;i++)
        {
           int rightmax=-1;
           for(int j=i+1;j<arr.length;j++)
           {
            rightmax=Math.max(rightmax,arr[j]);
           }
           rev[i]=rightmax;
        }
        return rev;
    }
 public static void main(String[] args) {
    int arr[]={2,4,5,3,1,2};
    int ans[]=checkmax(arr);
    System.out.print(Arrays.toString(ans));
 }   
}
