/**
 * 
 */

/**
 * @author Pankaj.Kumar
 *
 */
public class demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {//This program will print duplicates
		int[]a={2,7,6,5,8,3,7,9,9,7,4,3};
		
		
		
		
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				
				if((a[i]==a[j]) && (i!=j)){
					
					System.out.print(a[j]+" ");
					
				}
			}
			
		}

	}

}
