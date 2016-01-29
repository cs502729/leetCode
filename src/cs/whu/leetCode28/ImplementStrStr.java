package cs.whu.leetCode28;

public class ImplementStrStr {

	public static void main(String[] args) {
		ImplementStrStr cs=new ImplementStrStr();
		System.out.println(cs.strStr("casdsfcshjcs", "cs"));
	}

	public int strStr(String haystack, String needle) {	
		return haystack.indexOf(needle);
	}
}
