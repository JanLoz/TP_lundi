import com.m2i.poe.shop.Book;
import com.m2i.poe.shop.BookJPARepository;
import com.m2i.poe.shop.Cart;
import org.junit.Test;

import java.sql.SQLException;

import static org.junit.Assert.*;



public class MediaTests {

    @Test
    public void firstTest() {
        int i = 1;
        i += 1;
        assertEquals(2,i);
    }

    @Test
    public void netPriceTest() {
        Book b = new Book();
        b.setPrice(10);
        assertNotNull(b);
        assertEquals(9.985, b.getNetPrice(), 0.001);
        assertTrue(9.985 == b.getNetPrice());
    }

    @Test
    public void JPAGetByIdTest() throws SQLException {
        BookJPARepository repo = new BookJPARepository();
        Book b = repo.getById(1);
        assertNotNull(b);
        assertEquals("java", b.getTitle());
    }

    @Test
    public void cartIsValid() {
        Cart cart = new Cart();
        assertFalse(cart.getIsValid());
        cart.add(new Book());
       /** assertTrue(cart.getIsValid());**/
    }



}