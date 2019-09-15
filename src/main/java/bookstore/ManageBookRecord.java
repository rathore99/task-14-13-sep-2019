package bookstore;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManageBookRecord {

	public static void main(String[] args) {

		Configuration config = new Configuration().configure();
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("Choose Any One of The Options : ");
			System.out.println("1.   Add New Book ");
			System.out.println("2.   Update Book Details ");
			System.out.println("3.   Delete Book Record ");
			System.out.println("4.    Exit. ");
			Book book = new Book();
			Transaction trx = session.beginTransaction();

			choice = sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter Book Details : ");
				System.out.println("Enter Book Code : ");
				int bcode = sc.nextInt();
				book.setBookCode(bcode);
				System.out.println("Enter Book Title : ");
				String btitle = sc.next();
				book.setBookTitle(btitle);
				System.out.println("Enter Author's Name : ");
				String author = sc.next();
				book.setAuthor(author);
				System.out.println("Enter Subject of book : ");
				String subject = sc.next();
				book.setSubject(subject);
				System.out.println("Enter Price : ");
				int price = sc.nextInt();
				book.setPrice(price);
				session.save(book);
				trx.commit();
				System.out.println("RECORD ADDED");
				break;
			}
			case 2: {
				System.out.println("Enter Book Details : ");
				System.out.println("Enter Book Code : ");
				book.setBookCode(sc.nextInt());
				System.out.println("Enter Book Title : ");
				book.setBookTitle(sc.next());
				System.out.println("Enter Athor's Name : ");
				book.setAuthor(sc.next());
				System.out.println("Enter Subjecto Book : ");
				book.setSubject(sc.next());
				System.out.println("Enter price : " );
				book.setPrice(sc.nextInt());
				session.update(book);
				trx.commit();
				System.out.println("RECORD UPDATED");
				break;
			}
			case 3: {
			
				System.out.println("Enter the Book code You Want to DELETE: ");
				book.setBookCode(sc.nextInt());
				session.delete(book);
				trx.commit();
				System.out.println("RECORD DELETED");
				break;
			}
			case 4: {
				System.exit(0);
				break;
			}
			default: {
				System.out.println("Invalid Choice ..!!");
				session.close();
			}
			}
		} while (choice != 4);
		sc.close();
	}

}