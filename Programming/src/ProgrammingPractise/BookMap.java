package ProgrammingPractise;

public class BookMap {

		int id;    
		String name,author,publisher;    
		int quantity;  
		
		public BookMap(int id, String name, String author, String publisher, int quantity) {    
		    this.id = id;    
		    this.name = name;    
		    this.author = author;    
		    this.publisher = publisher;    
		    this.quantity = quantity;    
		}

		//@Override
		public String toString() {
			return "BookMap [id=" + id + ", name=" + name + ", author=" + author + ", publisher=" + publisher
					+ ", quantity=" + quantity + "]";
		}  
		
		  

	}


