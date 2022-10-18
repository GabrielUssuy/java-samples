package estruturais.adapter;

public class GeraNotaFiscalAdapter {
    public void executa(PedidoDTO pedido) {
        System.out.println("Adaptando pedido");
        new GeraNotaFiscal().executa(new Pedido());
    }
}
