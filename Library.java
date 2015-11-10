package library;

public class Library {

	private String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	private Books[][] booksAuthor = new Books[50][50];
	private Books[][] booksTitle = new Books[50][50];

	public void creatBook(String title, String author, Genre genre) {
		Books b = new Books();
		b.setAuthor(author);
		b.setGenre(genre);
		b.setTitle(title);
		addToLibrary(b);
	}

	public void findByAuthor(String author) {
		int i = firstLetterPosition(author);
		for (int j = 0; j < booksAuthor[i].length; j++) {
			if (booksAuthor[i][j].getAuthor().equals(author)) {
				printInfoBook(booksAuthor, i, j);
				break;
			}
		}
	}

	public void findByTitle(String title) {
		int i = firstLetterPosition(title);
		for (int j = 0; j < booksTitle[i].length; j++) {
			if (booksTitle[i][j].getTitle().equals(title)) {
				printInfoBook(booksTitle, i, j);
				break;
			}
		}
	}

	private void addToLibrary(Books book) {
		selectByAuthor(book);
		selectByTitle(book);
	}

	private void selectByTitle(Books book) {
		int i = firstLetterPosition(book.getTitle());
		checkArray(i, booksTitle, book);

	}

	private void selectByAuthor(Books book) {
		int i = firstLetterPosition(book.getAuthor());
		checkArray(i, booksAuthor, book);

	}

	private int firstLetterPosition(String str) {
		char[] alph = alphabet.toCharArray();
		for (int i = 0; i < alphabet.length(); i++) {
			if (alph[i] == str.charAt(0)) {
				return i;
			}
		}
		return -1;
	}

	private void checkArray(int i, Books[][] array, Books book) {
		for (int j = 0; j < array[i].length; j++) {
			if (array[i][j] == null) {
				array[i][j] = book;
				break;
			}
		}
	}

	private void printInfoBook(Books[][] book, int i, int j) {
		System.out.print(book[i][j].getAuthor() + ", ");
		System.out.print("" + book[i][j].getTitle() + ", ");
		System.out.println("" + book[i][j].getGenre() + ".");
	}

}
