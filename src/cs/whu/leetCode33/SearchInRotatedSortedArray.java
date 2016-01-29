package cs.whu.leetCode33;

public class SearchInRotatedSortedArray {

	public static void main(String[] args) {
		 int[] A = {2, 3, 4, 5, 6, 0, 1};  
	       System.out.println(search(A, 0));
	}

	public static int search(int[] nums, int target) {
		return binarySearch(nums, 0, nums.length-1,target);
	}
	public static int  binarySearch(int[] nums,int low,int high,int target){
		if(low>high) //没找到
			return -1;
		int mid= low+(high-low)/2;
		if(nums[mid]==target)
			return mid;
		int res=binarySearch(nums,low,mid-1,target);
		if(res==-1){
			res=binarySearch(nums,mid+1,high,target);
		}
		return res;
	}
	
}
