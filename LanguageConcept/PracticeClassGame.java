package LanguageConcept;

public class PracticeClassGame {
	private String title;
	private String genre;
	private int requiredAge;

	PracticeClassGame(String title, String genre, int requiredAge) {
		this.title = title;
		this.genre = genre;
		this.requiredAge = requiredAge;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getGenre(){
		return genre;
	}
	
	public int getRequiredAge() {
		return requiredAge;
	}
	
	public boolean isOldEnough(int age) {
		return age >= requiredAge;
	}
	
	public static void main(String args[]) {
		PracticeClassGame newGame = new PracticeClassGame("Dota 2", "RTS", 18);
		System.out.println(newGame.getTitle());;
	}
}
