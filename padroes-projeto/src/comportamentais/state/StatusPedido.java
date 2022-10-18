package comportamentais.state;

public abstract class StatusPedido {
    public void aprovar(Pedido pedido) {
        throw new RuntimeException("Pedido não pode ser aprovado");
    }

    public void reprovar(Pedido pedido) {
        throw new RuntimeException("Pedido não pode ser reprovado");
    }

    public void finalizar(Pedido pedido) {
        throw new RuntimeException("Pedido não pode ser finalizado");
    }
}
