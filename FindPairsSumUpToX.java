import java.util.HashMap;

public class FindPairsSumUpToX {
	
	public static void find(int[]arr,int sum)
	{
		HashMap<Integer,Integer>hm= new HashMap<>();
		int ans=0;
		for(int i=0;i<arr.length;i++)
		{int b=sum-arr[i];
			if(hm.containsKey(b))
			{
				ans+=hm.get(arr[b]);//add frequency of the element
			}
			hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
		}
		System.out.println(ans);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,3,4,5,6,7};
find(arr,8);
	}

}
