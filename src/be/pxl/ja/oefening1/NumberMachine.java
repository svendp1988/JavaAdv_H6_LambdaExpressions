package be.pxl.ja.oefening1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NumberMachine {

	private final ArrayList<Integer> numbers = new ArrayList<>();

	public NumberMachine(int[] numbers) {
		for (int number : numbers) {
			this.numbers.add(number);
		}
	}


	public String processNumbers(NumberFilter filter) {
		StringBuilder result = new StringBuilder();
		for (Integer number : numbers) {
			if (filter.check(number)) {
				if (!result.toString().equals("")) {
					result.append("-");
				}
				result.append(number);
			}
		}
		return result.toString();
	}

	public String convertNumber(Function<Integer, String> transformer) {
		return numbers.stream().map(transformer).collect(Collectors.joining("-"));
	}
}
