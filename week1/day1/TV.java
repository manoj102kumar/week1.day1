package week1.day1;

public class TV {
	
	String SS = "Samsung is a smart tv";
	String LG = "LG is a LED TV";
	
	public void samsung() {
		String review = "But No QLED is not available";
		System.out.println(review);
	}
	
		
private void LG() {
	String review = "LG is advantage of QLED TV";
	System.out.println(review);

}

	public static void main(String[] args) {
		TV rating = new TV();
		System.out.println(rating.SS);
		rating.samsung();
		System.out.println(rating.LG);
		rating.LG();
		
				
	
	}
		


}
