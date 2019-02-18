package sebe.springframework.springWebapp.repositories;

import org.springframework.data.repository.CrudRepository;
import sebe.springframework.springWebapp.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {


}
