// My collection Class
public class TestLab4 {

	public static void main(String[] args) {
	
		Item[] items = new Item[4];

		
		items[0] = new Book("Java", "G.G", 1234);
		items[1] = new Periodical("Times", 123);
		items[2] = new Book("Java OOP", "S.Sharifi", 5678);
		items[3] = new Periodical("OOP ", 456);
		

		
		for (int i=0; i<items.length; i++) {

		System.out.println(items[i].getListing());
		System.out.println("-----------------");
		}
		}

	}


