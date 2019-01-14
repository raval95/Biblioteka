package Do;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import Data.Liblary;

public class ZiO {
	public static final String FILE_NAME = "Library.o";
	Liblary library=new Liblary();
	public void writeLibraryToFile(Liblary lib) {
		try(
		FileOutputStream fos = new FileOutputStream(FILE_NAME);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
				) {
			
			oos.writeObject(lib);
			
		} catch (FileNotFoundException e) {
			System.err.println("Nie odnaleziono pliku " + FILE_NAME);
		} catch (IOException e) {
			System.err.println("B³¹d podczas zapisu danych do pliku " + FILE_NAME);
		}
	}
	
	public Liblary readLibraryFromFile() throws FileNotFoundException, IOException, ClassNotFoundException {
		Liblary library = null;
		try(
		FileInputStream fis = new FileInputStream(FILE_NAME);
		ObjectInputStream ois = new ObjectInputStream(fis);
				) {
			

			
		} catch (FileNotFoundException e) {
			System.err.println("Nie odnaleziono pliku " + FILE_NAME);
			throw e;
		} catch (IOException e) {
			System.err.println("B³¹d podczas odczytu danych z pliku " + FILE_NAME);
			throw e;
		}
		
		return library;
	}
}
