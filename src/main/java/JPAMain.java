import com.m2i.poe.shop.Book;
import com.m2i.poe.shop.BookJPARepository;
import com.m2i.poe.shop.EntityManagerFactorySingleton;

import javax.persistence.EntityManager;
import java.sql.SQLException;

public class JPAMain {
 BookJPARepository repo= new BookJPARepository ();

    public static void main(String[] args) {
        EntityManager em = EntityManagerFactorySingleton.getEntityManager();
        Book b = em.find(Book.class,1);
        System.out.println(b.getTitle());
    }
    public Book putBook() throws SQLException {
        Book b= new Book ();
        b.setTitle ( "Titre Test" );
        b.setPrice ( 50 );
        repo.add(b);
        return b;
    }
}