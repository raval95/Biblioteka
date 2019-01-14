package Do;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import Data.LiblaryUser;

import Data.Book;
import Data.Liblary;
import Data.Magazine;

public class Loop {
Scanner s;
Creator c;
ZiO z;
Liblary library;
LibraryUtils u;
	public Loop(){
		s=new Scanner(System.in);
		c=new Creator();
		z=new ZiO();
		library= new Liblary();
	    u=new LibraryUtils();
		try {
				library = z.readLibraryFromFile();
				System.out.println("Wczytano dane biblioteki z pliku ");
			} catch (ClassNotFoundException | IOException e) {
				library = new Liblary();
				System.out.println("Utworzono now¹ bazê biblioteki.");
			}

		
	}
	public void cloce()
	{
		s.close();
	}
	
	public void petla() throws FileNotFoundException, ClassNotFoundException, IOException {
	
	Option option = null;
	
	
	while(option!=Option.EXIT)
	{
		try{
			for(Option o:Option.values())
		{
			System.out.println(o.toString());
		}
		
		 
		option=Option.Create(c.getInt());
	
		switch (option) {
		case ADD_BOOK:
			addBook();
			break;
case ADD_MAGAZINE :
			
			  Magazine magazine = c.adm();
		        library.addMagazine(magazine);
			break;
case PRINT_BOOKS:
	LibraryUtils.printBooks(library);
	break;
case PRINT_MAGAZINES :
	LibraryUtils.printMagazines(library);
	break;
case PRINT_lIBLARY:
	LibraryUtils.printBooks(library);
	LibraryUtils.printMagazines(library);
	break;
case EXIT:
	break;
case ADD_USER:
  	LiblaryUser user = c.readAndCreateLibraryUser();
  	System.out.println(user);
	library.addUser(user);
	break;
case PRINT_USERS:
	LibraryUtils.printUsers(library);
	break;

	
	
		
		default:
			break;
	
		} }catch (InputMismatchException e) {
              System.out.println("Wprowadzono niepoprawne dane, publikacji nie dodano");
          } catch (NumberFormatException | NoSuchElementException e) {
              System.out.println("Wybrana opcja nie istnieje, wybierz ponownie:");
          }
		
		
		
		
	}	
	z.writeLibraryToFile(library);
	System.out.println("Koniec programu");
	c.close();
	
	

}
	
	public enum Option {
		EXIT(0,"Wyjscie z programu"),
		ADD_BOOK(1,"Dodaje ksiazki"),
		ADD_MAGAZINE(2,"Dodanie magazynu/gazety"),
		PRINT_BOOKS(3, "Wyœwietlenie dostêpnych ksi¹¿ek"),
		PRINT_MAGAZINES(4, "WYœwietlenie dostêpnych magazynów/gazet"),
		PRINT_lIBLARY(5,"Wyswietla zasoby biblioteki"),
        ADD_USER(6, "Dodanie nowego u¿ytkownika"),
        PRINT_USERS(7, "Wyœwietlenie listy u¿ytkowników");
			
			
			private int values;
			private String des;
			
			
			
		public int getValues() {
				return values;
			}



			public String getDes() {
				return des;
			}



			Option(int values,String desa){
			
			this.values=values;
			this.des=desa;
		}
			@Override
			public String toString() {
			// TODO Auto-generated method stub
			return values + " " + des;
			}
			
			
			public static Option Create(int a) throws NoSuchElementException {
				
				Option result=null;
				try {
				result= Option.values()[a];
			}catch(ArrayIndexOutOfBoundsException e) {
				throw new  NoSuchElementException("Brak elementu o wskazanym ID");
			}
				
			return result;
		}
			
		}

    private void addBook() {
        Book book1 = c.adb();
        library.addBook(book1);
    }



}