
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class VerkhovnaRada {

	Fraction fraction;
	ArrayList<Fraction> fractions = new ArrayList<Fraction>();

	public void addFraction() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ââåä³òü íàçâó ôðàêö³¿:");
		String str = scanner.nextLine();
		boolean isCreated = false;

		Iterator<Fraction> iterator = fractions.iterator();
		while (iterator.hasNext()) {
			Fraction next = iterator.next();

			if (next.getName().toLowerCase().equals(str.toLowerCase())) {
				isCreated = true;
			}
		}

		if (isCreated == false) {
			fractions.add(new Fraction(str));
		} else {
			System.out.println("Òàêà ôðàêö³ÿ âæå ³ñíóº");
		}

	}

	public void deleteFraction() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ââåä³òü íàçâó ôðàêö³¿:");
		String str = scanner.nextLine();

		Iterator<Fraction> iterator = fractions.iterator();
		while (iterator.hasNext()) {
			Fraction next = iterator.next();

			if (next.getName().toLowerCase().equals(str.toLowerCase())) {
				iterator.remove();
				break;
			} else {
				System.out.println("Øêîäà, òà òàêî¿ ôðàêö³¿ íåìàº");
			}
		}
	}

	public void printAllFraction() {
		Iterator<Fraction> iterator = fractions.iterator();
		while (iterator.hasNext()) {
			Fraction next = iterator.next();
			System.out.println(next.toString());
		}
	}

	public void printEnteredFraction() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ââåä³òü íàçâó ôðàêö³¿:");
		String str = scanner.nextLine();

		Iterator<Fraction> iterator = fractions.iterator();
		while (iterator.hasNext()) {
			Fraction next = iterator.next();

			if (next.getName().toLowerCase().equals(str.toLowerCase())) {
				System.out.println(next.toStringAllDeputaty());
				break;
			} else {
				System.out.println("Øêîäà, òà òàêî¿ ôðàêö³¿ íåìàº");
			}
		}
	}

	public void deleteAllDeputatyFromFraction() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ââåä³òü íàçâó ôðàêö³¿:");
		String str = scanner.nextLine();

		Iterator<Fraction> iterator = fractions.iterator();
		while (iterator.hasNext()) {
			Fraction next = iterator.next();

			if (next.getName().toLowerCase().equals(str.toLowerCase())) {
				next.deleteAllDeputaty();
			} else {
				System.out.println("Øêîäà, òà òàêî¿ ôðàêö³¿ íåìàº");
			}
		}
	}

	public void addDeputatyToFraction() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ââåä³òü íàçâó ôðàêö³¿:");
		String str = scanner.nextLine();

		Iterator<Fraction> iterator = fractions.iterator();
		while (iterator.hasNext()) {
			Fraction next = iterator.next();

			if (next.getName().toLowerCase().equals(str.toLowerCase())) {
				next.addDeputy();
				break;
			} else {
				System.out.println("Øêîäà, òà òàêî¿ ôðàêö³¿ íåìàº");
			}
		}
	}

	public void deleteDeputatyFromFaction() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ââåä³òü íàçâó ôðàêö³¿:");
		String str = scanner.nextLine();

		Iterator<Fraction> iterator = fractions.iterator();
		while (iterator.hasNext()) {
			Fraction next = iterator.next();

			if (next.getName().toLowerCase().equals(str.toLowerCase())) {
				next.deleteDeputy();
				break;
			} else {
				System.out.println("Øêîäà, òà òàêî¿ ôðàêö³¿ íåìàº");
			}
		}
	}

	public void printAllBriberInFraction() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ââåä³òü íàçâó ôðàêö³¿:");
		String str = scanner.nextLine();

		Iterator<Fraction> iterator = fractions.iterator();
		while (iterator.hasNext()) {
			Fraction next = iterator.next();

			if (next.getName().toLowerCase().equals(str.toLowerCase())) {
				next.printAllBriber();
				break;
			} else {
				System.out.println("Øêîäà, òà òàêî¿ ôðàêö³¿ íåìàº");
			}
		}
	}

	public void printMainBriberInFraction() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ââåä³òü íàçâó ôðàêö³¿:");
		String str = scanner.nextLine();

		Iterator<Fraction> iterator = fractions.iterator();
		while (iterator.hasNext()) {
			Fraction next = iterator.next();

			if (next.getName().toLowerCase().equals(str.toLowerCase())) {
				next.printMostBriberTaker();
				break;
			} else {
				System.out.println("Øêîäà, òà òàêî¿ ôðàêö³¿ íåìàº");
			}
		}
	}

	public void printAllDeputatyInFraction() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ââåä³òü íàçâó ôðàêö³¿:");
		String str = scanner.nextLine();

		Iterator<Fraction> iterator = fractions.iterator();
		while (iterator.hasNext()) {
			Fraction next = iterator.next();

			if (next.getName().toLowerCase().equals(str.toLowerCase())) {
				next.printAllDeputy();
				break;
			} else {
				System.out.println("Øêîäà, òà òàêî¿ ôðàêö³¿ íåìàº");
			}
		}
	}

	@Override
	public String toString() {
		return "Âåðõîâíà Ðàäà= " + fraction + "]";
	}

}