package ru.netology.manager;

import org.junit.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ProductManagerTest {
    ProductRepository repository = new ProductRepository();
    ProductManager manager = new ProductManager(repository);


    @Test
    public void shouldSearchByBookName( ) {
        Product[] expected = {new Book(1, "Book", 68, "Author" )};
        Product[] actual = manager.searchBy("Book");
        assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldSearchByBookAuthor( ) {
        Product[] expected = {new Book(2, "Book", 68, "Author")};
        Product[] actual = manager.searchBy("Author");
        assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldSearchBySmartphoneMaker( ) {
        Product[] expected = {new Smartphone(3, "Iphone", 1000, "Chine")};
        Product[] actual = manager.searchBy("Chane");
        assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldSearchBySmartphoneName( ) {
        Product[] expected = {new Smartphone(4, "Samsung", 950, "Chine")};
        Product[] actual = manager.searchBy("Samsung");
        assertArrayEquals(expected, actual);
    }
}