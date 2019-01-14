package Do;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import Data.Book;
import Data.Liblary;
import Data.LiblaryUser;
import Data.Magazine;
import Data.Publication;

public class LibraryUtils {
	public static void printBooks(Liblary lib) {
		List<Publication> publications = new ArrayList<>();
		publications.addAll(lib.getPublications().values());
		Collections.sort(publications,new Liblary.AlphabeticalComparator());
		int countBooks = 0;
		for(Publication p: publications) {
			if(p instanceof Book) {
				System.out.println(p);
				countBooks++;
			}
		}
		
		if(countBooks == 0) {
			System.out.println("Brak ksi¹¿ek w bibliotece");
		}
	}
	

	public static void printMagazines(Liblary lib) {
		Collection<Publication> publications = lib.getPublications().values();
		int countMagazines = 0;
		for(Publication p: publications) {
			if(p instanceof Magazine) {
				System.out.println(p);
				countMagazines++;
			}
		}
		
		if(countMagazines == 0) {
			System.out.println("Brak magazynów w bibliotece");
		}
	}
	public static void printUsers(Liblary lib) {
		Collection<LiblaryUser> users = lib.getUsers().values();
		for(LiblaryUser u: users) {
			System.out.println(u);
		}
}}