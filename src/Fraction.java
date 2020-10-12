
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import javax.imageio.event.IIOReadProgressListener;

public class Fraction {

	Deputaty deputy;
	private String name;

	ArrayList<Deputaty> deputies = new ArrayList<Deputaty>();

	public void addDeputy() {
		Deputaty deputaty = new Deputaty(0, 0);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ââåä³òü âàãó äåïóòàòà:");
		int weight = scanner.nextInt();
		System.out.println("Ââåä³òü éîãî ð³ñò:");
		int height = scanner.nextInt();
		System.out.println("Ââåä³òü ïð³çâèùå äåïóòàòà:");
		String surname = scanner.next();
		System.out.println("Ââåä³òü ³ìÿ äåïóòàòà:");
		String name = scanner.next();
		System.out.println("Ââåä³òü éîãî â³ê:");
		int age = scanner.nextInt();
		System.out.println("×è º öåé äåïóòàò õàáàðíèêîì (òàê ÷è í³)?");
		String str = scanner.next();
		if (str.equals("òàê")) {
			deputy.bribeTaker = true;
			deputy.takeBribe();
			deputies.add(new Deputaty(weight, height, surname, name, age, deputy.bribeTaker, deputy.bribeSize));
		} else {
			deputy.bribeTaker = false;
			deputies.add(new Deputaty(weight, height, surname, name, age, deputy.bribeTaker));
		}

	}

	public void deleteDeputy() {
		boolean isDeleted = false;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ââåä³òü ïð³çâèùå äåïóòàòà:");
		String str = scanner.nextLine();

		Iterator<Deputaty> iterator = deputies.iterator();
		while (iterator.hasNext()) {
			Deputaty next = iterator.next();

			if (next.getSurname().equals(str)) {
				iterator.remove();
				isDeleted = true;
			}
			if (isDeleted == false) {
				System.out.println("Øêîäà, òà â íàø³é ôðàêö³¿ òàêîãî äåïóòàòà íåìàº");
			}
		}
	}

	public void printAllBriber() {
		Iterator<Deputaty> iterator = deputies.iterator();
		while (iterator.hasNext()) {
			Deputaty next = iterator.next();

			if (next.isBribeTaker()) {
				System.out.println(next.toString());
			}
		}
	}

	public void printMostBriberTaker() {
		int max = 0;
		Iterator<Deputaty> iterator = deputies.iterator();
		while (iterator.hasNext()) {
			Deputaty next = iterator.next();

			if ((next.isBribeTaker()) && (next.getBribeSize() > max)) {
				max = next.getBribeSize();
			}
		}

		Iterator<Deputaty> iterator2 = deputies.iterator();
		while (iterator2.hasNext()) {
			Deputaty next = iterator2.next();

			if ((next.isBribeTaker()) && (next.getBribeSize() == max)) {
				System.out.println(next.toString());
			}
		}
	}

	public void printAllDeputy() {
		Iterator<Deputaty> iterator = deputies.iterator();
		while (iterator.hasNext()) {
			Deputaty next = iterator.next();
			System.out.println(next.toString());
		}
	}

	public void deleteAllDeputaty() {
		deputies.clear();
	}

	public Fraction(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Ôðàêö³ÿ= " + name + "]";
	}

	public String toStringAllDeputaty() {
		return "Ôðàêö³ÿ= " + name + ": Äåïóòàòè= " + deputies + "]";
	}

}
