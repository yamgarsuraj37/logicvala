
public class star2 {

	
	public static void main(String[] args) {
		
//		for(int i=1;i<=4;i++) {
//			
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//		System.out.println();
//		}

	
		//Count Occurence of Characters in string
//		
//		String str="javaa is java";
//		int totalCount=str.length();
//		int totalCount_afterRemoval=str.replace("a", "").length();
//		
//		int countOfA=totalCount-totalCount_afterRemoval;
//		
//		System.out.println(countOfA);
//		
		
		
		String str="abcdabcd";

		char recur_char='a';


		for(int i=0;i<str.length()-1;i++){

		if(str.charAt(i)== recur_char){

		System.out.println("recurring character found " +recur_char);
		}

		else{
		System.out.println("recurring character not found " );
		}

		}
		

		
		
		
		
		
		
		
		
		
		
	
	
	}
	
	
	
}
