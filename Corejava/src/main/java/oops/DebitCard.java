package oops;
//Encapsulation = Data Hiding + Data Abstraction
public class DebitCard {
	
	//Data Hiding
	private int pinNumber;
	
	//Generate Setters & Getters
	public int getPinNumber() {
		return pinNumber;
	}

	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}
	public static void main(String[] args) {
		DebitCard visaCard = new DebitCard();//Object or Instance
		visaCard.setPinNumber(1234);
		System.out.println("Visa Card Pin Number = "+visaCard.getPinNumber());

	}

	

}
