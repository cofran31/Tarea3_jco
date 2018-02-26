public class PedidoContado 
{ 
 public PedidoContado(double importe)
 {
   super(importe);
 }
 
 public void paga()
 {
 System.out.println("El pago del pedido por importe de:" + importe + " Se ha realizado ");
 }
 public booblean valida()
 {
 return true;
 }
} 

