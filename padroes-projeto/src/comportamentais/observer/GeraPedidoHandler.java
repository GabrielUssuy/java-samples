package comportamentais.observer;

import java.math.BigDecimal;
import java.util.List;

public class GeraPedidoHandler {
    private List<AcaoAposGerarPedido> acoes;

    public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    public void geraPedido(int quantidadeItes, BigDecimal valor) {
        Pedido pedido = new Pedido(quantidadeItes, valor);
        acoes.forEach(acaoAposGerarPedido -> acaoAposGerarPedido.executarAcao(pedido));
    }
}
