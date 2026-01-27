package corejava;

public class Bankoverriding {
	int getInterestRate() {
		return 0;
	}

}

class sbi extends Bankoverriding {
	int getInterestRate() {
		return 7;
	}
}
class hdfc extends Bankoverriding {
	int getInterestRate() {
		return 8;
	}
}