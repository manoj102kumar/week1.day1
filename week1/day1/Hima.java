package week1.day1;
public class Hima
{
 String review = "Tasty";
 
private void lunch() {
	
	String lunch = "Rice with Dhal";
	System.out.println(lunch);

}
	
private void dinner() {
	
	String Dinner = "idly with Samabar";
	System.out.println(Dinner);

}
public static void main(String[] args) {
	
	Hima food = new Hima();
food.lunch();
System.out.println(food.review);
food.dinner();
System.out.println(food.review);

}
}