import java.util.ArrayList;
import java.util.Scanner;

import ar.com.gl.shop.product.model.Category;
import ar.com.gl.shop.product.model.Stock;
import ar.com.gl.shop.product.repository.RepositoryImpl;
import ar.com.gl.shop.product.services.CategoryServiceImpl;
import ar.com.gl.shop.product.services.StockServiceImpl;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		CategoryServiceImpl categoryService = new CategoryServiceImpl();
		StockServiceImpl stockService = new StockServiceImpl();
		
		RepositoryImpl repository = new RepositoryImpl();
		
		Category category1 = new Category(1,"Categoria 1","descripcion1");
		Category category2 = new Category(2,"Categoria 2","descripcion2");
		Category category3 = new Category(3,"Categoria 3","descripcion3");
		
		Stock stock1 = new Stock(1,20,"2354");
		Stock stock2 = new Stock(2,10,"6985");
		Stock stock3 = new Stock(3,40,"9878");
		
		ArrayList<Category> listaCategory= categoryService.create();
		ArrayList<Stock> listaStock= stockService.create();
		
		categoryService.add(category1);
		categoryService.add(category2);
		categoryService.add(category3);
		//categoryService.read();
		categoryService.remove(1);
		
		stockService.add(stock1);
		stockService.add(stock2);
		stockService.add(stock3);
		stockService.read();
		stockService.remove(2);
		stockService.read();
		System.out.println("Ingrese el id del elemento a buscar");
		long id = in.nextLong();
		in.nextLine();
		System.out.println("Ingrese una cantidad ");
		int quantity = in.nextInt();
		in.nextLine();
		System.out.println("Ingrese un codigo de localidad");
		String locationCode = in.nextLine();
		
		Stock newStock = new Stock(id,quantity,locationCode);
		stockService.modify(id, newStock);
		System.out.println("modificado");
		stockService.read();
	}

}
