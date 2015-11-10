package library;

public class LibraryInfo {

	public static void main(String[] args) {
		Library library = new Library();
		library.creatBook("Twenty four hours java programming", "Yakov Fain",
				Genre.COMPUTERS);
		library.creatBook("Treasure Island", "Robert Louis Stevenson",
				Genre.FICTION);
		library.creatBook("Pride and Prejudice", "Jane Austen", Genre.FICTION);
		library.creatBook("Alice's Adventures in Wonderland", "Lewis Carroll",
				Genre.FANTASY);
		library.creatBook("The Yellow Wallpaper", "Charlotte Perkins Gilman",
				Genre.FICTION);
		library.creatBook("The Adventures of Tom Sawyer", "Mark Twain",
				Genre.FICTION);
		library.creatBook(
				"Rice, Noodle, Fish: Deep Travels Through Japan's Food Culture",
				"Matt Goulding", Genre.FOOD);
		library.creatBook("Baking and Babies", "Tara Sivec", Genre.FOOD);
		library.creatBook("Food Whore: A Novel of Dining and Deceit",
				"Jessica Tom", Genre.FOOD);
		library.creatBook("Java: Learning to Program with Robots",
				"Byron Weber Becker", Genre.COMPUTERS);
		library.creatBook("Object Oriented Programming in Java",
				"Rick Halterman", Genre.COMPUTERS);
		library.creatBook(
				"Open Data Structures: An Introduction, in Java and C++",
				"Pat Morin", Genre.COMPUTERS);
		library.creatBook("Dracula", "Bram Stoker", Genre.FICTION);
		library.creatBook("Walden, and On The Duty Of Civil Disobedience",
				"Henry David Thoreau", Genre.HISTORY);
		library.creatBook("Twelve Years a Slave", "Solomon Northup",
				Genre.HISTORY);

	
	
	library.findByAuthor("Mark Twain");
	library.findByAuthor("Jessica Tom");
	library.findByTitle("Object Oriented Programming in Java");
	

	}

}
