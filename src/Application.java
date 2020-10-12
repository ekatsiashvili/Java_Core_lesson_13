
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		VerkhovnaRada vr = new VerkhovnaRada();

		while (true) {
			menu();

			switch (sc.next()) {
			case "1": {
				vr.addFraction();
				System.out.println();
				break;
			}
			case "2": {
				vr.deleteFraction();
				System.out.println();
				break;
			}
			case "3": {
				vr.printAllFraction();
				System.out.println();
				break;
			}
			case "4": {
				vr.deleteDeputatyFromFaction();
				System.out.println();
				break;
			}
			case "5": {
				vr.printEnteredFraction();
				break;
			}
			case "6": {
				vr.addDeputatyToFraction();
				break;
			}
			case "7": {
				vr.deleteDeputatyFromFaction();
				break;
			}
			case "8": {
				vr.printAllBriberInFraction();
				break;
			}
			case "9": {
				vr.printMainBriberInFraction();
				break;
			}
			}
		}

	}

	public static void menu() {
		System.out.println("Ââåä³òü 1 ùîá äîäàòè ôðàêö³ÿ");
		System.out.println("Ââåä³òü 2 ùîá âèäàëèòè êîíêðåòíó ôðàêö³þ");
		System.out.println("Ââåä³òü 3 ùîá âèâåñòè óñ³ ôðàêö³¿");
		System.out.println("Ââåä³òü 4 ùîá î÷èñòèòè êîíêðåòíó ôðàêö³þ");
		System.out.println("Ââåä³òü 5 ùîá âèâåñòè êîíêðåòíó ôðàêö³þ");
		System.out.println("Ââåä³òü 6 ùîá äîäàòè äåïóòàòà â ôðàêö³þ");
		System.out.println("Ââåä³òü 7 ùîá âèäàëèòè äåïóòàòà ç ôðàêö³¿");
		System.out.println("Ââåä³òü 8 ùîá âèâåñòè ñïèñîê õàáàðíèê³â");
		System.out.println("Ââåä³òü 9 ùîá âèâåñòè íàéá³ëüøîãî õàáàðíèêà");
	}

}