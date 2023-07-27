package mentoria.encontro04;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class App {

	public static void main(String[] args) {
		BigDecimal n = new BigDecimal("0.0");

		for (int i = 0; i < 10; i++) {
			n = n.add(new BigDecimal("0.1"));
			System.out.println(n);
		}

		System.out.println("== DIVISÃO ==");
		System.out.println(new BigDecimal("1.0")
				.divide(new BigDecimal("4.1"), 5, RoundingMode.CEILING));

	}
}
