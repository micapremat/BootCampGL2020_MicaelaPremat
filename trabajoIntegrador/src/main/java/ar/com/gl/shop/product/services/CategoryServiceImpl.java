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
		for(int i = 0; i < listCategory.getListaCategorias().size(); i++) {
			System.out.println("id categoria: " + listCategory.getListaCategorias().get(i).getId());
			System.out.println("nombre: " + listCategory.getListaCategorias().get(i).getName());
			System.out.println("descripcion: " + listCategory.getListaCategorias().get(i).getDescription());
		}
	}
		
	public void add(Category elemento) {
		listCategory.getListaCategorias().add(elemento);
	}
	
	public void remove(long id) {
		for(int i = 0; i < listCategory.getListaCategorias().size(); i++) {
			Category category = listCategory.getListaCategorias().get(i);
			if (category.getId() == id) {
				listCategory.getListaCategorias().remove(i);
			}
		}
	}
	
	public void modify(long idElementoBuscado, Category elemento) {
		boolean encontrado = false;
		for(int i = 0; i < listCategory.getListaCategorias().size(); i++) {
			Category category = listCategory.getListaCategorias().get(i);
			if (category.getId() == idElementoBuscado) {
				listCategory.getListaCategorias().set(i,elemento);
				encontrado = true;
			}
		}
		if(!encontrado) {
			System.out.println("El elemento no se encuentra en la lista");
		}
	}
}
