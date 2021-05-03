package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ProductManagerTest {
    private ProductRepository repository = new ProductRepository();
    private ProductManager manager = new ProductManager(repository);

    @Test
    void shouldSearchByBookName() {
        Product[] expected = {new Book(2, "Book", 68, "Author")};
        Product[] actual = manager.searchBy("Author");
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSearchByBookAuthor() {
        Product[] expected = {new Book(2, "Book", 68, "Author")};
        Product[] actual = manager.searchBy("Author");
        assertArrayEquals(expected, actual);
    }
    @Test
    void shouldSearchBySmartphoneMaker() {
        Product[] expected = {new Smartphone(3, "Iphone", 1000, "Chine")};
        Product[] actual = manager.searchBy("Chane");
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSearchBySmartphoneName() {
        Product[] expected = {new Smartphone(4, "Samsung", 950, "Chine")};
        Product[] actual = manager.searchBy("Samsung");
        assertArrayEquals(expected, actual);
    }


}