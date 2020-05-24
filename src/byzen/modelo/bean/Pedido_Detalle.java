package byzen.modelo.bean;

import java.util.Date;

public class Pedido_Detalle {
	
	private int idPedidoDetalle;
	private int idCliente;
	private Date fechaPedido;
	public int getIdPedidoDetalle() {
		return idPedidoDetalle;
	}
	public void setIdPedidoDetalle(int idPedidoDetalle) {
		this.idPedidoDetalle = idPedidoDetalle;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public Date getFechaPedido() {
		return fechaPedido;
	}
	public void setFechaPedido(Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}
	

	
	
	
}
