package byzen.modelo.bean;

public class Articulo {
	
	private int idArticulo;
	private String Articulo;
	private String descripcion;
	private float precio;
	private int stock;
	private String foto;
	private int idCategoria;
	private int idProveedor;
	public int getIdArticulo() {
		return idArticulo;
	}
	public void setIdArticulo(int idArticulo) {
		this.idArticulo = idArticulo;
	}
	public String getArticulo() {
		return Articulo;
	}
	public void setArticulo(String articulo) {
		Articulo = articulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public int getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}
	public int getIdProveedor() {
		return idProveedor;
	}
	public void setIdProveedor(int idProveedor) {
		this.idProveedor = idProveedor;
	}
	
	
	
	
	

}
