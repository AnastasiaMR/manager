package ru.netology.manager;

import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
@NoArgsConstructor
class ProductManagerTest {
    ProductRepository repository = new ProductRepository();
    ProductManager manager = new ProductManager(repository);

    private Product pr1 = new Book(1,"Book",90,"Gogol");
    private Product pr2 = new Book(2,"Sun",68,"Author");
    private Product pr3 = new Smartphone(3,"Iphone",1000,"China");

    @Test
    public void shouldSearchByBookName( ) {
        repository.save(pr1);
        repository.save(pr2);
        repository.save(pr3);
        Product[] actual = manager.searchBy("Sun");
        Product[] expected = new Product[]{pr2};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldSearchByBookAuthor( ) {
        repository.save(pr1);
        repository.save(pr2);
        repository.save(pr3);
        Product[] actual = manager.searchBy("Gogol");
        Product[] expected = new Product[]{pr1};
        assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldSearchBySmartphoneMaker( ) {
        repository.save(pr1);
        repository.save(pr2);
        repository.save(pr3);
        Product[] actual = manager.searchBy("China");
        Product[] expected = new Product[]{pr3};
        assertArrayEquals(actual, expected);
    }
}