package week1.day1;

public class Mobile {
	
	String mobileModel = "iphone-7_128 GB";
	int mobileWeight = 120;
	boolean isFullCharge = true;
	double mobileCost = 75000.23;
			
	public void makeCall() {
	System.out.println ("Call attend/decline");

	}
	public void sendMsg() {
		System.out.println("Msg sent");
		

	}
	public static void main(String[] args) {
		Mobile Mob = new Mobile();
		Mob.makeCall();
		Mob.sendMsg();
	System.out.println(Mob.mobileModel);
	System.out.println(Mob.mobileWeight);
	System.out.println(Mob.isFullCharge);
	System.out.println(Mob.mobileCost);
		
	}
}

