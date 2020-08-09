package ar.com.gl.shop.product.services;

import java.util.ArrayList;

import ar.com.gl.shop.product.model.Category;
import ar.com.gl.shop.product.repository.RepositoryImpl;

public class CategoryServiceImpl{
	RepositoryImpl listCategory;
	
	public ArrayList<Category> create(){
		//this.listCategory.getInstance();
		return this.listCategory.getInstance().getListaCategorias();
	}
	
	public ArrayList<Category> read() {
		for(Category listCat: listCategory.getInstance().getListaCategorias() ) {
			System.out.println("ID Categoría: " + listCat.getId());
			System.out.println("Nombre: " + listCat.getName());
			System.out.println("Descripción: " + listCat.getDescription());
		}
		return this.listCategory.getInstance().getListaCategorias();
	}
		
	public boolean add(Category elemento) {
		for(Category listCat: listCategory.getInstance().getListaCategorias()) {
			if (listCat.getId() == elemento.getId()) {
				System.out.println("ID repetido");
				return false;
			}
		}
		System.out.println(listCategory.getInstance().getListaCategorias().add(elemento));
		return listCategory.getInstance().getListaCategorias().add(elemento);
	}
	
	public String remove(long id) {
		for(Category listCat: new ArrayList<Category>(listCategory.getInstance().getListaCategorias()) ) {
			if (listCat.getId() == id) {
				listCategory.getInstance().getListaCategorias().remove(listCat);
				return "El elemento con ID: " + id + " ha sido eiminado";
			}
			
		}
		return "El elemento con ID: " + id + " no se encuentra";
	}
	
	public String update(long idElementoBuscado, Category elemento) {
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
			return "El elemento con ID: " + idElementoBuscado + " no se encuentra en la lista";
		}else {
			return "El elemento: " + idElementoBuscado + " ha sido modificado corrctamente";
		}
	}
}
