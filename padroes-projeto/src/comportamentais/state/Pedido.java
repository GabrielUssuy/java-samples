package comportamentais.state;

public class Pedido {
    private StatusPedido statusPedido;

    public Pedido() {
        this.statusPedido = new Pendente();
    }

    public StatusPedido getStatusPedido() {
        return statusPedido;
    }

    public void aprovar() {
        this.statusPedido.aprovar(this);
    }

    public void reprovar() {
        this.statusPedido.reprovar(this);
    }

    public void finalizar() {
        this.statusPedido.finalizar(this);
    }
    public void setStatusPedido(StatusPedido statusPedido) {
        this.statusPedido = statusPedido;
    }
}
