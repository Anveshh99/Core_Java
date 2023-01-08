package libraryManagementSystem;

import java.util.Comparator;

public class CampareByTitles implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		
		System.out.println("into Comparator Class, for Sorting");
		return o1.getTitle().compareTo(o2.getTitle());
	}

}
