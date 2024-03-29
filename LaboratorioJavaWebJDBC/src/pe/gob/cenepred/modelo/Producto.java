package pe.gob.cenepred.modelo;
 
public class Producto {
	
	private int idProducto;
	private Categoria categoria;
	private String nombre;
	private String descripcion;
	private double precio;
	private int stock;
	private int importancia;
	private String imagen;

	
	// 2. Generar constructor con campos
	// 3. Generar getters y setters
	// 1. Escribir constructor vacío
	Producto() {}
	
	// 2. Generar constructor con campos 
	public Producto(int idProducto, Categoria categoria, String nombre, String descripcion, double precio, int stock,
			int importancia, String imagen) {
		super();
		this.idProducto = idProducto;
		this.categoria = categoria;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.stock = stock;
		this.importancia = importancia;
		this.imagen = imagen;
	}
	

	// 3. Generar getters y setters  
	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getImportancia() {
		return importancia;
	}

	public void setImportancia(int importancia) {
		this.importancia = importancia;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	

}
