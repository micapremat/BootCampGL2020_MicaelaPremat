package ar.com.gl.shop.product.services;

import java.util.ArrayList;

import ar.com.gl.shop.product.model.Category;
import ar.com.gl.shop.product.repository.RepositoryImpl;

public class CategoryServiceImpl{
	RepositoryImpl listCategory;
	
	public ArrayList<Category> create(){
		this.listCategory = new RepositoryImpl();
		return this.listCategory.getListaCategorias();
	}
	
	public void read() {
		for(Category listCat: listCategory.getListaCategorias() ) {
			System.out.println("ID Categoría: " + listCat.getId());
			System.out.println("Nombre: " + listCat.getName());
			System.out.println("Descripción: " + listCat.getDescription());
		}
	}
		
	public void add(Category elemento) {
		listCategory.getListaCategorias().add(elemento);
	}
	
	public void remove(long id) {
		for(Category listCat: new ArrayList<Category>(listCategory.getListaCategorias()) ) {
			if (listCat.getId() == id) {
				listCategory.getListaCategorias().remove(listCat);
			}
		}
	}
	
	public void modify(long idElementoBuscado, Category elemento) {
		boolean encontrado = false;
		for(Category listCat: listCategory.getListaCategorias() ) {
			if (listCat.getId() == idElementoBuscado) {
				listCat.setId(idElementoBuscado);
				listCat.setDescription(elemento.getDescription());
				listCat.setName(elemento.getName());
				encontrado = true;
			}
		}
		if(!encontrado) {
			System.out.println("El elemento con ID: " + idElementoBuscado + " no se encuentra en la lista");
		}
	}
}
