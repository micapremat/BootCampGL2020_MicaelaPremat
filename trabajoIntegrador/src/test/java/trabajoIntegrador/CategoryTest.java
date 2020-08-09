package trabajoIntegrador;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import ar.com.gl.shop.product.model.Category;
import ar.com.gl.shop.product.repository.RepositoryImpl;
import ar.com.gl.shop.product.services.CategoryServiceImpl;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;

@ExtendWith(MockitoExtension.class)
public class CategoryTest {
	@Mock
	Category category;
	
	@InjectMocks
	private CategoryServiceImpl categoryServiceImpl;

	@Test
	public void createListAndAddElementTest() {
		CategoryServiceImpl categoryServiceImpl = new CategoryServiceImpl();
		ArrayList<Category> listaCategory= categoryServiceImpl.create();
		assertTrue(categoryServiceImpl.add(new Category(10,"category10","descripcion10")));
		assertFalse(categoryServiceImpl.add(new Category(10,"category10","descripcion10")));
	}
	
	@Test
	public void deleteElementTest() {
		CategoryServiceImpl categoryServiceImpl = new CategoryServiceImpl();
		ArrayList<Category> listaCategory= categoryServiceImpl.create();
		assertEquals("El elemento con ID: " + "10" + " no se encuentra",categoryServiceImpl.remove(10));
		categoryServiceImpl.add(new Category(10,"category10","descripcion10"));
		assertEquals("El elemento con ID: " + "10" + " ha sido eiminado",categoryServiceImpl.remove(10));
	}
	
	@Test
	public void updateElementTest() {
		CategoryServiceImpl categoryServiceImpl = new CategoryServiceImpl();
		ArrayList<Category> listaCategory= categoryServiceImpl.create();
		assertEquals("El elemento con ID: " + "10" + " no se encuentra en la lista",categoryServiceImpl.update(10, new Category(10,"category10","descripcion10")));
		categoryServiceImpl.add(new Category(10,"category10","descripcion10"));
		assertEquals("El elemento: " + "10" + " ha sido modificado corrctamente",categoryServiceImpl.update(10, new Category(10,"category10","descripcion10")));
	}
}
