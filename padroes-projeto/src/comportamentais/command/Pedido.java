package comportamentais.command;

import java.math.BigDecimal;

public class Pedido {
    private int quantidadeItens;
    private BigDecimal valorTotal;

    public Pedido(int quantidadeItens, BigDecimal valorTotal) {
        this.quantidadeItens = quantidadeItens;
        this.valorTotal = valorTotal;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }
}
