package Do;

import java.util.InputMismatchException;
import java.util.Scanner;

import Data.Book;
import Data.Liblary;
import Data.LiblaryUser;
import Data.Magazine;

public class Creator {

	/**
	 * 
	 */



	
	
	Liblary l;
	Scanner s;
	
	
	public Creator()
	{
		l=new Liblary();
		
		s=new Scanner(System.in);
	}
	public void close()
	{
		s.close();
	}
	
	public int getInt() throws NumberFormatException {
		int number = 0;
		try {
			number = s.nextInt();
		} catch (InputMismatchException e) {
			throw new NumberFormatException("Liczba wprowadzona w niepoprawnej formie");
		} finally {
			s.nextLine();
		}
		return number;
	}

	
	
	public Magazine adm() throws InputMismatchException
	{
		System.out.println("Tytu³: ");
		String title = s.nextLine();
		System.out.println("Wydawnictwo: ");
		String publisher = s.nextLine();
		System.out.println("Jêzyk: ");
		String language = s.nextLine();
		System.out.println("Rok wydania: ");
		
		int year=0;
		int month=0;
		int day=0;
		
		try {
		 year = s.nextInt();
		s.nextLine();
		System.out.println("Miesi¹c: ");
		 month = s.nextInt();
		s.nextLine();
		System.out.println("Dzieñ: ");
		 day = s.nextInt();
		s.nextLine();
		}catch (InputMismatchException e) {
			// TODO: handle exception
			s.nextLine();
			throw e;
		}
		
			
		return  new Magazine(title,publisher,language, year,  month, day);
	}
	
	
	
	public Magazine addm()throws InputMismatchException
	{
		System.out.println("Tytu³: ");
		String title = s.nextLine();
		System.out.println("Wydawnictwo: ");
		String publisher = s.nextLine();
		System.out.println("Jêzyk: ");
		String language = s.nextLine();
		System.out.println("Rok wydania: ");
		
		int year=0;
		int month=0;
		int day=0;
		
		try {
		 year = s.nextInt();
		s.nextLine();
		System.out.println("Miesi¹c: ");
		 month = s.nextInt();
		s.nextLine();
		System.out.println("Dzieñ: ");
		 day = s.nextInt();
		s.nextLine();
		}catch (InputMismatchException e) {
			// TODO: handle exception
			s.nextLine();
			throw e;
		}
		
		
		return  new Magazine(title,publisher,language, year,  month, day);
	}
	
    public LiblaryUser readAndCreateLibraryUser() {
        System.out.println("Imiê: ");
        String firstName = s.nextLine();
        System.out.println("Nazwisko: ");
        String lastName = s.nextLine();
        System.out.println("PESEL: ");
        String pesel = s.nextLine();
 
        return new LiblaryUser(firstName, lastName, pesel);
    }
	
	public Book adb()throws InputMismatchException
	{
		System.out.println("Tytu³: ");
		String title=s.nextLine();
		System.out.println("Autor: ");
		String author=s.nextLine();
		System.out.println("Publisher: ");
		String publisher=s.nextLine();
		System.out.println("Isbn: ");
		String isbn=s.nextLine();
		int year=0;
		int pages=0;
		try{System.out.println("Rok: ");
		year=s.nextInt();
		s.nextLine();
		System.out.println("Liczbas stron: ");
		pages=s.nextInt();
		s.nextLine();
		}catch (InputMismatchException e) {
			// TODO: handle exception
			s.nextLine();
			throw e;
		}
		
		
		
		return new Book(title,  author,  year, pages,  publisher,
				 isbn);
	}
	public Book addb()throws InputMismatchException
	{
		System.out.println("Tytu³: ");
		String title=s.nextLine();
		System.out.println("Autor: ");
		String author=s.nextLine();
		System.out.println("Publisher: ");
		String publisher=s.nextLine();
		System.out.println("Isbn: ");
		String isbn=s.nextLine();
		int year=0;
		int pages=0;
		try{System.out.println("Rok: ");
		year=s.nextInt();
		s.nextLine();
		System.out.println("Liczbas stron: ");
		pages=s.nextInt();
		s.nextLine();
		}catch (InputMismatchException e) {
			// TODO: handle exception
			s.nextLine();
			throw e;
		}
		
		
		
		
		return new Book(title,  author,  year, pages,  publisher,
				 isbn);
	}
	
	



public void opcje() {
	System.out.println("Wybierz :");
	System.out.println("0-zeby wyjsc z programu");
	System.out.println("1-zeby dodac nowa ksiazke");
	System.out.println("2-zeby dodac nowy magazyn");
	System.out.println("3-zeby wyswietlic ksiazki");
	System.out.println("4-zeby wyswietlic magazyny");
	System.out.println("5-zeby wyswietlic zbiory biblioteki");
	}
	
}