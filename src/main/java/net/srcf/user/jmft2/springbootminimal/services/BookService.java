package net.srcf.user.jmft2.springbootminimal.services;

import java.util.List;
import net.srcf.user.jmft2.springbootminimal.models.Book;
import net.srcf.user.jmft2.springbootminimal.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

  private final BookRepository bookRepository;

  public BookService(BookRepository bookRepository) {
    this.bookRepository = bookRepository;
  }

  public List<Book> list() {
    return bookRepository.findAll();
  }
}
