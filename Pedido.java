public abstract class Pedido 
{ 
 protected double importe;
 
 public Pedido(double importe)
 {
   this.importe = importe;
 }
 
 public abstract booblean valida();
 
 public abstract void paga();
} 
 
