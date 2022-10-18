package comportamentais.observer;

public class EnviarPedidoPorEmail implements AcaoAposGerarPedido {
    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("Enviando pedido por email");
    }
}
