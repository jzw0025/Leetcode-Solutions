
import java.util.ArrayList;
import java.util.List;


public class SummaryRanges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inp = {1,3};
		List<String> resu = summaryRanges(inp);
		System.out.println(resu);
	}
	public static List<String> summaryRanges(int[] nums){
		List<String> res = new ArrayList<String>();
		if(nums.length == 0){
			return res;
		}
		String start = String.valueOf(nums[0]);
		String end = String.valueOf(nums[0]);
		if (start.equals(end) & nums.length==1){
			res.add(start);
			};
			
		for (int i=1; i<nums.length; i++){

			// detect if there is a gap between the numbers
			if (i<nums.length-1){
				if(nums[i] == nums[i-1] + 1 ){
					end = String.valueOf(nums[i]);
					continue;
				}
				if (start.equals(end)){
					res.add(start);
					start = String.valueOf(nums[i]);
					end = String.valueOf(nums[i]);
				}else{
					res.add(start +"->"+end);
					start = String.valueOf(nums[i]);
					end = String.valueOf(nums[i]);
				}	
			}else{
				if(nums[i] == nums[i-1] + 1 ){
					end = String.valueOf(nums[i]);
					res.add(start +"->"+end);
					}else{
						if (start.equals(end)){
						res.add(start);
						}else{
						res.add(start +"->"+end);
						}
						res.add(String.valueOf(nums[i]));
					}					
				//System.out.println(i);
			    //System.out.println(start);
				//System.out.println(end);
			}
			}
		return res;
	}
}
