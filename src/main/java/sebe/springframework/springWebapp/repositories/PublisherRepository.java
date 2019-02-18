package sebe.springframework.springWebapp.repositories;

import org.springframework.data.repository.CrudRepository;
import sebe.springframework.springWebapp.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
