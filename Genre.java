package library;

public enum Genre {
	FOOD(1), FANTASY(2), COMPUTERS(3), FICTION(4), HISTORY(5);

	private int id;

	private Genre(int id) {
		this.id = id;
	}

	public int getID() {
		return id;
	}
}
