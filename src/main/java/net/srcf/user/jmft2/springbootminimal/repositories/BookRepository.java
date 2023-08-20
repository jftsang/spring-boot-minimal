package net.srcf.user.jmft2.springbootminimal.repositories;

import net.srcf.user.jmft2.springbootminimal.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}

