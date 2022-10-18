package comportamentais.observer;

public class SalvarPedidoNoBanco implements AcaoAposGerarPedido {
    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("Salvando pedido no banco");
    }
}
