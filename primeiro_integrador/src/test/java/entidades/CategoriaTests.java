package entidades;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.transaction.Transactional;

@QuarkusTest
public class CategoriaTests {
    @Test
    @Transactional
    public void testeSalvaUmaCategoria() {
        Categoria categoria = new Categoria();
        categoria.nome = "Doces";   

        categoria.persist();
        System.out.println("ID salvo:  " + categoria.codigo);

        Assertions.assertEquals(categoria.codigo, 12);
    }

}
