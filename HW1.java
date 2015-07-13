import java.awt.image.RescaleOp;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class HW1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inp = {8, 7, 6, 5, 4};
		int b = min(inp);
		int c = max(inp);
		int kmi = kmin(inp,3);
		List<String> ran = range(inp,3,7);
		int cel = ceiling(inp,0);

		System.out.println(b);
		System.out.println(c);
		System.out.println(kmi);
		System.out.println(ran);
		System.out.println(cel);
		
	}
	public static int min(int[] a) {
	    if(a==null||a.length==0)
	       throw new IllegalArgumentException();
	    int key=0;
	    for(int i=1;i<=a.length-1;i++)
	    {
	       if(a[i]<a[key])
	          key=i;
	    }  
	    return a[key];
	 }
	
	 public static int max(int[] a) {
		   if(a==null||a.length==0)
		      throw new IllegalArgumentException();
		   int key=0;
		   for(int i=1;i<=a.length-1;i++)
		   {
		      if(a[i]>a[key])
		         key=i;
		   }  
		   return a[key];
	   }	 
	 
	 @SuppressWarnings("unused")
	public static int kmin(int[] a, int k){
		 if (a==null||a.length==0)
			 throw new IllegalArgumentException();
		 int ans = a[0];
		 int count = 0;	 		 
		 for(int key=0;key<=a.length-1;key++){
			 for(int i=1;i<=a.length-1;i++){	 
				 if(a[i]-a[key]<0)
					count++;
					if (count > k-1)
						continue;
		 }
				if (count == k-1)
					ans = a[key];
				    System.out.println(count);
					break;
		 }
		 return ans;
	 }
	 
	 public static List<String> range(int[] a, int b, int c){
		 if (a==null||a.length==0)
			 throw new IllegalArgumentException();
		 List<String> ans = new ArrayList<String>(); 
		 for(int i=0;i<=a.length-1;i++){
			 if(a[i]>=b && a[i]<=c)
				 ans.add(String.valueOf(a[i]));
		 }
		 return ans;
	 }
	 
	 public static int ceiling(int[] a, int key){
		 if (a==null||a.length==0)
			 throw new IllegalArgumentException();
		 //List<String> ans = new ArrayList<String>();
		 int temp = 0;
		 for(int i=0;i<=a.length-1;i++){
			 if(a[i]>key){
				 if(temp == 0){
					 temp = a[i]; 
				 }else{
					 if(a[i] < temp)
						temp=a[i];
			 }			 
		 }
		 
	 }
		 return temp;
}
}
