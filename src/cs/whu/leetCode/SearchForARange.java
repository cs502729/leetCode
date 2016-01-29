package cs.whu.leetCode;

public class SearchForARange {

	public static void main(String[] args) {
		int[] nums={3,3,3};
		int[] index=searchRange(nums, 3);
		for(int a:index){
			System.out.println(a);
		}
	}
	
	 public static int[] searchRange(int[] nums, int target) {
	        int index[]={-1,-1};
	        int m=-1,n=-1;
	        boolean flag=true;
	        for(int i=0;i<nums.length;i++){
	           if(nums[i]==target&&flag){ //利用fla来控制只存储第一个相等的值得index
	               m=i;
	               flag=false;
	           }
	           if(nums[i]==target)//记录最后一个相等的值得index
	            n=i;
	        } 
	        index[0]=m;
	        index[1]=n;
	        return index;
	    }
}
