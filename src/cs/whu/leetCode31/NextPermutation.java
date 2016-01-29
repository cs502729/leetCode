package cs.whu.leetCode31;
/**
 *  题目的意思是：123的全排列按字典顺序为：
    123 132 213 231 312 321
             如果输入其中某一个序列，返回它的下一个序列。如：输入：213 输出：231 ；输入：321 输出：123
 * @author Administrator
 *
 */
public class NextPermutation {
	public static void main(String[] args) {
		int[] nums={1,1,5};
		NextPermutation cs=new NextPermutation();
		cs.nextPermutation(nums);
	}

	public void nextPermutation(int[] nums) {
		//找到最后一个升序位置
		int pos=-1;
		
		for(int i=nums.length-1;i>0;i--){
			if(nums[i]>nums[i-1]){
				pos=i-1;
				break;
			}
		}
		
		//如果不存在则反排
		if(pos==-1){
			reverse(nums, 0, nums.length-1);
			return;
		}
		//若存在升序，则找到pos之后的最后一个比它大的位置交换
		for(int j=nums.length-1;j>=0;j--){
			if(nums[j]>nums[pos]){
				int temp=0;
				temp=nums[pos];
				nums[pos]=nums[j];
				nums[j]=temp;
				break;
			}
		}
		
		//最后将pos后的重排序
		reverse(nums, pos+1, nums.length-1);
	}
	//颠倒数组
	public void reverse(int[] nums,int left,int right){
		while(left<right){
			int temp=0;
			temp=nums[left];
			nums[left]=nums[right];
			nums[right]=temp;
			left++;
			right--;
		}
	}
}
