package ar.com.gl.shop.product.services;

import java.util.ArrayList;
import java.util.Iterator;

import ar.com.gl.shop.product.model.Product;
import ar.com.gl.shop.product.model.Stock;
import ar.com.gl.shop.product.repository.RepositoryImpl;

public class StockServiceImpl {

	RepositoryImpl listStock;
	
	public ArrayList<Stock> create(){
		//this.listStock.getListaStock();
		return this.listStock.getInstance().getListaStock();
	}
	
	public ArrayList<Stock> read() {
		Iterator<Stock> stock = listStock.getInstance().getListaStock().iterator();
		while(stock.hasNext()) {
			Stock elem = stock.next();
			System.out.println("ID stock: " + elem.getId());
			System.out.println("Cantidad: " + elem.getQuantity());
			System.out.println("Código de localidad: " + elem.getLocationCode());
		}
		return listStock.getInstance().getListaStock();
	}
		
	public boolean add(Stock elemento) {
		for(Stock listStock: listStock.getInstance().getListaStock()) {
			if (listStock.getId() == elemento.getId()) {
				System.out.println("ID repetido");
				return false;
			}
		}
		System.out.println(listStock.getInstance().getListaStock().add(elemento));
		return listStock.getInstance().getListaStock().add(elemento);
	}
	
	public String remove(long id) {
		Iterator<Stock> stock = listStock.getInstance().getListaStock().iterator();
		while(stock.hasNext()) {
			Stock elem = stock.next();
			if (elem.getId() == id) {
				stock.remove();
				return "El elemento con ID: " + id + " ha sido eiminado";
			}
		}
		return "El elemento con ID: " + id + " no se encuentra";
	}
	
	public String update(long idElementoBuscado, Stock elemento) {
		boolean encontrado = false;
		Iterator<Stock> stock = listStock.getInstance().getListaStock().iterator();
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
			return "El elemento con ID: " + idElementoBuscado + " no se encuentra en la lista";
		}else {
			return "El elemento: " + idElementoBuscado + " ha sido modificado corrctamente";
		}
	}
}
