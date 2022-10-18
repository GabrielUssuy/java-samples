package criacionais.builder;

import java.math.BigDecimal;

public class Pedido {
    private BigDecimal valorTotal;
    private BigDecimal totalDisconto;
    private boolean possuiDesconto;

    public static PedidoBuilder builder() {
        return new PedidoBuilder();
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public BigDecimal getTotalDisconto() {
        return totalDisconto;
    }

    public void setTotalDisconto(BigDecimal totalDisconto) {
        this.totalDisconto = totalDisconto;
    }

    public boolean isPossuiDesconto() {
        return possuiDesconto;
    }

    public void setPossuiDesconto(boolean possuiDesconto) {
        this.possuiDesconto = possuiDesconto;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "valorTotal=" + valorTotal +
                ", totalDisconto=" + totalDisconto +
                ", possuiDesconto=" + possuiDesconto +
                '}';
    }
}
