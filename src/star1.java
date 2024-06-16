import java.util.Arrays;

public class star1 {

	public static void main(String[] args) {
		
//		for(int i=1;i<=4;i++) {
//			
//			for(int j=i;j<=4;j++) {     
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//	****
//	***
//	**
//	*

	
//		Program 2- no pttern 1 22 333 4444 
		
//		int counter=1;
//		for(int i=1;i<=5;i++) {
//			
//			for(int j=1;j<=i;j++) {
//				System.out.print(counter+" ");	
//				counter++;
//			}
//			System.out.println("");
//		}
		
		
		
		//Fibonacii series
		
//		
//		int n1=0, n2=1;
//		int sum=0;
//		
//		for(int i=1;i<10;i++) {
//			sum=n1+n2;   //1 1+1=2 
//			n1=n2;  //1 
//		    n2=sum;  //1 
//			
//			
//		}
//		
//	
//		  // Count no of words in string
//		
//	String str="programming is my passion";
//	 String[] words=str.split("\\s+");
//	 
//	 int wordcount=words.length;
//	 
//	 System.out.println("The number of words in the string: " + wordcount);
//		
		
	
		
		
	//SOrt eleemnts in array
		
//		int a[]= {2,4,5,1,3};
//		int temp=0;
//	
//		System.out.println("arrays before sorting" +Arrays.toString(a));
//		
//		for(int i=0;i<a.length-1;i++) {
//			
//			for(int j=0;j<a.length-1;j++) {
//				
//				if(a[j]>a[j+1]) {
//					temp=a[j];
//					a[j]=a[j+1];
//					a[j+1]=temp;
//					
//				}
//				
//				
//			}
//		}
//		
//		System.out.println("arrays after sorting" +Arrays.toString(a));
//		
		
		
		//Count occurence of character in string
		
		String str="indiai";
		char ch='i';
		int count=0;
		
		for(int i=0;i<=str.length()-1;i++) {
			
			if(str.charAt(i)==ch) {
				
				count++;
			}
		}
		
   System.out.println("character occur for " +count++);		
		
		
		
		
		
		
		
		
		
	}	
}
