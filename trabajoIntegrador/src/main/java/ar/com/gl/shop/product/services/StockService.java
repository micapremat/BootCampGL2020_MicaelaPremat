package ar.com.gl.shop.product.services;

import java.util.ArrayList;

import ar.com.gl.shop.product.model.Stock;
import ar.com.gl.shop.product.repository.RepositoryImpl;

public interface StockService {
	public void read();

	public void add(Stock stoc);

	public ArrayList<Stock> create();

	public void modify(long pos, Stock stoc);

	public void remove(long buscar);
	
}
