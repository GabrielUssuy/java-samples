package comportamentais.state;

public class Aprovado extends StatusPedido {

    public void finalizar(Pedido pedido) {
        pedido.setStatusPedido(new Finalizado());
    }

}
