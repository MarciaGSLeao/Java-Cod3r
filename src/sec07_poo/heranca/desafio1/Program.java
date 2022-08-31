package sec07_poo.heranca.desafio1;

public class Program {

	public static void main(String[] args) {
		
		Tracker tracker = new Tracker();
		Onix onix = new Onix();
		
		System.out.println("TRACKER = " + tracker.getCurrentSpeed());
		System.out.println("ONIX = " + onix.getCurrentSpeed());
	
		tracker.speedUp();
		tracker.speedUp();
		tracker.speedUp();
		onix.speedUp();
		onix.speedUp();
		onix.speedUp();
	
		System.out.println();
		System.out.println("TRACKER = " + tracker.getCurrentSpeed());
		System.out.println("ONIX = " + onix.getCurrentSpeed());

		tracker.brake();
		tracker.brake();
		tracker.brake();
		tracker.brake();
		tracker.brake();
		tracker.brake();
		tracker.brake();
		tracker.brake();
		tracker.brake();
		onix.brake();
		onix.brake();
		onix.brake();
		onix.brake();
		onix.brake();
		onix.brake();
		onix.brake();
		
		System.out.println();
		System.out.println("TRACKER = " + tracker.getCurrentSpeed());
		System.out.println("ONIX = " + onix.getCurrentSpeed());
	
	}
}
