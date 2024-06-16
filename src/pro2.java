import java.util.Arrays;

public class pro2 {

	
		public static void main(String[] args) {
		     int a[]={5,3,4,6,2};
		     
		     int len=a.length;
		    
		    for(int i=0;i<len-1;i++){
		        
		        for(int j=0;j<len-1;j++){
		            
		            if(a[j]>a[j+1]){
		                int temp=a[j];
		                a[j]=a[j+1];
		                a[j+1]=temp;
		            }
		        }
		    }
		System.out.println("Arrays after sorting:"+Arrays.toString(a));
		        
		        
		    }
	}

