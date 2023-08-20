package net.srcf.user.jmft2.springbootminimal;

import java.util.List;
import net.srcf.user.jmft2.springbootminimal.models.Book;
import net.srcf.user.jmft2.springbootminimal.services.BookService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
public class BookServiceTest {

  @Autowired
  private BookService bookService;

  @Test
  public void whenApplicationStarts_thenHibernateCreatesInitialRecords() {
    List<Book> books = bookService.list();

    Assert.assertEquals(books.size(), 3);
  }
}
