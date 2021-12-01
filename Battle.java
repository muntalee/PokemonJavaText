public class Battle {

	private Pokemon p1;
	private Pokemon p2;

	public Battle(Pokemon p1, Pokemon p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	public void startBattle() {
		System.out.println("Here are the players: ");
		System.out.println(p1.getName() + " and " + p2.getName());
		System.out.println(p1.toString());
		System.out.println(p2.toString());
	}

}
