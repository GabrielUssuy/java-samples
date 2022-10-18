package comportamentais.state;

public class TesteState {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.aprovar();
        pedido.finalizar();
    }
}
