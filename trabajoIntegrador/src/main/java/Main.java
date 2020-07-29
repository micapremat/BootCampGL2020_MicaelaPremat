import java.util.ArrayList;
import java.util.Scanner;

import ar.com.gl.shop.product.model.Category;
import ar.com.gl.shop.product.repository.RepositoryImpl;
import ar.com.gl.shop.product.services.CategoryServiceImpl;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		CategoryServiceImpl categoryService = new CategoryServiceImpl();
		
		RepositoryImpl repository = new RepositoryImpl();
		
		Category category1 = new Category(1,"Categoria 1","descripcion1");
		Category category2 = new Category(2,"Categoria 2","descripcion2");
		Category category3 = new Category(3,"Categoria 3","descripcion3");
		
		ArrayList<Category> listaCategory= categoryService.create();
		categoryService.add(category1);
		categoryService.add(category2);
		categoryService.add(category3);
		categoryService.read();
		categoryService.remove(1);
		System.out.println("Ingrese el id del elemento a buscar");
		long id = in.nextLong();
		System.out.println("Ingrese un nombre ");
		String name = in.nextLine();
		in.next();
		System.out.println("Ingrese una descripcion");
		String description = in.nextLine();
		in.next();
		Category newCategory = new Category(id,name,description);
		categoryService.modify(id, newCategory);
		System.out.println("modificado");
		categoryService.read();
	}

}
