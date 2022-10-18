package comportamentais.state;



public class Pendente extends StatusPedido {

    @Override
    public void aprovar(Pedido pedido) {
        pedido.setStatusPedido(new Aprovado());
    }

    @Override
    public void reprovar(Pedido pedido) {
        pedido.setStatusPedido(new Reprovado());
    }
}
