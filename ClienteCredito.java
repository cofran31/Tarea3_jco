public class ClienteCredito extends Cliente
{ 
  protected Pedido crearPedido(double importe)
  {
  return new PedidoCredito(importe);
  }
}
