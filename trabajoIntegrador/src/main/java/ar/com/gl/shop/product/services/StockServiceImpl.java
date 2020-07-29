package ar.com.gl.shop.product.services;

import java.util.ArrayList;
import java.util.Iterator;

import ar.com.gl.shop.product.model.Stock;
import ar.com.gl.shop.product.repository.RepositoryImpl;

public class StockServiceImpl {

	RepositoryImpl listStock;
	
	public ArrayList<Stock> create(){
		this.listStock = new RepositoryImpl();
		return this.listStock.getListaStock();
	}
	
	public void read() {
		Iterator<Stock> stock = listStock.getListaStock().iterator();
		while(stock.hasNext()) {
			Stock elem = stock.next();
			System.out.println("ID stock: " + elem.getId());
			System.out.println("Cantidad: " + elem.getQuantity());
			System.out.println("Código de localidad: " + elem.getLocationCode());
		}
	}
		
	public void add(Stock elemento) {
		listStock.getListaStock().add(elemento);
	}
	
	public void remove(long id) {
		Iterator<Stock> stock = listStock.getListaStock().iterator();
		while(stock.hasNext()) {
			Stock elem = stock.next();
			if (elem.getId() == id) {
				listStock.getListaStock().remove(elem);
			}
		}
	}
	
	public void modify(long idElementoBuscado, Stock elemento) {
		boolean encontrado = false;
		Iterator<Stock> stock = listStock.getListaStock().iterator();
		while(stock.hasNext()) {
			Stock elem = stock.next();
			if (elem.getId() == idElementoBuscado) {
				elem.setId(idElementoBuscado);
				elem.setQuantity(elemento.getQuantity());
				elem.setLocationCode(elemento.getLocationCode());
				encontrado = true;
			}
		}
		if(!encontrado) {
			System.out.println("El elemento no se encuentra en la lista");
		}
	}
}
