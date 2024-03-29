import java.util.Scanner;

public class Deputaty extends Human {

	public String surname;
	public String name;
	public int age;
	public boolean bribeTaker;
	public int bribeSize;

	public Deputaty(int weight, int height) {
		super(weight, height);
	}

	public Deputaty(int weight, int height, String surname, String name, int age, boolean bribeTaker) {
		super(weight, height);
		this.surname = surname;
		this.name = name;
		this.age = age;
		this.bribeTaker = bribeTaker;
	}

	public Deputaty(int weight, int height, String surname, String name, int age, boolean bribeTaker, int bribeSize) {
		super(weight, height);
		this.surname = surname;
		this.name = name;
		this.age = age;
		this.bribeTaker = bribeTaker;
		this.bribeSize = bribeSize;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isBribeTaker() {
		return bribeTaker;
	}

	public void setBribeTaker(boolean bribeTaker) {
		this.bribeTaker = bribeTaker;
	}

	public int getBribeSize() {
		return bribeSize;
	}

	public void setBribeSize(int bribeSize) {
		this.bribeSize = bribeSize;
	}

	@Override
	public String toString() {
		return "Ïð³çâèùå äåïóòàòà= " + surname + ", ³ìÿ= " + name + ", â³ê= " + age + "ð., áåðå õàáàð³= " + bribeTaker
				+ ", ðîçì³ð õàáàðÿ= " + getBribeSize() + "]";
	}

	public void takeBribe() {
		Scanner scan = new Scanner(System.in);
		if (bribeTaker == false) {
			System.out.println("Öåé äåïóòàò íå áåðå õàáàð³â");
		} else {
			System.out.println("Âåä³òü ñóìó õàáàðÿ");
			int sumBribe = scan.nextInt();
			if (sumBribe > 5000) {
				System.out.println("Ïîë³ö³ÿ óâÿçíèòü äåïóòàòà");
			} else {
				bribeSize = sumBribe;
			}
		}

	}
}