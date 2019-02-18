package sebe.springframework.springWebapp.repositories;

import org.springframework.data.repository.CrudRepository;
import sebe.springframework.springWebapp.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
