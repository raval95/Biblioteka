package Data;

import java.io.Serializable;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Liblary implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1255L;

	private Map<String,Publication>publications;
	private Map<String,LiblaryUser>users;
	
	


	public Liblary() {
		publications = new HashMap<>();
		users=new HashMap<>();
	}
	
	public Map<String, LiblaryUser> getUsers() {
		return users;
	}

	public int getPublicationsNumber() {
		return publications.size();
	}
	
	public Map<String,Publication> getPublications() {
		return publications;
	}
	
	
	public void addBook(Book book) {
		addPublication(book);
	}
	
	public void addMagazine(Magazine magazine) {
		addPublication(magazine);
	}
	
	private void addPublication(Publication pub)  {
		
		publications.put(pub.getTitle(), pub);
		
	}
	public void addUser(LiblaryUser user) {
		users.put(user.getPesel(), user);
	}
	public void removePublication(Publication pub) {
		if(publications.containsValue(pub)) {
			publications.remove(pub.getTitle());
		}
		
		}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for(Publication p: publications.values()) {
			builder.append(p);
			builder.append("\n");
		}
		return builder.toString();
	
	}
		public static class AlphabeticalComparator implements Comparator<Publication> {
			@Override
			public int compare(Publication o1, Publication o2) {
				if (o1 == null && o2 == null) {
	                return 0;
	            }
	            if (o1 == null) {
	                return 1;
	            }
	            if (o2 == null) {
	                return -1;
	            }
				return o1.getTitle().compareTo(o2.getTitle());
			}
		}
		public static class Datac implements Comparator<Publication>{

		@Override
		public int compare(Publication o1, Publication o2) {
			// TODO Auto-generated method stub
			if(o1==null&&o2==null)
			return 0;
			if(o1==null)
				return 1;
			if(o2==null)
				return -1;
			Integer a=o1.getYear();
			Integer b=o2.getYear();
			return a.compareTo(b);
	
	}
	}}
