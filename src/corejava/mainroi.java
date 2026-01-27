package corejava;

public class mainroi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bankoverriding b;
		b = new sbi();
		System.out.println("SBI ROI: " + b.getInterestRate() + "%");
		b= new hdfc();
		System.out.println("HDFC ROI: " + b.getInterestRate() + "%");

	}

}
