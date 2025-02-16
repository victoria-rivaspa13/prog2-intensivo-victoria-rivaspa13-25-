package Intensivo.Práctica_primer_parcial;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

class MaterialTest {
    private Library library;
    private Book book;
    private Magazine magazine;
    private Thesis thesis;

    @BeforeEach
    void setUp() {
        library = new Library();
        book = new Book("El Principito", "Antoine de Saint-Exupéry");
        magazine = new Magazine("National Geographic", "Varios autores");
        thesis = new Thesis("Machine Learning", "John Doe", "Dr. Smith");

        library.addMaterial(book);
        library.addMaterial(magazine);
        library.addMaterial(thesis);
    }

    @Test
    void testMaterialCreation() {
        assertEquals("El Principito", book.getTitle());
        assertEquals("Antoine de Saint-Exupéry", book.getAuthor());
        assertEquals("Dr. Smith", thesis.getAdvisor());
    }

    @Test
    void testMaterialAvailabilityInitially() {
        assertTrue(book.isAvailable());
        assertTrue(magazine.isAvailable());
        assertTrue(thesis.isAvailable());
    }

    @Test
    void testBorrowMaterial() {
        assertTrue(library.borrowMaterial("El Principito"));
        assertFalse(book.isAvailable());
    }

    @Test
    void testCannotBorrowAlreadyBorrowedMaterial() {
        library.borrowMaterial("El Principito");
        assertFalse(library.borrowMaterial("El Principito"));
    }

    @Test
    void testReturnMaterial() {
        library.borrowMaterial("El Principito");
        library.returnMaterial("El Principito");
        assertTrue(book.isAvailable());
    }

    @Test
    void testListAvailableMaterials() {
        library.borrowMaterial("El Principito");
        List<Material> availableMaterials = library.listAvailableMaterials();
        assertEquals(2, availableMaterials.size());
        assertFalse(availableMaterials.contains(book));
    }

    @Test
    void testBorrowNonExistentMaterial() {
        assertFalse(library.borrowMaterial("Libro Inexistente"));
    }
}

