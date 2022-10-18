package criacionais.builder;

import java.math.BigDecimal;

public class PedidoBuilder {

    private BigDecimal valorTotal;
    private BigDecimal totalDisconto;
    private boolean possuiDesconto;

    public PedidoBuilder() {
        this.valorTotal = BigDecimal.ZERO;
        this.totalDisconto = BigDecimal.ZERO;
        this.possuiDesconto = false;
    }

    public PedidoBuilder withValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
        return this;
    }

    public PedidoBuilder withTotalDisconto(BigDecimal totalDisconto) {
        this.totalDisconto = totalDisconto;
        this.possuiDesconto = true;
        return this;
    }

    public Pedido build() {
        Pedido pedido = new Pedido();
        pedido.setValorTotal(this.valorTotal);
        pedido.setTotalDisconto(this.totalDisconto);
        pedido.setPossuiDesconto(this.possuiDesconto);
        return pedido;
    }
}
