import java.util.Arrays;

public class AlternatePositiveNegative_I {
	
	public static void sort(int nums[])
	{
		int[] ans=new int[nums.length];
        int pos=0;
        int neg=1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<0)
            {
                ans[neg]=nums[i];
                neg=neg+2;
            }
            else
            {
                ans[pos]=nums[i];
                pos=pos+2;
            }
        }
        System.out.println(Arrays.toString(ans));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int nums[]= {3,1,-2,-5,2,-4};
sort(nums);
	}

}
