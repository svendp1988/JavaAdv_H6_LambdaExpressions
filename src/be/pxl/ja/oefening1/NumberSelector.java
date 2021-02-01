package be.pxl.ja.oefening1;

public class NumberSelector {
	private final NumberMachine numberMachine;

	public NumberSelector(NumberMachine numberMachine) {
		this.numberMachine = numberMachine;
	}

	public String showEvenNumbers() {
		return numberMachine.processNumbers(new NumberFilter() {
			@Override
			public boolean check(int n) {
				return n % 2 == 0;
			}
		});
	}

	public String printHexNumbers() {
		return numberMachine.convertNumber(Integer::toHexString);
	}

	public String showNumbersAbove(int number) {
		return numberMachine.processNumbers(n -> n > number);
	}
}
