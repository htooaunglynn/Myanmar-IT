package listAssignment1.bms;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	 private static List<String> categoryList = new ArrayList<>();
	    private static List<Author> authorList = new ArrayList<>();
	    private static List<Book> bookList = new ArrayList<>();


	    public static void main(String[] args) {
	        // initialize
	        initialize();

	        // choose option
	        String inputs = """
					1. View Author
					2. View Category
					3. View Book
					4. Add Book
					Choose(1, 2, 3, 4): """;
	        Scanner sc = new Scanner(System.in);
	        System.out.print(inputs);
	        var option = Integer.parseInt(sc.nextLine());

	        switch(option) {
	            case 1: viewAuthor();break;
	            case 2: viewCategory(); break;
	            case 3: viewBook(sc); break;
	            case 4: addBook(sc); break;
	            default:
	                System.err.println("Invalid number");
	        }
	        sc.close();
	    }


	    private static void addBook(Scanner sc) {

	        System.out.print("Enter author : ");
	        var atr_name = sc.nextLine();

	        System.out.print("Enter city : ");
	        var atr_city = sc.nextLine();

	        Author author = new Author(atr_name, atr_city);

	        System.out.print("Enter category : ");
	        var cate = sc.nextLine();

	        System.out.print("Enter code : ");
	        var code = Integer.parseInt(sc.nextLine());

	        System.out.print("Enter title : ");
	        var title = sc.nextLine();

	        var book = new Book();
	        book.setAuthor(author);
	        book.setCategory(cate);
	        book.setCode(code);
	        book.setPublishDate(LocalDate.now());
	        book.setTitle(title);
	    }


	    private static void viewBook(Scanner sc) {
	        var inputs = """
					1. View All
					2. View By Category
					3. View By Author
					Choose(1, 2, 3): """;
	        System.out.print(inputs);
	        var option = Integer.parseInt(sc.nextLine());

	        if(option == 1)
	            viewAll();
	        else if(option == 2)
	            viewByCategory(sc);
	        else if(option == 3)
	            viewByAuthor(sc);
	        else
	            System.err.println("Wrong Number");

	    }

	    private static void viewByAuthor(Scanner sc) {
	        System.out.print("Enter author name: ");
	        var name = sc.nextLine();

	        var author = searchAuthor(name);
	        if(author == null) {
	            System.err.println("This author does not exist");
	        }
	        else {// found
	            List<Book> resultList = new ArrayList<>();

	            for(var b : bookList) {
	                if(b.getAuthor().getName().equalsIgnoreCase(author.getName()))
	                    resultList.add(b);
	            }

	            if(resultList.size() == 0)
	                System.err.println("There is no books related to this author");
	            else {
	                System.out.println("Code \t Title \t publishDate \t Category \tAuthor");
	                System.out.println("--------------------");
	                resultList.forEach(obj -> {
	                    System.out.print(obj.getCode() + "\t");
	                    System.out.print(obj.getTitle() + "\t");
	                    System.out.print(obj.getPublishDate() + "\t");
	                    System.out.print(obj.getCategory() + "\t");
	                    System.out.print(obj.getAuthor().getName() + "\n");
	                });
	            }

	        }


	    }


	    private static Author searchAuthor(String name) {
	        Author auth = null;

	        for(var obj: authorList) {
	            if(obj.getName().equalsIgnoreCase(name)) {
	                auth = obj;
	                break;
	            }
	        }
	        return auth;
	    }


	    private static void viewByCategory(Scanner sc) {
	       System.out.print("Enter category name : ");
	       var category_name = sc.nextLine();

	       var result = searchCategory(category_name);

	        if(result == null) {
	            System.err.println("This category does not exist");
	        } else {
	            List<Book> resultList = new ArrayList<>();

	            for(var b : bookList) {
	                if(b.getCategory().equalsIgnoreCase(result))
	                    resultList.add(b);
	            }

	            if(resultList.size() == 0)
	                System.err.println("There is no books related to this category");
	            else {
	                System.out.println("Code \t Title \t publishDate \t Category \tAuthor");
	                System.out.println("--------------------");
	                resultList.forEach(obj -> {
	                    System.out.print(obj.getCode() + "\t");
	                    System.out.print(obj.getTitle() + "\t");
	                    System.out.print(obj.getPublishDate() + "\t");
	                    System.out.print(obj.getCategory() + "\t");
	                    System.out.print(obj.getAuthor().getName() + "\n");
	                });
	            }

	        }
	    }

	    private static String searchCategory(String category_name) {
	        String result = null;

	        for(var obj: categoryList) {
	            if(obj.equalsIgnoreCase(category_name)) {
	                result = obj;
	                break;
	            }
	        }
	        return result;
	    }


	    private static void viewAll() {
	        System.out.println("Code \t Title \t publishDate \t Category \tAuthor");
	        System.out.println("--------------------");
	        bookList.forEach(obj -> {
	            System.out.print(obj.getCode() + "\t");
	            System.out.print(obj.getTitle() + "\t");
	            System.out.print(obj.getPublishDate() + "\t");
	            System.out.print(obj.getCategory() + "\t");
	            System.out.print(obj.getAuthor().getName() + "\n");
	        });

	    }


	    private static void viewCategory() {
	        System.out.println("Category");
	        System.out.println("----------------------");
	        categoryList.forEach(category -> {
	            System.out.println(category);
	        });

	    }


	    private static void viewAuthor() {
	        System.out.println("Name\t Native Town");
	        System.out.println("----------------------");
	        authorList.forEach(auth -> {
	            System.out.println(auth.getName() + "\t" + auth.getCountry());
	        });

	    }


	    private static void initialize() {

	        // initialize category
	        categoryList.add("Sports");
	        categoryList.add("Musics");
	        categoryList.add("Travels and Tour");
	        categoryList.add("Skincares");

	        // initialize author
	        authorList.add(new Author("Jeon", "Korea"));
	        authorList.add(new Author("Miki", "India"));
	        authorList.add(new Author("Kyaw Kyaw", "Myanmar"));

	        // initialize book
	        var book1 = new Book();
	        book1.setAuthor(authorList.get(1));
	        book1.setCategory(categoryList.get(0));
	        book1.setCode(1001);
	        book1.setPublishDate(LocalDate.now());
	        book1.setTitle("Title 1");

	        var book2 = new Book();
	        book2.setAuthor(authorList.get(0));
	        book2.setCategory(categoryList.get(1));
	        book2.setCode(1002);
	        book2.setPublishDate(LocalDate.now());
	        book2.setTitle("Title 2");

	        var book3 = new Book();
	        book3.setAuthor(authorList.get(0));
	        book3.setCategory(categoryList.get(1));
	        book3.setCode(1003);
	        book3.setPublishDate(LocalDate.now());
	        book3.setTitle("Title 3");

	        bookList.add(book1);
	        bookList.add(book2);
	        bookList.add(book3);

	    }

}
