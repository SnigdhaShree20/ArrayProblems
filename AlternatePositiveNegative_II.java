import java.util.ArrayList;
import java.util.Arrays;

public class AlternatePositiveNegative_II {

	public static void sort(int[]nums)
	{
		
		ArrayList<Integer>neg=new ArrayList<>();
		ArrayList<Integer>pos=new ArrayList<>();
		
		
		
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]<0) {
			neg.add(nums[i]);
			}
			else
				pos.add(nums[i]);
		}
		if(neg.size()<pos.size())
		{
			for(int i=0;i<neg.size();i++)
			{
				nums[2*i]=neg.get(i);
				nums[2*i+1]=pos.get(i);
			}
			int index=neg.size()*2;
			for(int i=neg.size();i<pos.size();i++)
			{
				nums[index++]=pos.get(i);
			}
		}
		else
		{
			for(int i=0;i<pos.size();i++)
			{
				nums[2*i]=pos.get(i);
				nums[2*i+1]=neg.get(i);
			}
			int index=pos.size()*2;
			for(int i=pos.size();i<neg.size();i++)
			{
				nums[index++]=neg.get(i);
			}
		}
		System.out.println(Arrays.toString(nums));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int nums[]= {-1,9,4,-8,6,-3,-4,-2};
sort(nums);
int nums1[]= {1,9,4,-8,6,-3,-4,2};
sort(nums1);
	}

}
