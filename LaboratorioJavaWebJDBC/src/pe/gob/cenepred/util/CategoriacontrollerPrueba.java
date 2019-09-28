package pe.gob.cenepred.util;

import java.util.Collection;

import pe.gob.cenepred.excepcion.DAOExcepcion;
import pe.gob.cenepred.modelo.Categoria;
import pe.gob.cenepred.negocio.CategoriaController;

public class CategoriacontrollerPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		CategoriaController categoriaController = new CategoriaController();
		
		try {
			Collection<Categoria> listaCategoria = categoriaController.buscarPorNombre("Farma") ;
			
			for (Categoria categoria:listaCategoria) {

				System.out.println("Mostrando datos :" );
				System.out.println("Nombre  :" + categoria.getNombre());
				System.out.println("Descripcion  :" +categoria.getDescripcion());
			}
		
		} catch (DAOExcepcion e) {
			// TODO Auto-generated catch block
			System.out.println("Error conexion");
			e.printStackTrace();
			
		}
		
		
		
		

	}

}
