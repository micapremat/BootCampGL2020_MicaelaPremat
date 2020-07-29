package ar.com.gl.shop.product.services;

import java.util.ArrayList;

import ar.com.gl.shop.product.model.Stock;
import ar.com.gl.shop.product.repository.RepositoryImpl;

public class StockServiceImpl {

	RepositoryImpl listStock;
	
	public ArrayList<Stock> create(){
		this.listStock = new RepositoryImpl();
		return this.listStock.getListaStock();
	}
	
	public void read() {
		for(int i = 0; i < listStock.getListaStock().size(); i++) {
			System.out.println("ID stock: " + listStock.getListaStock().get(i).getId());
			System.out.println("Cantidad: " + listStock.getListaStock().get(i).getQuantity());
			System.out.println("Codigo de localidad: " + listStock.getListaStock().get(i).getLocationCode());
		}
	}
		
	public void add(Stock elemento) {
		listStock.getListaStock().add(elemento);
	}
	
	public void remove(long id) {
		for(int i = 0; i < listStock.getListaStock().size(); i++) {
			Stock stock = listStock.getListaStock().get(i);
			if (stock.getId() == id) {
				listStock.getListaStock().remove(i);
			}
		}
	}
	
	public void modify(long idElementoBuscado, Stock elemento) {
		boolean encontrado = false;
		for(int i = 0; i < listStock.getListaStock().size(); i++) {
			Stock stock = listStock.getListaStock().get(i);
			if (stock.getId() == idElementoBuscado) {
				listStock.getListaStock().set(i,elemento);
				encontrado = true;
			}
		}
		if(!encontrado) {
			System.out.println("El elemento no se encuentra en la lista");
		}
	}
}
