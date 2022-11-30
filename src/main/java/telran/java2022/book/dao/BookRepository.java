package telran.java2022.book.dao;


import java.util.stream.Stream;

import org.springframework.data.repository.CrudRepository;

import telran.java2022.book.model.Book;

public interface BookRepository extends CrudRepository<Book, String> {

	Stream<Book> findBooksByAuthorsName(String authorName);

	Stream<Book> findBooksByPublisherPublisherName(String publisherName);

}
