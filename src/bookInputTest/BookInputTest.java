package bookInputTest;

import java.util.Scanner;

public class BookInputTest {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		book mybook = new book();
		
		
		System.out.println("Please enter the title of the book");
		mybook.title= inp.nextLine();
		System.out.println("Please enter the author name");
		mybook.author=inp.nextLine();
		System.out.println("Please enter the number of pages");
		mybook.numberOfPages=inp.nextInt();
		
		System.out.println("The book title is: "+ mybook.title);
		System.out.println("The book author is: "+ mybook.author);
		System.out.println("The book has "+ mybook.numberOfPages + " pages");

	}

}
