package cs.whu.leetCode27;

public class RemoveElement {
	
	public static void main(String[] args) {
		int[] nums={3,2,1,4,2};
		RemoveElement cs=new RemoveElement();
		cs.removeElement(nums, 2);
	}
	
	public int removeElement(int[] nums, int elem) {
        int pos = 0;
        for (int a : nums) {
            if(a!=elem){
                nums[pos]=a;
                pos++;
            }
        }
         
        return pos;
    }
}
