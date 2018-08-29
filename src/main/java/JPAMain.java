import com.m2i.poe.shop.Book;
import com.m2i.poe.shop.EntityManagerFactorySingleton;

import javax.persistence.EntityManager;

public class JPAMain {

    public static void main(String[] args) {
        EntityManager em = EntityManagerFactorySingleton.getEntityManager();
        Book b = em.find(Book.class,1);
        System.out.println(b.getTitle());
    }
}