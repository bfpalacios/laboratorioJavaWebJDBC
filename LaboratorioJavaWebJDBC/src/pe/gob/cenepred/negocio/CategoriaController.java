package pe.gob.cenepred.negocio;


import java.util.Collection;

import pe.gob.cenepred.dao.CategoriaDAO;
import pe.gob.cenepred.excepcion.DAOExcepcion;
import pe.gob.cenepred.modelo.Categoria;



public class CategoriaController {
	
	public CategoriaController() {}
	
	public Collection<Categoria> buscarPorNombre(String nombre)
			throws DAOExcepcion {
		
		//DAO
		CategoriaDAO categoriaDAO = new CategoriaDAO();
		
		
	return categoriaDAO.buscarPorNombre(nombre);
	
	
	}

	public Categoria insertar(String nombre, String descripcion)
			throws DAOExcepcion {
		CategoriaDAO dao = new CategoriaDAO();

		Categoria vo = new Categoria();
		vo.setNombre(nombre);
		vo.setDescripcion(descripcion);

		return dao.insertar(vo);
	}

	public Categoria obtener(int idCategoria) throws DAOExcepcion {
		CategoriaDAO dao = new CategoriaDAO();
		return dao.obtener(idCategoria);
	}

	public void eliminar(int idCategoria) throws DAOExcepcion {
		CategoriaDAO dao = new CategoriaDAO();
		dao.eliminar(idCategoria);
	}

	public Categoria actualizar(int idCategoria, String nombre,
			String descripcion) throws DAOExcepcion {
		CategoriaDAO dao = new CategoriaDAO();

		Categoria vo = new Categoria();
		vo.setIdCategoria(idCategoria);
		vo.setNombre(nombre);
		vo.setDescripcion(descripcion);

		return dao.actualizar(vo);
	}

	public Collection<Categoria> listar() throws DAOExcepcion {
		CategoriaDAO dao = new CategoriaDAO();
		return dao.listar();
	}

}
 
