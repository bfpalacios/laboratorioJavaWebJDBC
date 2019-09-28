package pe.gob.cenepred.test;


import java.util.Collection;
import junit.framework.Assert;
import pe.gob.cenepred.excepcion.DAOExcepcion;
import pe.gob.cenepred.modelo.Categoria;
import pe.gob.cenepred.negocio.CategoriaController;
 

public class CategoriaControllerTest {

	//@Test
	public void insertarTest() {

		CategoriaController negocio = new CategoriaController();

		try {
			negocio.insertar("Electrónicos", "Categoria de electrónicos");

			Categoria nuevo = negocio.obtener(7);

			Assert.assertEquals("Categoria de electrónicos", nuevo.getDescripcion());

		} catch (DAOExcepcion e) {
			Assert.fail("Fallo la inserción: " + e.getMessage());
		}
	}
	
	

//	@Test
	public void actualizarTest() {

		CategoriaController negocio = new CategoriaController();

		try {

			negocio.actualizar(7, "Electrónicos", "Categoria de electrónicos 2");

			Categoria nuevo = negocio.obtener(7);

			Assert.assertEquals("Categoria de electrónicos 2", nuevo.getDescripcion());

		} catch (DAOExcepcion e) {

			Assert.fail("Falló la actualización: " + e.getMessage());

		}
	}
	
//	@Test
	public void listarTest() {

		CategoriaController negocio = new CategoriaController();

		try {
			Collection<Categoria> listado = negocio.listar();

			System.out.println(listado.size());

			Assert.assertTrue(listado.size() > 0);

		} catch (DAOExcepcion e) {

			Assert.fail("Falló el listado: " + e.getMessage());

		}

	}

//	@Test
	public void eliminarTest() {

		CategoriaController negocio = new CategoriaController();

		try {

			negocio.eliminar(8);

			Categoria nuevo = negocio.obtener(8);

			Assert.assertEquals(null, nuevo.getDescripcion());

		} catch (DAOExcepcion e) {

			Assert.fail("Falló la eliminición: " + e.getMessage());

		}

	}


}

